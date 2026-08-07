#!/usr/bin/env python3

import argparse
import subprocess
import os, shutil
import re
import logging
import sys
import xml.dom.minidom

isWindows = sys.platform.startswith("win")

def main():

    parser = argparse.ArgumentParser(
        formatter_class=argparse.RawTextHelpFormatter
    )

    parser.add_argument("-t","--targethpcchost", default="localhost",
        help='''
            HPCC Host to fetch WSDLs
            default: localhost
            '''
    )

    parser.add_argument("-p","--hpccport", default="8010",
        help='''
            HPCC Port to fetch WSDLs
            default: 8010
            '''
    )

    parser.add_argument("-e","--esdlwsdl", action="store_true",
        help="Generate WSDLs from ESDL"
    )

    parser.add_argument("-s","--service", default="all",
        help='''
            Service to target for wsdl generation
            default: all
            example: wsdfu
            '''
    )
    parser.add_argument("-b","--branch", default="master",
        help='''
            Branch to target for wsdl generation
            default: master
            example: hpcc4j-8.8.X
            '''
    )
    parser.add_argument("-u","--user", default="hpcc-systems",
        help='''
            User for repository fetch
            default: hpcc-systems
            example: mygithubusername
            '''
    )
    parser.add_argument("-v","--verbose", action="store_true",
        help="Give more verbose information"
    )
    parser.add_argument("-d","--debug", action="store_true",
        help="Ouput debugging information"
    )
    parser.add_argument("-l","--list-services", action="store_true",
        help="List available services for stubcode generation"
    )
    
    args = parser.parse_args()

    # list of repositories
    repositories = ['HPCC-Platform', 'hpcc4j']
    buildfromESDL = False

    # list of service to ecm file tuples
    # 1) general service name
    # 2) emc file name
    # 3) wsdl file prefix
    # 4) ESP service URI
    # 5) None ECLWatch port
    services = [
                ("wsattributes", None, "WsAttributes", "wsattributes", None),
                ("wscodesign", "ws_codesign.ecm", "Ws_codesign", "ws_codesign", None),
                ("wsdfu", "ws_dfu.ecm", "WsDFU", "wsdfu", None),
                ("wsdfuxref", "ws_dfuXref.ecm", "WsDFUXRef", "wsdfuxref", None),
                ("wsfileio", "ws_fileio.ecm", "WsFileIO", "wsfileio", None),
                ("filespray", "ws_fs.ecm", "WsFileSpray", "filespray", None),
                ("wspackageprocess", "ws_packageprocess.ecm", "WsPackageProcess", "wspackageprocess", None),
                ("wsresources", "ws_resources.ecm", "WsResources", "wsresources", None),
                ("wssmc", "ws_smc.ecm", "WsSMC", "wssmc", None),
                ("wssql", "ws_sql.ecm", "WsSQL", "wssql", "8510"),
                ("wsstore", "ws_store.ecm", "WsStore", "wsstore", None),
                ("wstopology", "ws_topology.ecm", "WsTopology", "wstopology", None),
                ("wsworkunits", "ws_workunits.ecm", "WsWorkunits", "wsworkunits", None),
                #("wsdali", "ws_dali.ecm", "WsDali", "wsdali", None),
                ("wscloud", "ws_cloud.ecm", "WsCloud", "wscloud", None),
    ]

    if args.verbose:
        logging.basicConfig(level=logging.INFO)
    elif args.debug:
        logging.basicConfig(level=logging.DEBUG)

    if args.esdlwsdl:
        print("Will generate WSDLs from local ESDL executable")
        buildfromESDL = True

    if args.list_services:
        print("The following services are available for stubcode generation:")
        for service_name, _, _, _, _ in services:
            print(f"{service_name}")
        return

    if buildfromESDL == True:
        esdl_location = which("esdl")
        if (esdl_location == None) :
            print("Executable 'esdl' is required!")
            print("Can be built from source, or installed by clienttools")
            print("Ensure executable's directory is on PATH")
            return
        print("Will clone HPCC-Platform and hpcc4j on current working directory")
        for i in repositories:
            if args.user != "hpcc-systems":
                if os.path.exists(i):
                    try:
                        shutil.rmtree(i)
                    except OSError as e:
                        logging.error(f"Failed to remove repository directory at {i}: {e}")
                        raise
            if os.path.isdir(i):
                checkout_branch(i, args.branch)
            else:
                fetch_repository(i, args.user, args.branch,)

            print("Building local hpcc_commons...")
            generate_commons_dependency()
    else:
        if not isWsClientDirAvailable():
            print("Working Directory does not appear to be contain wsclient source code directory")
            return

    print("Building local wsclient...")
    build_hpcc4j()
    print("Done...")

    selected_services = [
        (service_name, ecm_file, wsdl_prefix, service_uri, non_eclwatch_port)
        for service_name, ecm_file, wsdl_prefix, service_uri, non_eclwatch_port in services
        if args.service == "all" or service_name == args.service
    ]

    service_ready = {}

    for service_name, ecm_file, wsdl_prefix, service_uri, non_eclwatch_port in selected_services:
        if ecm_file == None:
            continue

        targetPort = args.hpccport
        if (non_eclwatch_port != None):
            targetPort = non_eclwatch_port

        version = None
        if buildfromESDL == False:
            version = request_runtime_wsdl_version(service_name, service_uri, "http", args.targethpcchost, targetPort)
        else:
            version = request_wsdl_version(service_name, ecm_file)

        print("-----------------------------")
        print(f"service : {service_name}")
        print(f"version : {version}")
        print(f"wsdl : {wsdl_prefix}.wsdl ")
        wsdl_files = get_wsdl_files(wsdl_prefix)
        print(f"wsdl files : {wsdl_files}")
        wsdl_found = False
        version_stripped = str(version).replace('.','')
        print(f"Version stripped = {version_stripped}")
        if version == None:
            logging.warning(f"Version for {service_name} is None, skipping generation")
            service_ready[service_name] = False
            continue
        for file in wsdl_files:
            if version_stripped in file:
                wsdl_found = True
        if not wsdl_found:
            #generate wsdl & new stubcode
            if buildfromESDL == True:
                print(f"Generating WSDLs for {service_name}...")
                generate_wsdl(service_name, ecm_file, wsdl_prefix, version)
            else:
                print(f"Fetching WSDL for {service_name}...")
                fetch_wsdl(service_name, service_uri, wsdl_prefix, "http", args.targethpcchost, targetPort, version)
            print(f"Cleaning up previous stub for {wsdl_prefix}...")
            remove_latest_stub(service_name)
            print(f"Generating latest stub for {wsdl_prefix}-{version}...")
            stub_return = generate_stubcode(service_name)
            if stub_return != 0:
                logging.error(f"Stub generation failed for {service_name} with exit code {stub_return}")
                service_ready[service_name] = False
                continue
            #break

        stub_dir = f"{os.getcwd()}/wsclient/src/main/java/org/hpccsystems/ws/client/gen/axis2/{service_name}/latest"
        has_stub = False
        if os.path.isdir(stub_dir):
            for filename in os.listdir(stub_dir):
                if filename.endswith("Stub.java") and filename != "BaseServiceStub.java":
                    has_stub = True
                    break
        if not has_stub:
            logging.error(f"Generated stub package for {service_name} is missing expected *Stub.java class; skipping wrappers for {service_name}")

        service_ready[service_name] = has_stub

    #print(f"Rebuilding wsclient...")
    #build_hpcc4j()

    wsclient_classpath = get_wsclient_runtime_classpath()
    if wsclient_classpath == None:
        print("Could not generate wsclient classpath!")
        return
    else:
        print("Cleaning previous wsclient generated build artifacts...")
        clean_wsclient_generated_artifacts()
        print("Compiling wrapper generator utility classes...")
        wrapper_util_rc = compile_wrapper_generator_prereqs(wsclient_classpath)
        if wrapper_util_rc != 0:
            raise RuntimeError(f"Wrapper generator utility compile failed with exit code {wrapper_util_rc}")

        for service_name, ecm_file, wsdl_prefix, service_uri, non_eclwatch_port in selected_services:

            if not service_ready.get(service_name, False):
                print(f"Skipping wrapper generation for {service_name} because stubs are not ready")
                continue

            print(f"Compiling generated stubs for {service_name} before wrapper generation...")
            stub_compile_rc, discovered_stub_name, compile_output = compile_stub_sources_for_service(service_name, wsclient_classpath)
            if stub_compile_rc != 0:
                output_detail = ""
                if compile_output:
                    tail_lines = compile_output[-20:] if len(compile_output) > 20 else compile_output
                    output_detail = "\nLast compiler output:\n" + "".join(tail_lines)
                raise RuntimeError(f"Stub compile failed for service '{service_name}' (stub name '{discovered_stub_name}') with exit code {stub_compile_rc}.{output_detail}")

            classes_ok, class_validation_error = verify_compiled_service_classes(service_name)
            if not classes_ok:
                raise RuntimeError(f"Compiled class validation failed for service '{service_name}': {class_validation_error}")

            wrapper_service_name = discover_wrapper_service_name(service_name, wsdl_prefix)
            regenerate_wrappers_for_service(service_name, wrapper_service_name, wsclient_classpath)
            print("Done...")

    print(f"Building wsclient after WSDL based changes...")
    build_hpcc4j()
    print("Done...")

    # cleanup environment
    if os.path.exists('tmpversion.txt'):
        os.remove('tmpversion.txt')
    if os.path.exists('wsclient/wsclient_classpath.txt'):
        os.remove('wsclient/wsclient_classpath.txt')

