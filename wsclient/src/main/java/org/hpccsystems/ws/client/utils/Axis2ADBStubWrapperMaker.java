package org.hpccsystems.ws.client.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/**
 *
 */
public class Axis2ADBStubWrapperMaker
{
    private static String elementcommentstart = "/**\n"
                                              + " * Generated Axis2 ADB stub class wrapper\n"
                                              + " * Class name: %s\n"
                                              + " * Wraps class: %s\n"
                                              + " * Output package : %s\n"
                                              + " * TimeStamp: %s\n"
                                              + " */\n";

    private String crheader = "\n/*******************************************************************************\n"
                             + " * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems.\n"
                             + " *\n"
                             + " * Licensed under the Apache License, Version 2.0 (the \"License\");\n"
                             + " * you may not use this file except in compliance with the License.\n"
                             + " * You may obtain a copy of the License at\n"
                             + " *\n"
                             + " * http://www.apache.org/licenses/LICENSE-2.0\n"
                             + " *\n"
                             + " * Unless required by applicable law or agreed to in writing, software\n"
                             + " * distributed under the License is distributed on an \"AS IS\" BASIS,\n"
                             + " * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n"
                             + " * See the License for the specific language governing permissions and\n"
                             + " * limitations under the License.\n"
                             + " *******************************************************************************/\n";

    private String targetPackage = null;
    private String targetWsService = null;
    //private String targetWsServiceVer = null;
    private String generatedPackageToWrap = null;
    List<String> imports = null;
    List<SimpleField> fields = null;

    private String outputDir;

    class SimpleField
    {
        String type;
        String packagename;
        String name;
        boolean isContainer = false;
        boolean isWrapped = false;

        public SimpleField (String name)
        {
            this.packagename = null;
            this.type = null;
            this.name = name;
        }

        public SimpleField (String packagename, String type, String name, boolean iswrapped)
        {
            this.packagename = packagename;
            this.type = type;
            this.name = name;
        }

        /**
         * @return the isContainer
         */
        public boolean isContainer()
        {
            return isContainer;
        }

        /**
         * @param isContainer the isContainer to set
         */
        public void setContainer(boolean isContainer)
        {
            this.isContainer = isContainer;
        }

        /**
         * @return the isWrapped
         */
        public boolean isWrapped()
        {
            return isWrapped;
        }

        /**
         * @param isWrapped the isWrapped to set
         */
        public void setWrapped(boolean isWrapped)
        {
            this.isWrapped = isWrapped;
        }

        /**
         * @return the type
         */
        public String getBaseType()
        {
            return type;
        }

        public String getActualType()
        {
            String actualtype = type;
            if (isWrapped)
                actualtype += "Wrapper";

            if (isContainer)
                actualtype = "List<" + actualtype + ">";

            return actualtype;
        }
        /**
         * @param type the type to set
         */
        public void setType(String type)
        {
            this.type = type;
        }
        /**
         * @return the packagename
         */
        public String getPackagename()
        {
            return packagename;
        }
        /**
         * @param packagename the packagename to set
         */
        public void setPackagename(String packagename)
        {
            this.packagename = packagename;
        }
        /**
         * @return the name
         */
        public String getName()
        {
            return name;
        }
        /**
         * @return the name
         */
        public String getSafeName()
        {
            return "local_" + name;
        }
        /**
         * @param name the name to set
         */
        public void setName(String name)
        {
            this.name = name;
        }

        public String getActualDeclaration()
        {
            return "protected " + getActualType() + " " + getSafeName() + (isContainer ? " = new Array" + getActualType() + "()" : "") + ";\n";
        }
     }

    public Axis2ADBStubWrapperMaker(String outputdir, String generatedPackageToWrap, String targetPackage, String targetWsServiceName)
    {
        this.generatedPackageToWrap = generatedPackageToWrap;
        this.targetPackage = targetPackage + (targetWsServiceName == null  || targetWsServiceName.isEmpty() ? "" : "." + targetWsServiceName.toLowerCase());
        this.targetWsService = targetWsServiceName;
        //this.targetWsServiceVer = targetWsServiceVerName;
        this.outputDir = outputdir;
    }

