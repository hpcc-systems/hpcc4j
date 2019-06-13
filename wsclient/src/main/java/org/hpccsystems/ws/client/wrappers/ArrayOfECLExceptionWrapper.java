package org.hpccsystems.ws.client.wrappers;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfECLExceptionWrapper
{
    protected List<ECLExceptionWrapper> eclExceptions = new ArrayList<ECLExceptionWrapper>();

    public ArrayOfECLExceptionWrapper() {}

    public ArrayOfECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfECLException arrayofeclexception)
    {
        copy( arrayofeclexception );
    }

    public ArrayOfECLExceptionWrapper(List<ECLExceptionWrapper> _eCLException)
    {
        this.eclExceptions = _eCLException;
    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfECLException raw )
    {
        if (raw.getECLException() != null)
        {
            this.eclExceptions = new ArrayList<ECLExceptionWrapper>();
            for ( int i = 0; i < raw.getECLException().length; i++)
            {
                this.eclExceptions.add(new ECLExceptionWrapper(raw.getECLException()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfECLExceptionWrapper [" + "eCLException = " + eclExceptions + "]";
    }

    public void setECLException( List<ECLExceptionWrapper> _eCLException )
    {
        this.eclExceptions = _eCLException;
    }

    public List<ECLExceptionWrapper> getECLException( )
    {
        return this.eclExceptions;
    }
}