# end main()
################################################################################
# helper functions
################################################################################

def clean_wsclient_generated_artifacts():
    """Remove compiled artifacts for generated stubs and wrapper utility classes
    to prevent stale or corrupt .class files from interfering with wrapper generation."""
    import glob

    working_directory = f"{os.getcwd()}/wsclient"
    gen_classes_root = f"{working_directory}/target/classes/org/hpccsystems/ws/client/gen"
    utils_out_dir = f"{working_directory}/target/classes/org/hpccsystems/ws/client/utils"

    if os.path.isdir(gen_classes_root):
        try:
            shutil.rmtree(gen_classes_root)
            print(f"Cleaned generated stub class artifacts: {gen_classes_root}")
        except OSError as e:
            logging.error(f"Failed to clean generated stub class artifacts at {gen_classes_root}: {e}")
            raise

    for stale_class in glob.glob(f"{utils_out_dir}/Axis2ADBStubWrapperMaker*.class"):
        try:
            os.remove(stale_class)

        except OSError as e:
            logging.warning(f"Could not remove stale wrapper utility class: {stale_class}: {e}")


def isWsClientDirAvailable():
    cwd = os.getcwd()
    print(f"Current working directory: {cwd}")
    if (not os.path.exists(f"{cwd}/wsclient")):
        return False
    return True

