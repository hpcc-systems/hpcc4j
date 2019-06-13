package org.hpccsystems.ws.client.wrappers.wsworkunits;

import java.util.ArrayList;
import java.util.List;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfECLSourceFile;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLSourceFile;

public class ECLSourceFileWrapper
{
    private String fileCluster;

    private String name;

    private Boolean isSuperFile;

    private Integer subs;

    private Integer count;

    private List<ECLSourceFileWrapper> ECLSourceFiles=new ArrayList<ECLSourceFileWrapper>();

    public ECLSourceFileWrapper() {}

    public ECLSourceFileWrapper(ECLSourceFile raw)
    {
        if (raw==null) {
            return;
        }
        this.setCount(raw.getCount());
        this.setECLSourceFiles(raw.getECLSourceFiles());
        this.setFileCluster(raw.getFileCluster());
        this.setName(raw.getName());
        this.setSubs(raw.getSubs());
    }

    public ECLSourceFileWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLSourceFile raw)
    {
        if (raw==null)
        {
            return;
        }

        this.setCount(raw.getCount());
        this.setECLSourceFiles(raw.getECLSourceFiles());
        this.setFileCluster(raw.getFileCluster());
        this.setName(raw.getName());
        this.setSubs(raw.getSubs());
    }

    public ECLSourceFileWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLSourceFile raw)
    {
        if (raw==null)
        {
            return;
        }

        this.setCount(raw.getCount());
        this.setECLSourceFiles(raw.getECLSourceFiles());
        this.setFileCluster(raw.getFileCluster());
        this.setName(raw.getName());
        this.setSubs(raw.getSubs());
    }

    public ECLSourceFileWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLSourceFile raw)
    {
        if (raw==null)
        {
            return;
        }

        this.setCount(raw.getCount());
        this.setECLSourceFiles(raw.getECLSourceFiles());
        this.setFileCluster(raw.getFileCluster());
        this.setName(raw.getName());
        this.setSubs(raw.getSubs());
    }

    public ECLSourceFileWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLSourceFile raw)
    {
        if (raw==null)
        {
            return;
        }

        this.setCount(raw.getCount());
        this.setECLSourceFiles(raw.getECLSourceFiles());
        this.setFileCluster(raw.getFileCluster());
        this.setName(raw.getName());
        this.setSubs(raw.getSubs());
    }

    private void setECLSourceFiles(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ArrayOfECLSourceFile eclSourceFiles2)
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLSourceFile[] eclSourceFileArray = eclSourceFiles2.getECLSourceFile();
        for (int i = 0; i < eclSourceFileArray.length; i++)
        {
            ECLSourceFiles.add(new ECLSourceFileWrapper(eclSourceFileArray[i]));
        }
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLSourceFile getRaw()
    {
        return getRawVersion1_75();
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLSourceFile getRawVersion1_75()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLSourceFile raw =
                new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLSourceFile();

        raw.setCount(this.getCount());
        if (this.getECLSourceFiles().size()>0)
        {

            ArrayOfECLSourceFile arrayofeclsourcfiles = new ArrayOfECLSourceFile();
            for (int i=0; i < this.getECLSourceFiles().size();i++)
            {
                arrayofeclsourcfiles.addECLSourceFile(this.getECLSourceFiles().get(i).getRaw());
            }
            raw.setECLSourceFiles(arrayofeclsourcfiles);
        }

        raw.setFileCluster(this.getFileCluster());
        raw.setName(this.getName());
        raw.setSubs(this.getSubs());
        return raw;
    }

    /**
     * @return the fileCluster
     */
    public String getFileCluster()
    {
        return fileCluster;
    }

    /**
     * @param fileCluster the fileCluster to set
     */
    public void setFileCluster(String fileCluster)
    {
        this.fileCluster = fileCluster;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the isSuperFile
     */
    public Boolean getIsSuperFile()
    {
        return isSuperFile;
    }

    /**
     * @param isSuperFile the isSuperFile to set
     */
    public void setIsSuperFile(Boolean isSuperFile)
    {
        this.isSuperFile = isSuperFile;
    }

    /**
     * @return the subs
     */
    public Integer getSubs()
    {
        return subs;
    }

    /**
     * @param subs the subs to set
     */
    public void setSubs(Integer subs)
    {
        this.subs = subs;
    }

    /**
     * @return the count
     */
    public Integer getCount()
    {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(Integer count)
    {
        this.count = count;
    }

    /**
     * @return the eCLSourceFiles
     */
    public List<ECLSourceFileWrapper> getECLSourceFiles()
    {
        return ECLSourceFiles;
    }

    /**
     * @param eCLSourceFiles the eCLSourceFiles to set
     */
    public void setECLSourceFiles(List<ECLSourceFileWrapper> eCLSourceFiles)
    {
        ECLSourceFiles = eCLSourceFiles;
    }

    public void setECLSourceFiles(ArrayOfECLSourceFile eclSourceFiles)
    {
        ECLSourceFile[] eclSourceFileArray = eclSourceFiles.getECLSourceFile();
        for (int i = 0; i < eclSourceFileArray.length; i++)
        {
            ECLSourceFiles.add(new ECLSourceFileWrapper(eclSourceFileArray[i]));
        }
    }

    public void setECLSourceFiles(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ArrayOfECLSourceFile eclSourceFiles2)
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLSourceFile[] eclSourceFileArray = eclSourceFiles2.getECLSourceFile();
        for (int i = 0; i < eclSourceFileArray.length; i++)
        {
            ECLSourceFiles.add(new ECLSourceFileWrapper(eclSourceFileArray[i]));
        }
    }

    public void setECLSourceFiles(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLSourceFile eclSourceFiles)
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLSourceFile[] eclSourceFileArray = eclSourceFiles.getECLSourceFile();
        for (int i = 0; i < eclSourceFileArray.length; i++)
        {
            ECLSourceFiles.add(new ECLSourceFileWrapper(eclSourceFileArray[i]));
        }
    }

    public void setECLSourceFiles(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfECLSourceFile eclSourceFiles)
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLSourceFile[] eclSourceFileArray = eclSourceFiles.getECLSourceFile();
        for (int i = 0; i < eclSourceFileArray.length; i++)
        {
            ECLSourceFiles.add(new ECLSourceFileWrapper(eclSourceFileArray[i]));
        }
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ECLSourceFileWrapper [fileCluster=" + fileCluster + ", name=" + name + ", isSuperFile=" + isSuperFile
                + ", subs=" + subs + ", count=" + count + ", ECLSourceFiles=" + ECLSourceFiles + "]";
    }

}
