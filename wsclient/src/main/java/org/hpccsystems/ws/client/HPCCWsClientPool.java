package org.hpccsystems.ws.client;

import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.ObjectPool;

import io.opentelemetry.instrumentation.annotations.WithSpan;

/**
 * <p>HPCCWsClientPool class.</p>
 *
 */
public class HPCCWsClientPool extends ObjectPool<HPCCWsClient>
{
    private Connection       m_connection;
    /** Constant <code>DEFAULT_EXPIRE_MILLIS=60000</code> */
    public static final long DEFAULT_EXPIRE_MILLIS = 60000;

    /**
     * Instantiates a new HPCC ws client pool.
     *
     * @param protocol
     *            the protocol
     * @param targetWsECLWatchAddress
     *            the target ws ECL watch address
     * @param targetWsECLWatchPort
     *            the target ws ECL watch port
     * @param user
     *            the user
     * @param password
     *            the password
     * @param timeout
     *            the timeout
     */
    public HPCCWsClientPool(String protocol, String targetWsECLWatchAddress, String targetWsECLWatchPort, String user, String password, long timeout)
    {
        m_connection = new Connection(protocol, targetWsECLWatchAddress, targetWsECLWatchPort);
        if (m_connection != null)
        {
            m_connection.setCredentials(user, password);
        }
    }

    /**
     * Instantiates a new HPCC ws client pool.
     *
     * @param protocol
     *            the protocol
     * @param targetWsECLWatchAddress
     *            the target ws ECL watch address
     * @param targetWsECLWatchPort
     *            the target ws ECL watch port
     * @param user
     *            the user
     * @param password
     *            the password
     */
    public HPCCWsClientPool(String protocol, String targetWsECLWatchAddress, String targetWsECLWatchPort, String user, String password)
    {
        this(protocol, targetWsECLWatchAddress, targetWsECLWatchPort, user, password, DEFAULT_EXPIRE_MILLIS);
    }

    /**
     * Instantiates a new HPCC ws client pool.
     *
     * @param connection
     *            the connection
     */
    public HPCCWsClientPool(Connection connection)
    {
        this(connection, DEFAULT_EXPIRE_MILLIS);
    }

    /**
     * Instantiates a new HPCC ws client pool.
     *
     * @param connection
     *            the connection
     * @param timeout
     *            the timeout
     */
    @WithSpan
    public HPCCWsClientPool(Connection connection, long timeout)
    {
        super(timeout);
        m_connection = connection;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.hpccsystems.ws.client.utils.ObjectPool#create()
     */
    /** {@inheritDoc} */
    @Override
    @WithSpan
    protected HPCCWsClient create()
    {
        return (new HPCCWsClient(m_connection));
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.hpccsystems.ws.client.utils.ObjectPool#validate(java.lang.Object)
     */
    /** {@inheritDoc} */
    @Override
    @WithSpan
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

    /*
     * (non-Javadoc)
     * 
     * @see org.hpccsystems.ws.client.utils.ObjectPool#expire(java.lang.Object)
     */
    /** {@inheritDoc} */
    @Override
    public void expire(HPCCWsClient client)
    {
        client.updateConnection(null);
    }
}