def which(program):
    import os
    def is_exe(fpath):
        return os.path.isfile(fpath) and os.access(fpath, os.X_OK)

    fpath, fname = os.path.split(program)
    if fpath:
        if is_exe(program):
            return program
    else:
        for path in os.environ["PATH"].split(os.pathsep):
            exe_file = os.path.join(path, program)
            if is_exe(exe_file):
                return exe_file

    return None

def remove_latest_stub(service):
    cwd = os.getcwd()
    latest_path = f"{cwd}/wsclient/src/main/java/org/hpccsystems/ws/client/gen/axis2/{service}/latest"
    if os.path.exists(latest_path):
        try:
            shutil.rmtree(latest_path)
        except OSError as e:
            logging.error(f"Failed to remove generated stub code at {latest_path}: {e}")
            raise
    else:
        logging.warning(f"Could not locate previous generated stub code for removal: {latest_path}")

def remove_generated_wrappers(service):
    cwd = os.getcwd()
    wrappers_path = f"{cwd}/wsclient/src/main/java/org/hpccsystems/ws/client/wrappers/gen/{service}"
    if os.path.exists(wrappers_path):
        try:
            shutil.rmtree(wrappers_path)
        except OSError as e:
            logging.error(f"Failed to remove generated wrapper code at {wrappers_path}: {e}")
            raise
    else:
        logging.warning(f"Could not locate previous generated wrapper code for removal: {wrappers_path}")

def restore_wrappers_from_backup(wrappers_backup_path, wrappers_path):
    if not os.path.exists(wrappers_backup_path):
        return

    # If wrapper generation partially recreated the folder, discard it before restore.
    if os.path.exists(wrappers_path):
        try:
            shutil.rmtree(wrappers_path)
        except OSError as e:
            logging.error(f"Failed to remove partial wrappers at {wrappers_path} during restore: {e}")
            raise

    try:
        shutil.move(wrappers_backup_path, wrappers_path)
    except OSError as e:
        logging.error(f"Failed to restore wrapper backup from {wrappers_backup_path} to {wrappers_path}: {e}")
        raise

def regenerate_wrappers_for_service(service_name, wrapper_service_name, wsclient_classpath):
    wrappers_path = f"{os.getcwd()}/wsclient/src/main/java/org/hpccsystems/ws/client/wrappers/gen/{service_name}"
    wrappers_backup_path = f"{wrappers_path}__backup"

    if os.path.exists(wrappers_backup_path):
        try:
            shutil.rmtree(wrappers_backup_path)
        except OSError as e:
            logging.error(f"Failed to remove old backup at {wrappers_backup_path}: {e}")
            raise

    if os.path.exists(wrappers_path):
        shutil.copytree(wrappers_path, wrappers_backup_path)

    print(f"Cleaning up previous wrappers for {service_name}...")
    remove_generated_wrappers(service_name)

    print(f"Generating latest stub wrappers for {wrapper_service_name}...")
    try:
        generate_wrappers(service_name, wrapper_service_name, wsclient_classpath)
        if os.path.exists(wrappers_backup_path):
            try:
                shutil.rmtree(wrappers_backup_path)
            except OSError as e:
                logging.error(f"Failed to remove successful backup at {wrappers_backup_path}: {e}")
                raise
    except Exception as ex:
        restore_wrappers_from_backup(wrappers_backup_path, wrappers_path)
        raise RuntimeError(f"Wrapper generation failed for '{service_name}': {ex}") from ex

