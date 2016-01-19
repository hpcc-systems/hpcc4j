package org.hpccsystems.ws.client;

import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.ObjectPool;

public class HPCCWsClientPool extends ObjectPool<HPCCWsClient>
{
    private Connection m_connection;
    public static final long DEFAULT_EXPIRE_MILLIS = 60000;

    public HPCCWsClientPool(String protocol, String targetWsECLWatchAddress, String targetWsECLWatchPort, String user, String password, long timeout)
    {
        m_connection = new Connection(protocol, targetWsECLWatchAddress, targetWsECLWatchPort);
        if (m_connection != null)
        {
            m_connection.setCredentials(user, password);
        }
    }

    public HPCCWsClientPool(String protocol, String targetWsECLWatchAddress, String targetWsECLWatchPort, String user, String password)
    {
        this(protocol, targetWsECLWatchAddress, targetWsECLWatchPort, user, password, DEFAULT_EXPIRE_MILLIS);
    }
    
    public HPCCWsClientPool(Connection connection)
    {
        this(connection, DEFAULT_EXPIRE_MILLIS);
    }

    public HPCCWsClientPool(Connection connection, long timeout)
    {
        super(timeout);
        m_connection = connection;
    }

    @Override
    protected HPCCWsClient create()
    {
        return (new HPCCWsClient(m_connection));
    }

    @Override
    public boolean validate(HPCCWsClient client)
    {
        try
        {
            return client.pingServer();
        }
        catch (Exception e)
        {
            return false;
        }
    }

    @Override
    public void expire(HPCCWsClient client)
    {
        client.updateConnection(null);
    }
}
