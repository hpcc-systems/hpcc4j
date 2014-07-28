package org.hpccsystems.clienttools;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class EclCompile
{
    public static HashMap<String, String> compileECL(String ecl, String eclccInstallDir, String tempdirname, List<String> includes, List<String> flags, Boolean saveTempFiles) throws Exception
    {
        if (saveTempFiles == null)
        {
            saveTempFiles = false;
        }

        HashMap<String, String> results = new HashMap<String, String>();
        // check for compiler
        if (!new File(eclccInstallDir).exists())
        {
            throw new Exception("Eclcc install dir " + eclccInstallDir + " not found");
        }

        String c = "";
        if (System.getProperty("os.name").startsWith("Windows"))
        {
            c = "eclcc.exe";
        }
        else
        {
            c = "eclcc";
        }

        File cf = new File(eclccInstallDir, c);
        if (!cf.exists())
        {
            throw new Exception("Eclcc compiler " + cf.getAbsolutePath() + " not found");
        }
        else if (!cf.canExecute())
        {
            throw new Exception("You do not have execute rights on eclcc compiler " + cf.getAbsolutePath());
        }

        // check for tempdir
        File tempdir = new File(tempdirname);
        if (!tempdir.exists())
        {
            throw new Exception("Temp dir " + tempdirname + " not found");
        }
        if (!tempdir.canWrite())
        {
            throw new Exception("You do not have write permissions to temp dir " + tempdirname);
        }

        // create files needed to compile ecl
        String prefix = "HPCCWSClient." + String.valueOf((new Date()).getTime()) + ".";
        File tempfilein = File.createTempFile(prefix, ".in", tempdir);
        File tempfileout = File.createTempFile(prefix, ".out", tempdir);
        File tempfilelog = File.createTempFile(prefix, ".log", tempdir);

        try
        {
            Files.write(tempfilein.toPath(), ecl.getBytes());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw new Exception("Error writing ecl to temp file " + tempfilein.getAbsolutePath() + ": " + e.getMessage());
        }

        try
        {
            // set compile flags
            ArrayList<String> paramsAL = new ArrayList<String>();
            paramsAL.add(cf.getAbsolutePath());
            paramsAL.add("-E");
            paramsAL.add("-v");

            if (flags != null)
            {
                for (String flag : flags)
                {
                    if (!paramsAL.contains(flag))
                    {
                        paramsAL.add(flag);
                    }
                }
            }
            paramsAL.add("--logfile");
            paramsAL.add(tempfilelog.getAbsolutePath());

            // set include dirs
            if (includes != null)
            {
                for (String include : includes)
                {
                    if (!paramsAL.contains(include))
                    {
                        paramsAL.add("-I");
                        paramsAL.add(include);
                    }
                }
            }

            // set output and input files
            paramsAL.add("-o");
            paramsAL.add(tempfileout.getAbsolutePath());
            paramsAL.add(tempfilein.getAbsolutePath());
            String[] params = new String[paramsAL.size()];
            paramsAL.toArray(params);

            // fire off compile process
            ProcessBuilder pb = new ProcessBuilder(params);
            results.put("Command Line", pb.command().toString());
            pb.redirectErrorStream(true); // merge stdout, stderr of process

            pb.directory(new File(eclccInstallDir));
            Process p = pb.start();
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            String errorText = "";
            InputStream in = null;
            InputStreamReader inr = null;
            BufferedReader br = null;
            try
            {
                in = p.getErrorStream();
                br = new BufferedReader(new InputStreamReader(in));
                String lineErr;
                while ((lineErr = br.readLine()) != null)
                {
                    // System.out.println("#####"+lineErr);
                    errorText += lineErr + "\r\n";
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
                throw new Exception("Error reading compile errors:"
                        + e.getMessage());
            }
            finally
            {
                try
                {
                    if (br != null)
                    {
                        br.close();
                    }
                    if (in != null)
                    {
                        in.close();
                    }
                }
                catch (Exception ex)
                {}
            }
            results.put("Error", errorText);

            String compiled_ecl = new String(Files.readAllBytes(tempfileout.toPath()));
            results.put("Compiled ECL", compiled_ecl);

            String log = new String(Files.readAllBytes(tempfilelog.toPath()));
            results.put("Log", log);

            if (errorText.equals("") && !compiled_ecl.equals("")
                    && !saveTempFiles)
            {
                Files.delete(tempfilein.toPath());
                Files.delete(tempfileout.toPath());
                Files.delete(tempfilelog.toPath());
            }
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
            e.printStackTrace();
        }

        return results;
    }
    
    public static void main (String[] args) 
    {
        List<String> imports=new ArrayList<String>();
        imports.add("C:/workspace/github/ecl-ml");
        
        List<String> flags=new ArrayList<String>();
        flags.add("-legacy");
        
        try
        {
            HashMap<String,String> results=compileECL("import ml;output(ML.Docs.PorterStem('management'));)",
                 "C:/Program Files (x86)/HPCCSystems/4.2.0/clienttools/bin",
                 "c:/temp",
                 imports,flags,false);
        
            if (results.containsKey("Compiled ECL"))
            {
              System.out.println("Compiled ECL:" + results.get("Compiled ECL"));
            } else {
              System.out.println("Error:" + results.get("Error"));
            }
            System.out.println("Log:" + results.get("Log"));
            System.out.println("Command Line:" + results.get("Command Line"));
        }
        catch (Exception e)
        {
            
        }
    }
}