def discover_wrapper_service_name(service_name, fallback_name):
    stub_dir = f"{os.getcwd()}/wsclient/src/main/java/org/hpccsystems/ws/client/gen/axis2/{service_name}/latest"
    if not os.path.isdir(stub_dir):
        return fallback_name

    try:
        for filename in os.listdir(stub_dir):
            if filename.endswith("Stub.java") and filename != "BaseServiceStub.java":
                return filename[:-9]  # strip "Stub.java"
    except Exception as ex:
        logging.warning(f"Could not discover stub classname for {service_name}: {ex}")

    return fallback_name

def normalize_wsdl_filename(wsdl_output_path, service, wsdl_pre):
    source_wsdl = f"{wsdl_output_path}/{service}.wsdl"
    target_wsdl = f"{wsdl_output_path}/{wsdl_pre}.wsdl"

    # On Windows, source and target can differ only by case (e.g. wsdfu.wsdl vs WsDFU.wsdl).
    # In that case they resolve to the same file, so removing target would delete source.
    source_norm = os.path.normcase(os.path.abspath(source_wsdl))
    target_norm = os.path.normcase(os.path.abspath(target_wsdl))
    if source_norm == target_norm:
        return target_wsdl

    # Use replace semantics so reruns can overwrite previous output cleanly.
    os.replace(source_wsdl, target_wsdl)
    return target_wsdl

def apply_wsdl_compatibility_fixes(wsdl_path):
    """Apply compatibility fixes to a WSDL and create a .notes file describing changes.

    Current rule set:
    - Convert xsd:uint64 / xsd:Uint64 to xsd:string to avoid downstream Java type issues.
    """
    if not os.path.exists(wsdl_path):
        logging.warning(f"WSDL not found, cannot apply compatibility fixes: {wsdl_path}")
        return 0

    with open(wsdl_path, "r", encoding="utf-8") as f:
        original_content = f.read()

    pattern = re.compile(r'type=(["\'])xsd:(?:uint64|Uint64)\1')
    changes = []

    for match in pattern.finditer(original_content):
        line_number = original_content.count("\n", 0, match.start()) + 1
        original_fragment = match.group(0)
        replacement_fragment = f'type={match.group(1)}xsd:string{match.group(1)}'
        changes.append((line_number, original_fragment, replacement_fragment))

    updated_content = pattern.sub(lambda m: f'type={m.group(1)}xsd:string{m.group(1)}', original_content)

    if updated_content != original_content:
        with open(wsdl_path, "w", encoding="utf-8") as f:
            f.write(updated_content)

    notes_path = f"{wsdl_path}.notes"

    if changes:
        notes_lines = [
            f"Auto-generated compatibility notes for {os.path.basename(wsdl_path)}",
            "",
            "Rule applied:",
            "type=\"xsd:uint64\" (or type=\"xsd:Uint64\") -> type=\"xsd:string\"",
            "",
            f"Total changes: {len(changes)}",
            "",
        ]
        for line_number, original_fragment, replacement_fragment in changes:
            notes_lines.append(f"line {line_number}: {original_fragment} -> {replacement_fragment}")

        with open(notes_path, "w", encoding="utf-8") as notes_file:
            notes_file.write("\n".join(notes_lines) + "\n")

        print(f"Applied {len(changes)} compatibility fix(es) to {os.path.basename(wsdl_path)}")
    else:
        if os.path.exists(notes_path):
            os.remove(notes_path)
        print(f"No compatibility fixes needed for {os.path.basename(wsdl_path)}")

    return len(changes)

def fetch_wsdl(service, service_uri, wsdl_pre, protocol, host, port, ver):
    wsdl_output_path = f"{os.getcwd()}/wsclient/src/main/resources/WSDLs"
    # rename old file
    simple_version = str(ver).replace('.','')
    dest = f"{wsdl_output_path}/{wsdl_pre}-{simple_version}.wsdl"
    fetch_wsdl_command = f"curl -s {protocol}://{host}:{port}/{service_uri}/?wsdl -o {wsdl_output_path}/{service}.wsdl -w %{{http_code}}"
    print(f"fetch_wsdl_command = {fetch_wsdl_command}")
    process = subprocess.run(fetch_wsdl_command.split(), timeout=120, stderr=subprocess.PIPE, stdout=subprocess.PIPE)
    if (process.returncode == 0 and process.stdout != None and process.stdout.decode('utf-8') == '200'):
        if os.path.exists(f"{wsdl_output_path}/{service}.wsdl"):
            xml_data = None
            try:
                with open(f"{wsdl_output_path}/{service}.wsdl", 'r') as f:
                    dom = xml.dom.minidom.parse(f) # or xml.dom.minidom.parseString(xml_string)
                    pretty_xml_as_string = dom.toprettyxml()

                with open(f"{wsdl_output_path}/{service}.wsdl", 'w') as f:
                    f.write(pretty_xml_as_string)
            except:
                print (f"Could not determine {service} version")

            target_wsdl = normalize_wsdl_filename(wsdl_output_path, service, wsdl_pre)
            shutil.copy2(target_wsdl, dest)

            apply_wsdl_compatibility_fixes(target_wsdl)
            apply_wsdl_compatibility_fixes(dest)
        else:
            logging.error("no wsdl generated")
        logging.debug(f"generate_wsdl({service}, {ver}) output to {wsdl_output_path}")
        with open(f"{wsdl_output_path}/{wsdl_pre}.wsdl", "r") as f:
            for line in f:
                logging.debug(line)
    else:
        print(f"Failed to retrieve {service} WSDL: HTTP code: '{process.stdout.decode('utf-8')}'")