    public void wrapClass(Class<?> cls)
    {
        imports = new ArrayList<String>();
        fields = new ArrayList<SimpleField>();

        String packagedeclaration = "package " + this.targetPackage + ";\n\n";

        String wrappedclassname = cls.getSimpleName()+"Wrapper";
        System.out.println(cls.getName() + " to be wrapped as: " + this.targetPackage + "." + targetWsService + "." + wrappedclassname);

        String fullpath = outputDir + File.separator + this.targetPackage.replace(".", "\\");// + File.separator + wrappedclassname + ".java";
        File file = new File(fullpath);
        if (!file.exists())
        {
            if (!file.mkdirs())
            {
                System.out.println("Failed to create directory: " + fullpath);
                System.exit(-1);
            }
        }

        fullpath = fullpath + File.separator + wrappedclassname + ".java";
        System.out.println("Attempting to create file: " + fullpath);

        file = new File(fullpath);
        try
        {
            if (!file.createNewFile())
            {
                System.out.println("Warning: Target file already exists: " + fullpath);
            }
        }
        catch (IOException e1)
        {
            System.out.println("Warning: Could not create file: " + fullpath);
            System.out.println(e1.getLocalizedMessage());
            e1.printStackTrace();
            System.exit(-1);
        }

      FileWriter writer = null;
      try
      {
          writer = new FileWriter(file);
      }
      catch (IOException e)
      {
          System.out.println("Warning: Could not filewriter for : " + fullpath);
          System.out.println(e.getLocalizedMessage());
          e.printStackTrace();
          System.exit(-1);
      }

        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields)
        {
            processField(field);
        }

        String importdeclarations = generateImports();
        String fielddeclarations = generateFieldDeclarations();
        String constructors = generateConstructors(cls);
        String gettersettermethods = createGetterAndSetter();

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Instant now = timestamp.toInstant();

        String classcomment = String.format(elementcommentstart, wrappedclassname, cls.getName(), targetPackage, now );

        String classcontent = packagedeclaration + "\n" + crheader + importdeclarations +  classcomment + "public class " + wrappedclassname + "\n{\n" + fielddeclarations + "\n" + constructors + "\n" + gettersettermethods +"\n}";

        try
        {
            writer.write(classcontent);
        }
        catch (IOException e)
        {
            System.out.println("Warning: Could not write to file: " + fullpath);
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
            System.exit(-1);
        }

