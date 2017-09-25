package org.hpccsystems.ws.client.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.hpccsystems.error.ErrorBlock;
import org.hpccsystems.ws.client.error.HPCCErrorBlock;
import org.hpccsystems.ws.client.platform.ApplicationValueInfo;
import org.hpccsystems.ws.client.platform.NamedValueInfo;
import org.hpccsystems.ws.client.platform.WorkunitInfo;

public class ECLPackage 
{
    ErrorBlock compileErrors;
    Set<String> imports;
    String packagedEcl;
    WorkunitInfo workunit;
    String log;
    String eclCommand;
    String jobname;
    String sourceText;
    String moduleName;
    String moduleFileName;
    String appname;
    ErrorBlock hpccErrors;
    Map<String,String> variables=new HashMap<String,String>();
    
    public Map<String, String> getVariables()
    {
        return variables;
    }
    
    public void setVariables(Map<String, String> variables)
    {
        this.variables = variables;
    }
    
    public List<NamedValueInfo> getNamedValues()
    {
        List<NamedValueInfo> values=new ArrayList<NamedValueInfo>();
        for (Entry<String,String> var: variables.entrySet()) {
            values.add(new NamedValueInfo(var.getKey(),var.getValue()));
        }
        return values;
    }
    
    public List<ApplicationValueInfo> getApplicationValues()
    {
        List<ApplicationValueInfo> values=new ArrayList<ApplicationValueInfo>();
        for (Entry<String,String> var: variables.entrySet()) {
            values.add(new ApplicationValueInfo(appname,var.getKey(),var.getValue()));
        }
        return values;
    }
    
    public String getJobname()
    {
        return jobname;
    }
    
    public void setJobname(String jobname)
    {
        this.jobname = jobname;
    }
    
    public ErrorBlock getCompileErrors() {
        if (compileErrors==null) 
        {
            compileErrors=new ErrorBlock();
        }
        return compileErrors;
    }
    
    public void setCompileErrors(ErrorBlock errors) 
    {
        this.compileErrors = errors;
    }
    
    public WorkunitInfo getWorkunit() 
    {
        return workunit;
    }
    
    public void setWorkunit(WorkunitInfo workunit) 
    {
        this.workunit = workunit;
        this.hpccErrors = null;
    }
    
    public String getPackagedEcl() 
    {
        return packagedEcl;
    }
    
    public void setPackagedEcl(String packagedEcl) 
    {
        this.packagedEcl = packagedEcl;
    }
    
    public String getLog() 
    {
        return log;
    }
    
    public void setLog(String log) 
    {
        this.log = log;
    }
    
    public String getEclCommand() 
    {
        return eclCommand;
    }
    
    public void setEclCommand(String eclCommand) 
    {
        this.eclCommand = eclCommand;
    }
    
    public Set<String> getImports() 
    {
        return imports;
    }
    
    public void setImports(Set<String> imports) 
    {
        this.imports = imports;
    }
    
    public String getSourceText() 
    {
        return sourceText;
    }
    
    public void setSourceText(String sourceText) 
    {
        this.sourceText = sourceText;
    }
    
    public String getModuleName() 
    {
        return moduleName;
    }
    
    public void setModuleName(String moduleName) 
    {
        this.moduleName = moduleName;
    }
    
    public String getModuleFileName() 
    {
        return moduleFileName;
    }
    
    public void setModuleFileName(String moduleFileName) 
    {
        this.moduleFileName = moduleFileName;
    }
    
    public ErrorBlock getHpccErrors() 
    {
        if (hpccErrors==null && this.getWorkunit() != null && this.getWorkunit().getExceptions() != null) 
        {
            hpccErrors=new HPCCErrorBlock(this.getWorkunit().getExceptions());
        }  
        return hpccErrors;
    }
    
    public void setHpccErrors(ErrorBlock hpccErrors) 
    {
        this.hpccErrors = hpccErrors;
    }
    
    public String getAppname() 
    {
        return appname;
    }
    
    public void setAppname(String appname) 
    {
        this.appname = appname;
    }
}