def generate_wsdl(service, ecm, wsdl_pre, ver):
    # check ecm file exists
    full_ecm_file_path = f"{os.getcwd()}/HPCC-Platform/esp/scm/{ecm}"
    if not os.path.exists(full_ecm_file_path):
        logging.error(f"no file found at : {full_ecm_file_path}")
        exit()
    wsdl_output_path = f"{os.getcwd()}/hpcc4j/wsclient/src/main/resources/WSDLs"
    # rename old file
    simple_version = str(ver).replace('.','')
    dest = f"{wsdl_output_path}/{wsdl_pre}-{simple_version}.wsdl"
    generate_wsdl_command = f"esdl wsdl {full_ecm_file_path} {service} -iv {ver} --outdir {wsdl_output_path} --unversioned-ns"
    logging.debug(f"generate_wsdl_command = {generate_wsdl_command}")
    process = subprocess.run(generate_wsdl_command.split(), timeout=120)
    if os.path.exists(f"{wsdl_output_path}/{service}.wsdl"):
        target_wsdl = normalize_wsdl_filename(wsdl_output_path, service, wsdl_pre)
        shutil.copy2(target_wsdl, dest)

        apply_wsdl_compatibility_fixes(target_wsdl)
        apply_wsdl_compatibility_fixes(dest)
    else:
        logging.error("no wsdl generated")
    logging.debug(f"generate_wsdl({service}, {ecm}, {ver}) output to {wsdl_output_path}")
    with open(f"{wsdl_output_path}/{wsdl_pre}.wsdl", "r") as f:
        for line in f:
            logging.debug(line)
    
def generate_commons_dependency():
    generate_commons_dependency_command = f"mvn clean install -DskipTests"
    working_directory = f"{os.getcwd()}/hpcc4j/commons-hpcc"
    logging.debug(f"generate_commons_dependency_command = {generate_commons_dependency_command}")
    process = subprocess.Popen(generate_commons_dependency_command.split(), shell=isWindows, stdout=subprocess.PIPE, stderr=subprocess.STDOUT, cwd=working_directory)
    for line in process.stdout:
        logging.info(str(line, 'utf-8'))

def build_hpcc4j():
    build_hpcc4j_command = f"mvn compile -DskipTests"
    working_directory = f"{os.getcwd()}"
    logging.debug(f"build_hpcc4j_command = {build_hpcc4j_command}")
    process = subprocess.Popen(build_hpcc4j_command.split(), shell=isWindows, stdout=subprocess.PIPE, stderr=subprocess.PIPE, cwd=working_directory)
    stdout, stderr = process.communicate()
    if process.returncode == 0:
        print("HPCC4j build successful")
        print(stdout.decode("utf-8"))
    else:
        print("HPCC4j build failed")
        print(stdout.decode("utf-8"))
        print(stderr.decode("utf-8"))

def compile_stub_sources_for_service(service_name, dep_classpath):
    """Compile all generated gen/axis2/<service>/latest sources so wrapper
    generation can reflect over the stub and any sibling generated model types.

    Some services (for example wsworkunits) produce stubs that reference many
    additional generated top-level classes. Compiling only the main *Stub.java is
    insufficient and can fail with "cannot find symbol" errors for classes that do
    exist in the same generated package."""
    import glob
    working_directory = f"{os.getcwd()}/wsclient"
    src_dir = f"{working_directory}/src/main/java/org/hpccsystems/ws/client/gen/axis2/{service_name}/latest"
    out_dir = f"{working_directory}/target/classes"
    out_service_dir = f"{out_dir}/org/hpccsystems/ws/client/gen/axis2/{service_name}/latest"
    os.makedirs(out_dir, exist_ok=True)

    stub_name = discover_wrapper_service_name(service_name, "")
    if not stub_name:
        logging.error(f"Could not discover stub name for {service_name}")
        return (1, "<unknown>", [f"Error: Could not discover stub name for {service_name}"])
    
    main_stub = f"{src_dir}/{stub_name}Stub.java"
    if not os.path.exists(main_stub):
        logging.error(f"Main stub not found: {main_stub}")
        return (1, stub_name, [f"Error: Main stub not found at {main_stub}"])

    java_files = sorted(glob.glob(f"{src_dir}/*.java"))
    if not java_files:
        logging.error(f"No generated Java sources found in {src_dir}")
        return (1, stub_name, [f"Error: no generated Java sources found in {src_dir}"])

    logging.debug(f"Compiling {len(java_files)} generated stub files in package")

    # Remove stale service classes so old/corrupt artifacts cannot break wrapper generation.
    if os.path.isdir(out_service_dir):
        try:
            shutil.rmtree(out_service_dir)
        except OSError as e:
            logging.error(f"Failed to remove stale compiled classes at {out_service_dir}: {e}")
            raise

    import tempfile
    with tempfile.NamedTemporaryFile(mode='w', suffix='.txt', delete=False) as argfile:
        argfile_path = argfile.name
        argfile.write("\n".join(f'"{f.replace(os.sep, "/")}"' for f in java_files))

    try:
        compile_cmd = ["javac", "-cp", dep_classpath, "-d", out_dir, f"@{argfile_path}"]
        logging.debug(f"compile_stub_sources_for_service command: {compile_cmd}")
        process = subprocess.Popen(compile_cmd, stdout=subprocess.PIPE, stderr=subprocess.STDOUT, cwd=working_directory)
        output_lines = []
        for line in process.stdout:
            message = str(line, 'utf-8')
            print(message, end='')
            output_lines.append(message)
        return (process.wait(), stub_name, output_lines)
    finally:
        os.unlink(argfile_path)

