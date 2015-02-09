package org.hpccsystems.ws.client.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Vector;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class Sftp
{
    static public void lzPut(String localFileName, String hostname, String landingZonePath, String targetFileName, String machineLoginUsername, String password, boolean isLZLinux, Properties connconfig) throws Exception
    {
        {
            char lzSep;
            if (isLZLinux)
                lzSep = Utils.LINUX_SEP;
            else
                lzSep = Utils.WIN_SEP;

            if (hostname == null || hostname.length() == 0)
                throw new Exception("Target HPCC landingzone hostname is required");
            if (landingZonePath == null || landingZonePath.length()==0)
                throw new Exception("Target HPCC landing zone path is required");
            if (localFileName == null || localFileName.length()==0)
                throw new Exception ("Fully qualified local file path is required");

            File fileToUpload = new File(localFileName);
            if (!fileToUpload.isFile())
                throw new Exception ("Target file name does not appear to be a file: " + localFileName);

            if (targetFileName == null || targetFileName.length()==0)
                targetFileName = fileToUpload.getName();

            if (connconfig == null)
                connconfig = new java.util.Properties();

            if (!connconfig.containsKey("StrictHostKeyChecking"))
                connconfig.put("StrictHostKeyChecking", "no");

            Session session = null;
            Channel channel = null;
            try
            {
                JSch ssh = new JSch();
                session = ssh.getSession(machineLoginUsername, hostname, 22);
                session.setConfig(connconfig);
                session.setPassword(password);
                session.connect();

                channel = session.openChannel("sftp");
                channel.connect();

                ChannelSftp sftp = (ChannelSftp) channel;
                Vector<ChannelSftp.LsEntry> files;
                try
                {
                    files = (Vector<ChannelSftp.LsEntry>)sftp.ls(landingZonePath);
                    if (files == null || files.size() == 0)
                        throw new Exception();
                    else
                        System.out.print("Found landing zone " + landingZonePath + " with " + files.size() + " files\n");
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                    System.out.println("Could not contact Target landingzone");
                    return;
                }

                try
                {
                    System.out.println("Attempting to sftp " + localFileName + " to " + hostname + ":" + landingZonePath + lzSep +  targetFileName);
                    sftp.put(new FileInputStream(fileToUpload), landingZonePath + lzSep + targetFileName );
                    System.out.println("Finished Attempt to sftp " + localFileName + " to " + hostname + ":" + landingZonePath + lzSep +  targetFileName + " please verify");
                }
                catch (Exception e)
                {
                    System.out.println("Could not sftp " + localFileName + " to " + hostname + ":" + landingZonePath + lzSep +  targetFileName);
                    System.out.println(e.getLocalizedMessage());
                }
            }
            catch (Exception e)
            {
                System.out.println("Unexpected problem while attempting to perform LandingZone file transfer");
                System.out.println(e.getLocalizedMessage());
            }
            finally
            {
                if (channel != null)
                    channel.disconnect();
                if (session != null)
                    session.disconnect();
            }
        }
    }
}
