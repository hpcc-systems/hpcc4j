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
    private List<ECLSourceFileWrapper> eclSourceFiles = new ArrayList<ECLSourceFileWrapper>();

    /**
     * Instantiates a new ECL source file wrapper.
     */
    public ECLSourceFileWrapper() {}

    /**
     * Instantiates a new ECL source file wrapper.
     *
     * @param raw
     *            the raw
     */
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

    /**
     * Instantiates a new ECL source file wrapper.
     *
     * @param raw
     *            the raw
     */
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

    /**
     * Instantiates a new ECL source file wrapper.
     *
     * @param raw
     *            the raw
     */
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

    /**
     * Instantiates a new ECL source file wrapper.
     *
     * @param raw
     *            the raw
     */
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

    /**
     * Instantiates a new ECL source file wrapper.
     *
     * @param raw
     *            the raw
     */
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

    /**
     * Sets the ECL source files.
     *
     * @param eclSourceFiles2
     *            the new ECL source files
     */
    private void setECLSourceFiles(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ArrayOfECLSourceFile eclSourceFiles2)
    {
        if (eclSourceFiles2 != null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLSourceFile[] eclSourceFileArray = eclSourceFiles2.getECLSourceFile();
            for (int i = 0; i < eclSourceFileArray.length; i++)
            {
                eclSourceFiles.add(new ECLSourceFileWrapper(eclSourceFileArray[i]));
            }
        }
    }

    /**
     * Gets the raw.
     *
     * @return the raw
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLSourceFile getRaw()
    {
        return getRawVersion1_75();
    }

    /**
     * Gets the raw version 1 75.
     *
     * @return the raw version 1 75
     */
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
     * Gets the file cluster.
     *
     * @return the fileCluster
     */
    public String getFileCluster()
    {
        return fileCluster;
    }

    /**
     * Sets the file cluster.
     *
     * @param fileCluster
     *            the fileCluster to set
     */
    public void setFileCluster(String fileCluster)
    {
        this.fileCluster = fileCluster;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name
     *            the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Gets the checks if is super file.
     *
     * @return the isSuperFile
     */
    public Boolean getIsSuperFile()
    {
        return isSuperFile;
    }

    /**
     * Sets the checks if is super file.
     *
     * @param isSuperFile
     *            the isSuperFile to set
     */
    public void setIsSuperFile(Boolean isSuperFile)
    {
        this.isSuperFile = isSuperFile;
    }

    /**
     * Gets the subs.
     *
     * @return the subs
     */
    public Integer getSubs()
    {
        return subs;
    }

    /**
     * Sets the subs.
     *
     * @param subs
     *            the subs to set
     */
    public void setSubs(Integer subs)
    {
        this.subs = subs;
    }

    /**
     * Gets the count.
     *
     * @return the count
     */
    public Integer getCount()
    {
        return count;
    }

    /**
     * Sets the count.
     *
     * @param count
     *            the count to set
     */
    public void setCount(Integer count)
    {
        this.count = count;
    }

    /**
     * Gets the ECL source files.
     *
     * @return the eCLSourceFiles
     */
    public List<ECLSourceFileWrapper> getECLSourceFiles()
    {
        return eclSourceFiles;
    }

    /**
     * Sets the ECL source files.
     *
     * @param eCLSourceFiles
     *            the eCLSourceFiles to set
     */
    public void setECLSourceFiles(List<ECLSourceFileWrapper> eCLSourceFiles)
    {
        eclSourceFiles = eCLSourceFiles;
    }

    /**
     * Sets the ECL source files.
     *
     * @param sourceFiles
     *            the new ECL source files
     */
    public void setECLSourceFiles(ArrayOfECLSourceFile sourceFiles)
    {
        if (sourceFiles != null)
        {
            ECLSourceFile[] eclSourceFileArray = sourceFiles.getECLSourceFile();
            for (int i = 0; i < eclSourceFileArray.length; i++)
            {
                eclSourceFiles.add(new ECLSourceFileWrapper(eclSourceFileArray[i]));
            }
        }
    }

    /**
     * Sets the ECL source files.
     *
     * @param eclSourceFiles2
     *            the new ECL source files
     */
    public void setECLSourceFiles(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ArrayOfECLSourceFile eclSourceFiles2)
    {
        if (eclSourceFiles2 != null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLSourceFile[] eclSourceFileArray = eclSourceFiles2.getECLSourceFile();
            for (int i = 0; i < eclSourceFileArray.length; i++)
            {
                eclSourceFiles.add(new ECLSourceFileWrapper(eclSourceFileArray[i]));
            }
        }
    }

    /**
     * Sets the ECL source files.
     *
     * @param sourceFiles
     *            the new ECL source files
     */
    public void setECLSourceFiles(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLSourceFile sourceFiles)
    {
        if (sourceFiles != null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLSourceFile[] eclSourceFileArray = sourceFiles.getECLSourceFile();
            for (int i = 0; i < eclSourceFileArray.length; i++)
            {
                eclSourceFiles.add(new ECLSourceFileWrapper(eclSourceFileArray[i]));
            }
        }
    }

    /**
     * Sets the ECL source files.
     *
     * @param sourceFiles
     *            the new ECL source files
     */
    public void setECLSourceFiles(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfECLSourceFile sourceFiles)
    {
        if (sourceFiles != null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLSourceFile[] eclSourceFileArray = sourceFiles.getECLSourceFile();
            for (int i = 0; i < eclSourceFileArray.length; i++)
            {
                eclSourceFiles.add(new ECLSourceFileWrapper(eclSourceFileArray[i]));
            }
        }
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ECLSourceFileWrapper [fileCluster=" + fileCluster + ", name=" + name + ", isSuperFile=" + isSuperFile
                + ", subs=" + subs + ", count=" + count + ", eclSourceFiles=" + eclSourceFiles + "]";
    }

}