def verify_compiled_service_classes(service_name):
    """Validate generated classfiles are parseable by javap.
    
    For performance, validates only the main *Stub.class and a small set of 
    known critical classes rather than every class. For large services (e.g., 
    wsworkunits), this reduces hundreds of subprocess calls to just a few.
    """
    import glob

    working_directory = f"{os.getcwd()}/wsclient"
    class_root = f"{working_directory}/target/classes"
    class_dir = f"{class_root}/org/hpccsystems/ws/client/gen/axis2/{service_name}/latest"
    if not os.path.isdir(class_dir):
        return (False, f"Compiled class directory does not exist: {class_dir}")

    class_files = sorted(glob.glob(f"{class_dir}/*.class"))
    if not class_files:
        return (False, f"No compiled classes found in {class_dir}")

    # Identify main stub and critical classes to validate (performance optimization)
    stub_class = None
    critical_patterns = ["Stub.class", "Exception.class"]
    critical_classes_to_check = []

    for class_file in class_files:
        basename = os.path.basename(class_file)
        if basename.endswith("Stub.class") and basename != "BaseServiceStub.class":
            stub_class = class_file
        if any(basename.endswith(pattern) for pattern in critical_patterns):
            critical_classes_to_check.append(class_file)

    if stub_class is None:
        return (False, f"No *Stub.class found in {class_dir}")

    # Validate with batched javap calls to reduce subprocess overhead
    classes_to_validate = [stub_class]
    if critical_classes_to_check:
        # Limit to first 5 critical classes to keep validation lightweight
        classes_to_validate.extend(critical_classes_to_check[:5])

    validated = set()
    for class_file in classes_to_validate:
        if class_file in validated:
            continue

        rel_path = os.path.relpath(class_file, class_root).replace(os.sep, "/")
        class_name = rel_path[:-6].replace("/", ".")
        result = subprocess.run(
            ["javap", "-classpath", class_root, class_name],
            stdout=subprocess.DEVNULL,
            stderr=subprocess.PIPE,
            cwd=working_directory,
            text=True,
        )
        if result.returncode != 0:
            details = result.stderr.strip() if result.stderr else "unknown javap error"
            return (False, f"Invalid compiled class '{class_name}': {details}")
        validated.add(class_file)

    logging.info(f"Validated {len(validated)} representative compiled classes for {service_name}")
    return (True, None)

def compile_wrapper_generator_prereqs(dep_classpath):
    import glob

    working_directory = f"{os.getcwd()}/wsclient"
    out_dir = f"{working_directory}/target/classes"
    os.makedirs(out_dir, exist_ok=True)

    wrapper_maker_src = f"{working_directory}/src/main/java/org/hpccsystems/ws/client/utils/Axis2ADBStubWrapperMaker.java"
    utils_src = f"{working_directory}/src/main/java/org/hpccsystems/ws/client/utils/Utils.java"

    # Remove stale wrapper-maker classes to avoid outer/inner class mismatch.
    utils_out_dir = f"{out_dir}/org/hpccsystems/ws/client/utils"
    for stale_class in glob.glob(f"{utils_out_dir}/Axis2ADBStubWrapperMaker*.class"):
        try:
            os.remove(stale_class)
        except OSError:
            logging.warning(f"Could not remove stale class artifact: {stale_class}")

    compile_cmd = ["javac", "-cp", dep_classpath, "-d", out_dir, wrapper_maker_src, utils_src]
    logging.debug(f"compile_wrapper_generator_prereqs command: {compile_cmd}")
    process = subprocess.Popen(compile_cmd, stdout=subprocess.PIPE, stderr=subprocess.STDOUT, cwd=working_directory)
    for line in process.stdout:
        message = str(line, 'utf-8')
        print(message, end='')

    rc = process.wait()
    if rc != 0:
        return rc

    expected_classes = [
        f"{utils_out_dir}/Axis2ADBStubWrapperMaker.class",
        f"{utils_out_dir}/Axis2ADBStubWrapperMaker$SimpleField.class",
        f"{utils_out_dir}/Utils.class",
    ]
    missing = [c for c in expected_classes if not os.path.exists(c)]
    if missing:
        logging.error(f"Wrapper utility compile appears incomplete. Missing classes: {missing}")
        return 1

    return 0

