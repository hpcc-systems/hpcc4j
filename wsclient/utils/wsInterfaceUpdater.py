#!/usr/bin/env python3

import argparse
from operator import ge
from re import X, sub
import subprocess
import os, shutil
from sre_compile import isstring
import logging
from tokenize import String
import sys
import xml.dom.minidom
import pathlib

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
    services = [("wsattributes", None, "WsAttributes", "wsattributes", None),
                ("wscodesign", "ws_codesign.ecm", "Ws_codesign", "ws_codesign", None),
                ("wsdfu", "ws_dfu.ecm", "WsDFU", "wsdfu", None),
                ("wsdfuxref", "ws_dfuXref.ecm", "WsDFUXRef", "wsdfuxref", None),
                ("wsfileio", "ws_fileio.ecm", "WsFileIO", "wsfileio", None),
                ("filespray", "ws_fs.ecm", "FileSpray", "filespray", None),
                ("wspackageprocess", "ws_packageprocess.ecm", "WsPackageProcess", "wspackageprocess", None),
                ("wsresources", "ws_resources.ecm", "WsResources", "wsresources", None),
                ("wssmc", "ws_smc.ecm", "WsSMC", "wssmc", None),
                ("wssql", "ws_sql.ecm", "WsSQL", "wssql", "8510"),
                ("wsstore", "ws_store.ecm", "WsStore", "wsstore", None),
                ("wstopology", "ws_topology.ecm", "WsTopology", "wstopology", None),
                ("wsworkunits", "ws_workunits.ecm", "WsWorkunits", "wsworkunits", None),
                ("wsdali", "ws_dali.ecm", "WsDali", "wsdali", None),
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
        for service_name, b, c in services:
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
                shutil.rmtree(i)
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

    #print("Building local wsclient...")
    #build_hpcc4j()
    #print("Done...")

    for service_name, ecm_file, wsdl_prefix, service_uri, non_eclwatch_port in services:
        if args.service != "all" and service_name != args.service:
            continue
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
            continue
        #for file in wsdl_files:
        #    if version_stripped in file:
        #        wsdl_found = True
        #if not wsdl_found:
            #generate wsdl & new stubcode
            #if buildfromESDL == True:
            #    print(f"Generating WSDLs for {service_name}...")
            #    generate_wsdl(service_name, ecm_file, wsdl_prefix, version)
            #else:
            #    print(f"Fetching WSDL for {service_name}...")
            #    fetch_wsdl(service_name, service_uri, wsdl_prefix, "http", args.targethpcchost, targetPort, version)
         #   print(f"Cleaning up previous stub for {wsdl_prefix}...")
         #   remove_latest_stub(service_name)
         #   print(f"Generating latest stub for {wsdl_prefix}-{version}...")
         #   generate_stubcode(service_name)
         #   break

    #print(f"Rebuilding wsclient...")
    #build_hpcc4j()

    wsclient_classpath = get_wsclient_runtime_classpath()
    if wsclient_classpath == None:
        print("Could not generate wsclient classpath!")
        return
    else:
        for service_name, ecm_file, wsdl_prefix, service_uri, non_eclwatch_port in services:
            if args.service != "all" and service_name != args.service:
                continue

            print(f"Generating latest stub wrappers for {wsdl_prefix}-{version}...")
            generate_wrappers(service_name, wsdl_prefix, wsclient_classpath)
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
        shutil.rmtree(latest_path)
    else:
        logging.warning(f"Could not locate previous generated stub code for removal: {latest_path}")

def fetch_wsdl(service, service_uri, wsdl_pre, protocol, host, port, ver):
    wsdl_output_path = f"{os.getcwd()}/wsclient/src/main/resources/WSDLs"
    # rename old file
    simple_version = str(ver).replace('.','')
    src = f"{wsdl_output_path}/{wsdl_pre}.wsdl"
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

            os.rename(f"{wsdl_output_path}/{service}.wsdl", f"{wsdl_output_path}/{wsdl_pre}.wsdl")
            shutil.copy2(f"{wsdl_output_path}/{wsdl_pre}.wsdl", dest );
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
    src = f"{wsdl_output_path}/{wsdl_pre}.wsdl"
    dest = f"{wsdl_output_path}/{wsdl_pre}-{simple_version}.wsdl"
    generate_wsdl_command = f"esdl wsdl {full_ecm_file_path} {service} -iv {ver} --outdir {wsdl_output_path} --unversioned-ns"
    logging.debug(f"generate_wsdl_command = {generate_wsdl_command}")
    process = subprocess.run(generate_wsdl_command.split(), timeout=120)
    if os.path.exists(f"{wsdl_output_path}/{service}.wsdl"):
        os.rename(f"{wsdl_output_path}/{service}.wsdl", f"{wsdl_output_path}/{wsdl_pre}.wsdl")
        shutil.copy2(f"{wsdl_output_path}/{wsdl_pre}.wsdl", dest );
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

def generate_stubcode(service):
    wsdl_output_path = f"{os.getcwd()}/wsclient/src/main/resources/WSDLs"
    generate_stubcode_command = f"mvn -Pgenerate-{service}-stub process-resources"
    logging.debug(f"generate_stubcode_command = {generate_stubcode_command}")
    working_directory = f"{os.getcwd()}/wsclient"
    process = subprocess.Popen(generate_stubcode_command.split(), shell=isWindows, stdout=subprocess.PIPE, stderr=subprocess.STDOUT, cwd=working_directory)
    for line in process.stdout:
        message = str(line, 'utf-8')
        if message.startswith("[INFO]"):
            logging.info(message)
        else:
            print(message)

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

        if isWindows:
            class_path += ";"
        else:
            class_path += ":"
        class_path += f"{working_directory}/target/classes"
    else:
        print("wsclient classpath failed")
        print(stdout.decode("utf-8"))
        print(stderr.decode("utf-8"))

    return class_path

def generate_wrappers(service_name, wsdl_prefix, wsclient_class_path):
    wrapper_class_name = "org.hpccsystems.ws.client.utils.Axis2ADBStubWrapperMaker"
    wrappers_output_path = f"{os.getcwd()}/wsclient/src/main/java"
    wrappers_package = "org.hpccsystems.ws.client.wrappers.gen"
    package_to_wrap = f"org.hpccsystems.ws.client.gen.axis2.{service_name}.latest"
    working_directory = f"{os.getcwd()}/wsclient"
    gen_wrappers_command= f"java -classpath {wsclient_class_path} {wrapper_class_name} outputpackage=org.hpccsystems.ws.client.wrappers.gen targetpackage=org.hpccsystems.ws.client.gen.axis2.{service_name}.latest servicename={wsdl_prefix} outputdir={working_directory}/src/main/java"
    logging.debug(f"gen_wrappers_command: {gen_wrappers_command}")

    process = subprocess.Popen(gen_wrappers_command.split(), stdout=subprocess.PIPE, stderr=subprocess.STDOUT, cwd=working_directory)
    for line in process.stdout:
        message = str(line, 'utf-8')
        if message.startswith("Alert!") or message.startswith("Warning:"):
            logging.warning(message)
        else:
            logging.info(message)

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
    version_output = open('tmpversion.txt', 'w')
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

    version_output.close()
    
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
