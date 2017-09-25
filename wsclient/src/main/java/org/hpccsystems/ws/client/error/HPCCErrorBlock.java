package org.hpccsystems.ws.client.error;
import java.util.List;

import org.hpccsystems.error.ErrorBlock;
import org.hpccsystems.error.HError;
import org.hpccsystems.error.HError.ErrorLevel;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLException;
import org.hpccsystems.ws.client.platform.ECLExceptionInfo;

public class HPCCErrorBlock extends ErrorBlock 
{

    public HPCCErrorBlock() 
    {
        super();
    }
    /**
     * Initialize an ErrorBlock from ECLExceptions passed back from HPCC
     * @param errs array of ECLException objects 
     */
    public HPCCErrorBlock(ECLException[] errs) 
    {
        if (errs==null) 
        {
            return;
        }
        for (int i=0; i < errs.length; i++) 
        {
            ECLException ex=errs[i];
            if (ex.getSeverity().equalsIgnoreCase("Error")) 
            {
                this.add(new HError(ErrorLevel.ERROR,HPCCErrorType.HPCC,HPCCErrorCode.ECL_RUNTIMEERROR,ex.getMessage(),
                        null,ex.getLineNo(),ex.getColumn(),ex.getFileName()));
            } else
            {
                this.add(new HError(ErrorLevel.WARNING,HPCCErrorType.HPCC,HPCCErrorCode.ECL_WARNING,ex.getMessage(),
                        null,ex.getLineNo(),ex.getColumn(),ex.getFileName()));
            }
        }
    }
    
     /**
     * Initialize an ErrorBlock from ECLExceptions passed back from HPCC
     * @param list array of ECLException objects 
     */
    public HPCCErrorBlock(List<ECLExceptionInfo> list) 
    {
        if (list==null) 
        {
            return;
        }
        for (ECLExceptionInfo ex:list) 
        {
            if (ex.getSeverity().equalsIgnoreCase("Error")) 
            {
                this.add(new HError(ErrorLevel.ERROR,HPCCErrorType.HPCC,HPCCErrorCode.ECL_RUNTIMEERROR,ex.getMessage(),
                        null,ex.getLineNo(),ex.getColumn(),ex.getFileName()));
            }
            else  
            {
                this.add(new HError(ErrorLevel.WARNING,HPCCErrorType.HPCC,HPCCErrorCode.ECL_WARNING,ex.getMessage(),
                        null,ex.getLineNo(),ex.getColumn(),ex.getFileName()));
            }
        }
    }
        

}