def build_preferred_wsclient_classpath(raw_classpath, working_directory):
    """Return classpath with wsclient target/classes prioritized and deduplicated."""
    if raw_classpath is None:
        return None

    target_classes = f"{working_directory}/target/classes"
    entries = [e for e in raw_classpath.split(os.pathsep) if e and e.strip()]

    deduped = []
    seen = set()

    # Ensure target/classes is searched first by the JVM classloader.
    for entry in [target_classes] + entries:
        normalized = os.path.normcase(os.path.abspath(entry))
        if normalized in seen:
            continue
        seen.add(normalized)
        deduped.append(entry)

    return os.pathsep.join(deduped)

def generate_stubcode(service):
    generate_stubcode_command = f"mvn -Pgenerate-{service}-stub process-resources"
    logging.debug(f"generate_stubcode_command = {generate_stubcode_command}")
    working_directory = f"{os.getcwd()}/wsclient"
    process = subprocess.Popen(generate_stubcode_command.split(), shell=isWindows, stdout=subprocess.PIPE, stderr=subprocess.STDOUT, cwd=working_directory)
    for line in process.stdout:
        message = str(line, 'utf-8')
        print(message, end='')
        if message.startswith("[INFO]"):
            logging.info(message)

    return process.wait()

def get_wsclient_runtime_classpath():
    class_path = None
    wsclient_classpath_command = f"mvn dependency:build-classpath -Dmdep.includeScope=runtime -Dmdep.outputFile=wsclient_classpath.txt"
    working_directory = f"{os.getcwd()}/wsclient"
    print(f"wsclient_classpath_command = {wsclient_classpath_command}")
    process = subprocess.Popen(wsclient_classpath_command.split(), shell=isWindows, stdout=subprocess.PIPE, stderr=subprocess.PIPE, cwd=working_directory)
    stdout, stderr = process.communicate()
    if process.returncode == 0:
        print("wsclient classpath successful")
        with open('wsclient/wsclient_classpath.txt', 'r') as file:
            class_path = file.read().replace('\n', '')

        class_path = build_preferred_wsclient_classpath(class_path, working_directory)
    else:
        print("wsclient classpath failed")
        print(stdout.decode("utf-8"))
        print(stderr.decode("utf-8"))

    return class_path

def generate_wrappers(service_name, wrapper_service_name, wsclient_class_path):
    wrapper_class_name = "org.hpccsystems.ws.client.utils.Axis2ADBStubWrapperMaker"
    wrappers_package = "org.hpccsystems.ws.client.wrappers.gen"
    package_to_wrap = f"org.hpccsystems.ws.client.gen.axis2.{service_name}.latest"
    working_directory = f"{os.getcwd()}/wsclient"

    effective_classpath = build_preferred_wsclient_classpath(wsclient_class_path, working_directory)

    gen_wrappers_command = [
        "java",
        "-classpath",
        effective_classpath,
        wrapper_class_name,
        f"outputpackage={wrappers_package}",
        f"targetpackage={package_to_wrap}",
        f"servicename={wrapper_service_name}",
        f"outputdir={working_directory}/src/main/java"
    ]
    logging.debug(f"gen_wrappers_command: {gen_wrappers_command}")

    process = subprocess.Popen(gen_wrappers_command, stdout=subprocess.PIPE, stderr=subprocess.STDOUT, cwd=working_directory)
    saw_alert = False
    fatal_messages = []
    output_tail = []
    for line in process.stdout:
        message = str(line, 'utf-8')
        print(message, end='')
        output_tail.append(message.strip())
        if len(output_tail) > 40:
            output_tail.pop(0)
        if message.startswith("Alert!") or message.startswith("Warning:"):
            logging.warning(message)
            if message.startswith("Alert!"):
                saw_alert = True
                fatal_messages.append(message.strip())
        else:
            logging.info(message)

    return_code = process.wait()
    if return_code != 0 or saw_alert:
        details = ""
        if fatal_messages:
            details = "\n" + "\n".join(fatal_messages)
        elif output_tail:
            details = "\nLast wrapper generator output lines:\n" + "\n".join(output_tail)
        raise RuntimeError(f"Wrapper generation failed for service '{service_name}' (stub name '{wrapper_service_name}') with exit code {return_code}.{details}")

