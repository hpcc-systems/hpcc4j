package org.hpccsystems.commons.network;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashMap;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Network
{
    private static final Logger log = LogManager.getLogger(Network.class);

    /**
     * Provides non-loopback address bound to given NIC name.
     *
     * @param interfacename
     *            - The NIC name to draw the local address from, or '*'
     * @return - Local ipv4 address
     * @throws Exception
     *             the exception
     */
    public static String getLocalAddress(String interfacename) throws Exception
    {
        return getLocalAddress(interfacename, false);
    }

    /**
     * Provides non-loopback address bound to given NIC name.
     *
     * @param interfacename
     *            - The NIC name to draw the local address from, or '*'
     * @param ipv6
     *            - True if ipv6 desired, False if ipv4 desired
     * @return the local address
     * @throws Exception
     *             the exception
     */
    public static String getLocalAddress(String interfacename, boolean ipv6) throws Exception
    {
        if (interfacename == null || interfacename.isEmpty()) throw new Exception("getLocalAddress: Must provide valid NIC name, or '*'");

        if (interfacename.trim().equals("*"))
        {
            Enumeration<NetworkInterface> nics;
            try
            {
                nics = NetworkInterface.getNetworkInterfaces();
                while (nics.hasMoreElements())
                {
                    NetworkInterface nic = nics.nextElement();
                    Enumeration<InetAddress> addresses = nic.getInetAddresses();
                    while (addresses.hasMoreElements())
                    {
                        InetAddress addr = addresses.nextElement();
                        if (!addr.isLoopbackAddress())
                        {
                            if ((addr instanceof Inet4Address && !ipv6) || (addr instanceof Inet6Address && ipv6)) return addr.getHostAddress();
                        }
                    }
                }
            }
            catch (SocketException e)
            {
                throw new Exception("getLocalAddress: Failed to retrieve local network address information", e);
            }
        }
        else
        {
            NetworkInterface nic = NetworkInterface.getByName(interfacename);
            Enumeration<InetAddress> addresses = nic.getInetAddresses();

            while (addresses.hasMoreElements())
            {
                InetAddress addr = addresses.nextElement();
                if ((addr instanceof Inet4Address && !ipv6) || (addr instanceof Inet6Address && ipv6)) return addr.getHostAddress();
            }
        }

        throw new Exception("getLocalAddress: Could not find local address");
    }

    /**
     * Determines if address provided is considered a local address
     * Uses cached list of all non-loopback addresses bound to all local NICs.
     *
     * @param address
     *            ipv4/6 to be compared to all known local addresses
     * @return True if address is part of known local addresses False otherwise
     */
    public static boolean isLocalAddress(String address)
    {
        return LocalAddresses.containsKey(address.toUpperCase());
    }

    private static HashMap<String, InetAddress> LocalAddresses = new HashMap<String, InetAddress>();
    static
    {
        Enumeration<NetworkInterface> ifaces;
        try
        {
            ifaces = NetworkInterface.getNetworkInterfaces();
            while (ifaces.hasMoreElements())
            {
                NetworkInterface iface = ifaces.nextElement();
                Enumeration<InetAddress> addresses = iface.getInetAddresses();

                while (addresses.hasMoreElements())
                {
                    InetAddress addr = addresses.nextElement();
                    if (!addr.isLoopbackAddress()) LocalAddresses.put(addr.getHostAddress().toUpperCase(), addr);
                }
            }
        }
        catch (SocketException e)
        {
            log.error("Failed to retrieve local network address information");
            log.error(e);
        }
    }
}