        try
        {
            writer.close();
        }
        catch (IOException e)
        {
            System.out.println("Warning: Could not close filewritter: " + fullpath);
            e.printStackTrace();
        }
    }


    private String generateImports()
    {
        String importslist = "";
        for (String importname : imports)
        {
            importslist += "import " + importname + ";\n";
        }
        return importslist + "\n";
    }

    private String generateConstructors(Class<?> baseclass)
    {
        String wrappedname = baseclass.getSimpleName() + "Wrapper";

        String constructors = "\tpublic " + wrappedname + "() {}\n\n";

        String rawmethobody = "";

        if (fields.size() > 0)
        {
            constructors += "\tpublic " + wrappedname + "( " + baseclass.getTypeName() + " " + baseclass.getSimpleName().toLowerCase() + ")\n\t{\n\t\tcopy( " + baseclass.getSimpleName().toLowerCase() +" );\n\t}\n";

            String copymethobody = "";
            String fullctrbody = "";
            String paramlist = "";
            String tostringstr = "\n\t@Override\n\tpublic String toString()\n\t{\n\t\treturn \"" + wrappedname + " [\" + ";

            constructors += "\tpublic " + wrappedname + "( ";

            for (Iterator<SimpleField> iterator = fields.iterator(); iterator.hasNext();)
            {
                SimpleField simpleField = (SimpleField) iterator.next();

                String simplename = simpleField.getName();
                String capitalized = Character.toUpperCase(simplename.charAt(0)) + simplename.substring(1);
                paramlist += simpleField.getActualType() + " _" + simplename;
                if (iterator.hasNext())
                    paramlist += ", ";

                tostringstr += "\"" + simplename + " = \" + " + simpleField.getSafeName();
                if (iterator.hasNext())
                    tostringstr += " + \", \" + ";

                fullctrbody += "\t\tthis." + simpleField.getSafeName() + " = _" + simplename + ";\n";
                if (simpleField.isContainer)
                {
                    copymethobody += "\t\tif (raw.get" + capitalized + "() != null)\n\t\t{\n";
                    copymethobody += "\t\t\tthis." + simpleField.getSafeName() + " = new Array" + simpleField.getActualType() + "();\n";
                    copymethobody += "\t\t\tfor ( int i = 0; i < raw.get" + capitalized + "().length; i++)\n";
                    copymethobody += "\t\t\t{\n\t\t\t\tthis." + simpleField.getSafeName() + ".add(new " + simpleField.getBaseType();
                    if (simpleField.isWrapped())
                        copymethobody += "Wrapper";
                    copymethobody += "(raw.get" + capitalized + "()[i]));\n\t\t\t}\n\t\t}";

                    rawmethobody += "\t\tif (this." + simpleField.getSafeName() + "!= null)\n\t\t{\n";
                    if (simpleField.isWrapped())
                        rawmethobody += "\t\t\t" + baseclass.getPackage().getName() + "." + simpleField.getBaseType() + "[] arr = new " + baseclass.getPackage().getName() + "." + simpleField.getBaseType() + "[this." + simpleField.getSafeName() + ".size()];\n";
                    else
                        rawmethobody += "\t\t\t" + simpleField.getPackagename() + "." + simpleField.getBaseType() + "[] arr = new " + simpleField.getPackagename() + "." + simpleField.getBaseType() + "[this." + simpleField.getSafeName() + ".size()];\n";

                    rawmethobody += "\t\t\tfor ( int i = 0; i < this." + simpleField.getSafeName() + ".size(); i++)\n";

                    rawmethobody += "\t\t\t{\n\t\t\t\tarr[i] = this." + simpleField.getSafeName() + ".get(i) " + (simpleField.isWrapped() ? ".getRaw()" : "") + ";\n\t\t\t}";
                    rawmethobody += "\t\traw.set" + capitalized + "(arr);\n}\n";
                }
                else if (simpleField.isWrapped)
                    copymethobody += "\t\tthis." + simpleField.getSafeName() + " = new " + simpleField.getActualType() + "( raw.get" + capitalized + "());\n";
                else
                {
                    boolean foundget = false;
                    boolean foundset = false;
                    Method[] methods = baseclass.getMethods();
                    for (Method method : methods)
                    {
                        if (method.getName().equals("get" + capitalized))
                            foundget = true;
                        if (method.getName().equals("set" + capitalized))
                            foundset = true;
                    }
                    if (foundget)
                        copymethobody += "\t\tthis." + simpleField.getSafeName() + " = raw.get" + capitalized + "();\n";
                    else
                        copymethobody += "//Warning raw class does not provide expected method: get" + capitalized + "();\n";

                    if (foundset)
                        rawmethobody += "\t\traw.set" + capitalized + "( " + simpleField.getSafeName() + ");\n";
                    else
                        rawmethobody += "//Warning raw class doe not provide expected method: set" + capitalized + "(" + simpleField.getName() + ");\n";
                }
            }

            constructors += paramlist + " )\n\t{\n" + fullctrbody + "\n\t}\n\n";

            constructors += "\tprivate void copy( " + baseclass.getTypeName() + " raw )\n\t{\n";
            constructors += "\t\tif (raw == null)\n\t\t\treturn;\n\n";
            constructors += copymethobody + "\n\t}\n";
            constructors += tostringstr + " + \"]\";\n\t}\n";
        }

        boolean empyconstructorfound = false;
        Constructor<?>[] constructors2 = baseclass.getConstructors();
        for (Constructor<?> constructor : constructors2)
        {
            if (constructor.getParameterCount()==0)
            {
                empyconstructorfound = true;
                break;
            }
        }

        constructors += "\tpublic " + baseclass.getTypeName() + " getRaw()\n\t{\n\t\t" + baseclass.getTypeName() + " raw = ";
        if (empyconstructorfound)
            constructors += "new " + baseclass.getTypeName() + "();\n";
        else
            constructors += "null;\n //WARNING base class does not provide expected default constructor";

        constructors += rawmethobody + "\t\treturn raw;\n\t}\n";

        return constructors;
    }

    private String generateFieldDeclarations()
    {
        String fielddeclarations = "";
        for (Iterator<SimpleField> iterator = fields.iterator(); iterator.hasNext();)
        {
            SimpleField simpleField = (SimpleField) iterator.next();
            fielddeclarations += simpleField.getActualDeclaration();
        }
        return fielddeclarations;
    }

    public void processField(Field field)
    {
        String fieldname = field.getName();
        if (!java.lang.reflect.Modifier.isStatic(field.getModifiers()) &&
            !java.lang.reflect.Modifier.isAbstract(field.getModifiers()) &&
            !java.lang.reflect.Modifier.isFinal(field.getModifiers()) &&
            !fieldname.equals("MY_QNAME") &&
            !fieldname.equalsIgnoreCase("serialVersionUID"))
        {
            if (fieldname.startsWith("local"))
            {
                if (fieldname.endsWith("Tracker"))
                    return; // ignore local<fieldname>Tracker created by Axis2 ADB
                fieldname = fieldname.substring(5); //Axis2 ADB prefixes fields w/ "local"
                fieldname = Character.toLowerCase(fieldname.charAt(0)) + fieldname.substring(1);
            }

            SimpleField sfield = new SimpleField(fieldname);
            typeDeclaration(field.getType(), sfield);
            fields.add(sfield);

            Class<?> type = field.getType();
            if (!type.isPrimitive())
            {
                Package package1 = type.getPackage();
                if (package1 != null)
                {
                    String fieldpackagename = type.getPackage().getName();
                    if (generatedPackageToWrap.equals(fieldpackagename))
                    {
                        fieldpackagename = targetPackage;
                        sfield.setWrapped(true);
                    }
                    else if (!fieldpackagename.startsWith("java.lang"))
                    {
                        if (!imports.contains(fieldpackagename + "." + type.getSimpleName()))
                            imports.add(fieldpackagename + "." + type.getSimpleName());
                    }
                }
            }
        }
    }

    private String createGetterAndSetter()
    {
        String settergetter = "";
        if (fields.size() > 0)
        {
            for (Iterator<SimpleField> iterator = fields.iterator(); iterator.hasNext();)
            {
                SimpleField simpleField = (SimpleField) iterator.next();

                String simplename = simpleField.getName();
                String capitalized = Character.toUpperCase(simplename.charAt(0)) + simplename.substring(1);

                settergetter +=  "\n\tpublic void set" + capitalized + "( " + simpleField.getActualType() + " _" + simplename + " )\n\t{\n\t\tthis." + simpleField.getSafeName() + " = _" + simplename + ";\n\t}";
                settergetter += "\n\tpublic " + simpleField.getActualType() + " get" + capitalized + "( )\n\t{\n\t\treturn this." + simpleField.getSafeName() + ";\n\t}";
            }
        }
        return settergetter;
    }

    private void typeDeclaration(Class<?> type, SimpleField sfield)
    {
        String fieldpackagename = null;
        if (!type.isPrimitive())
        {
            Package package1 = type.getPackage();
            if (package1 != null)
            {
                fieldpackagename = type.getPackage().getName();
                if (generatedPackageToWrap.equals(fieldpackagename))
                {
                    fieldpackagename = targetPackage;
                    sfield.setWrapped(true);
                }
                else if (!fieldpackagename.startsWith("java.lang"))
                {
                    if (!imports.contains(fieldpackagename + "." + type.getSimpleName()))
                        imports.add(fieldpackagename + "." + type.getSimpleName());
                }
            }
        }

        sfield.setPackagename(fieldpackagename);
        boolean isarr = type.isArray();
        if (isarr)
        {
            sfield.setContainer(true);
            if (!imports.contains("java.util.List"))
                imports.add("java.util.List");
            if (!imports.contains("java.util.ArrayList"))
                imports.add("java.util.ArrayList");

            typeDeclaration(type.getComponentType(), sfield);
        }
        else
        {
            sfield.setType(type.getSimpleName());
        }
    }

    public static final List<Class<?>> getClassesInPackage(String packageName)
    {
        String path = packageName.replace(".", "\\");
        List<Class<?>> classes = new ArrayList<>();
        String[] classPathEntries = System.getProperty("java.class.path").split(System.getProperty("path.separator"));

        String name;
        for (String classpathEntry : classPathEntries)
        {
            if (!classpathEntry.endsWith(".jar"))
            {
                try
                {
                    File base = new File(classpathEntry + File.separatorChar + path);
                    for (File file : base.listFiles())
                    {
                        name = file.getName();
                        if (name.endsWith(".class"))
                        {
                            name = name.substring(0, name.length() - 6);
                            classes.add(Class.forName(packageName + "." + name));
                        }
                    }
                }
                catch (Exception ex) { }
            }
        }

        return classes;
    }

    public static boolean isMethodOverrriden(Method myMethod)
    {
        Class<?> declaringClass = myMethod.getDeclaringClass();
        if (declaringClass.equals(Object.class))
        {
            return false;
        }
        try
        {
            declaringClass.getSuperclass().getMethod(myMethod.getName(), myMethod.getParameterTypes());
            return true;
        }
        catch (NoSuchMethodException e)
        {
            return false;
        }
    }

    private static void printUsage()
    {

        String usage = "Generates wrapper classes based off Axis2 ADB generated stub\n"
                     + "\n"
                     + "Usage: WrapperMaker parameterstargetpackage=<packageName> outputdir=<outputdirname> outputpackage=<outputpackagename> servicename=<nameofservicestub>\n"
                     + "\n"
                     + "\nParameters:"
                     + "\ntargetpackage   - The Axis2 ADB stub package to wrap"
                     + "\nservicename     - The name of the WebService associated with the Axis Stub package"
                     + "\noutputdir       - The directory on which the wrapped classes will be written"
                     + "\noutputpackage   - The base package name on which the wrapped classes exist - it is postfixed with the service name"
                     + "\n"
                     + "\nExample: WrapperMaker parameterstargetpackage=org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00 \\"
                     + "\n                      outputdir=C:\\project\\src\\main\\java outputpackage=org.hpccsystems.ws.client.wrappers servicename=<nameofservicestub>";


        System.out.println(usage);
        System.exit(0);
    }

    public static void main(String args[]) throws Exception
    {
        Properties argsprops = new Properties();

        for (String arg: args)
        {
            String[] split = arg.split("=");
            if (split.length == 2)
            {
                /*if (split[0].trim().equals("wrappers.conf"))
                {
                    File file = new File(split[0].trim());
                    if (file.exists())
                    {
                        FileInputStream fileInput = new FileInputStream(file);
                        argsprops.load(fileInput);
                        fileInput.close();
                    }
                    else
                    {
                        System.out.println("Wrappers configuration does not exist: " + file.getName());
                    }
                }
                else
                */
                argsprops.setProperty(split[0].trim(), split[1].trim());
            }
            else
                System.out.println("Ignored input param: " + arg);
        }

        //if (argsprops.size() < 4)
        //    printUsage();
        //String targetPackage = "org.hpccsystems.ws.client.wrappers";
        String targetPackage = argsprops.getProperty("outputpackage");
        if (targetPackage == null || targetPackage.isEmpty())
        {
            System.out.println("Error: Missing parameter: 'outputpackage'\n\n");
            printUsage();
        }
        //String targetWsServiceName = "WsFileIO";
        String targetWsServiceName = argsprops.getProperty("servicename");
        if (targetWsServiceName == null || targetWsServiceName.isEmpty())
        {
            System.out.println("Error: Missing parameter: 'servicename'\n\n");
            printUsage();
        }
        //String generatedPackageToWrap = "org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00";
        String generatedPackageToWrap = argsprops.getProperty("targetpackage");
        if (generatedPackageToWrap == null || generatedPackageToWrap.isEmpty())
        {
            System.out.println("Error: Missing parameter: 'targetpackage'\n\n");
            printUsage();
        }
        //String outputdir = "C:\\assignments\\GIT\\hpcc-japis\\wsclient\\src\\main\\java";
        String outputdir = argsprops.getProperty("outputdir");
        if (outputdir == null || outputdir.isEmpty())
        {
            System.out.println("Error: Missing parameter: 'outputdir'\n\n");
            printUsage();
        }

        Axis2ADBStubWrapperMaker wrapperMaker = new Axis2ADBStubWrapperMaker(outputdir, generatedPackageToWrap, targetPackage, targetWsServiceName);

        List<Class<?>> classesInPackage = getClassesInPackage(generatedPackageToWrap);
        for (Class<?> cls : classesInPackage)
        {
            if (cls.getDeclaringClass() != null) //ignore inner classes
            {
                continue;
            }

            if (cls.getSimpleName().equalsIgnoreCase(targetWsServiceName + "Stub"))
            {
                continue;
            }

            if (cls.getSimpleName().equalsIgnoreCase(targetWsServiceName))
            {
                continue;
            }

            if (cls.getSimpleName().equalsIgnoreCase("String"))
            {
                continue;
            }
            if (cls.getSimpleName().equalsIgnoreCase("ExtensionMapper"))
            {
                continue;
            }

            wrapperMaker.wrapClass(cls);
        }
        System.out.println("Finsished wrapping stub classes from package: " + generatedPackageToWrap + "!\n");
        System.out.println("Confirm contents of: " + outputdir  + File.separator + targetPackage);
    }
} 