#generate-wsdl/hpcc4j$ 
# java
#  -cp wsclient/target/wsclient-9.0.7-0-SNAPSHOT-jar-with-dependencies.jar
#  org.hpccsystems.ws.client.utils.Axis2ADBStubWrapperMaker
#  outputpackage=org.hpccsystems.ws.client.wrappers.gen
#  targetpackage=org.hpccsystems.ws.client.gen.axis2.wssmc.latest
#  servicename=WsSMC
#  outputdir=/home/ubuntu/GIT/generate-wsdl/hpcc4j/wsclient/src/main/java
def get_wsdl_files(service):
    wsdl_location = f"{os.getcwd()}/wsclient/src/main/resources/WSDLs"
    logging.debug(f"finding matching wsdl files at {wsdl_location}")
    files = os.listdir(wsdl_location)
    logging.debug(f"wsdl files found : {files}")
    wsdl_files = []
    for file in files:
        if service in file:
            wsdl_files.append(file)
    logging.debug(f"found matching wsdl files for service {service} : {wsdl_files}")
    return wsdl_files

# service is a tuple of service name to ecm file
def get_ecm_filepath(ecm_file):
    if isinstance(ecm_file, str):
        ecm_filpath=f"{os.getcwd()}/HPCC-Platform/esp/scm/{ecm_file}"
        logging.debug(f"will test {ecm_filpath}")
        if os.path.isfile(ecm_filpath):
            return ecm_filpath
        else:
            raise OSError(f"File not found at {ecm_filpath}")
    return None

def request_runtime_wsdl_version(service, service_uri, protocol, host, port):
    version = None
    logging.debug(f"service : {service}")
    fetch_version_command = f"curl -s {protocol}://{host}:{port}/{service_uri}/version_ -o ./tmpversion.txt -w %{{http_code}}"
    logging.debug(f"Running command : {fetch_version_command}")
    process = subprocess.run(fetch_version_command.split(), timeout=120, stderr=subprocess.PIPE, stdout=subprocess.PIPE)
    if (process.returncode == 0 and process.stdout != None and process.stdout.decode('utf-8') == '200'):
        with open('tmpversion.txt', 'r') as f:
            dom = xml.dom.minidom.parse(f)
        versionElement = dom.getElementsByTagName("Version")
        version = versionElement[0].firstChild.nodeValue
        #ESP tends to pad floating number version with extra 0
        if version[-1] == '0':
            version =  version[:-1]
        logging.debug(f"Service version: {version}")
    else:
        print(f"Failed to retrieve {service} WSDL version: HTTP code: '{process.stdout.decode('utf-8')}'")
    
    return version

def request_wsdl_version(service, ecm_file):
    version_output = open('tmpversion.txt', 'w')
    logging.debug(f"service : {service}")
    logging.debug(f"ecmfile : {ecm_file}")
    ecmfilepath = get_ecm_filepath(ecm_file)
    fetch_version_command = f"esdl wsdl {ecmfilepath} {service}"
    logging.debug(f"Running command : {fetch_version_command}")
    subprocess.run(fetch_version_command.split(), timeout=120, stderr=version_output, stdout=subprocess.DEVNULL)
    version_output.close()
    with open('tmpversion.txt', 'r') as f:
        for line in f:
            if line.startswith('Target interface version set to latest from ECM definition:'):
                version = line.replace('Target interface version set to latest from ECM definition', '').replace(':','').replace('\'','').strip()
                logging.debug(f"process output : {version}")
                return version
    return None

def fetch_repository(repository, user, branch, recursive=False):
    try:
        fetch_repository_command = f"git clone -b {branch} https://github.com/{user}/{repository}.git"
        if recursive:
            fetch_repository_command = f"{fetch_repository_command} --recursive"
        process = subprocess.run(fetch_repository_command.split(), timeout=600, stderr=subprocess.STDOUT)
        logging.debug(process.stdout)
    except Exception as e:
        logging.error(f"Error in fetch_repository({repository}, {user}, {branch}, {recursive}) : {e.strerror}")

def checkout_branch(repository, branch):
    try:
        working_dir = f"{os.getcwd()}/{repository}"
        logging.debug(f"working directory is {working_dir}")
        process = subprocess.run(['git','fetch'], timeout=600, cwd=working_dir, stderr=subprocess.STDOUT)
        logging.debug(process.stdout)
        checkout_branch_command = f"git checkout {branch}"
        process = subprocess.run(checkout_branch_command.split(), timeout=600, cwd=working_dir, stderr=subprocess.STDOUT)
        logging.debug(process.stdout)
        update_to_current_head_command = f"git reset --hard origin/{branch}"
        subprocess.run(update_to_current_head_command.split(), timeout=600, cwd=working_dir, stderr=subprocess.STDOUT)
        logging.debug(process.stdout)
    except Exception as e:
        logging.error(f"Error in checkout_branch({repository}, {branch}) : {e.strerror}")

if __name__ == '__main__':
    main()
