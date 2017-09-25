package org.hpccsystems.ws.client.error;

import org.hpccsystems.error.IErrorCode;

public enum HPCCErrorCode implements IErrorCode 
{	
     ECL_RUNTIMEERROR(30001),
     ECL_WARNING(30002);

     private int numVal;

     HPCCErrorCode(int numVal) 
     {
         this.numVal = numVal;
     }

     @Override
     public Integer getNumVal() 
     {
         return numVal;
     }
}
