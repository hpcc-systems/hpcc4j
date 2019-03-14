package org.hpccsystems.ws.client.wrappers.wsworkunits;

import java.util.ArrayList;
import java.util.List;

public class ECLSourceFileWrapper
{
    private String fileCluster;

    private String name;

    private Boolean isSuperFile;

    private Integer subs;

    private Integer count;

    private List<ECLSourceFileWrapper> ECLSourceFiles=new ArrayList<ECLSourceFileWrapper>();

    public ECLSourceFileWrapper() {}

    public ECLSourceFileWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLSourceFile raw) {
        if (raw==null) {
            return;
        }
        this.setCount(raw.getCount());
        this.setECLSourceFiles(raw.getECLSourceFiles());
        this.setFileCluster(raw.getFileCluster());
        this.setName(raw.getName());
        this.setSubs(raw.getSubs());
    }

    public ECLSourceFileWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ECLSourceFile raw) {
        if (raw==null) {
            return;
        }
        this.setCount(raw.getCount());
        this.setECLSourceFiles(raw.getECLSourceFiles());
        this.setFileCluster(raw.getFileCluster());
        this.setName(raw.getName());
        this.setSubs(raw.getSubs());
    }

    public ECLSourceFileWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLSourceFile raw) {
        if (raw==null) {
            return;
        }
        this.setCount(raw.getCount());
        this.setECLSourceFiles(raw.getECLSourceFiles());
        this.setFileCluster(raw.getFileCluster());
        this.setName(raw.getName());
        this.setSubs(raw.getSubs());
    }
    public ECLSourceFileWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLSourceFile raw) {
        if (raw==null) {
            return;
        }
        this.setCount(raw.getCount());
        this.setECLSourceFiles(raw.getECLSourceFiles());
        this.setFileCluster(raw.getFileCluster());
        this.setName(raw.getName());
        this.setSubs(raw.getSubs());
    }

    public ECLSourceFileWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLSourceFile raw) {
        if (raw==null) {
            return;
        }
        this.setCount(raw.getCount());
        this.setECLSourceFiles(raw.getECLSourceFiles());
        this.setFileCluster(raw.getFileCluster());
        this.setName(raw.getName());
        this.setSubs(raw.getSubs());
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLSourceFile getRaw() {
        return getRawVersion74();
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLSourceFile getRawVersion74() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLSourceFile raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLSourceFile();
        raw.setCount(this.getCount());
        if (this.getECLSourceFiles().size()>0) {
            raw.setECLSourceFiles(new org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLSourceFile[this.getECLSourceFiles().size()]);
            for (int i=0; i < this.getECLSourceFiles().size();i++) {
                raw.getECLSourceFiles()[i]=this.getECLSourceFiles().get(i).getRaw();
            }
        }
        raw.setFileCluster(this.getFileCluster());
        raw.setName(this.getName());
        raw.setSubs(this.getSubs());
        return raw;
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLSourceFile getRawVersion1_69() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLSourceFile raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLSourceFile();
        raw.setCount(this.getCount());
        if (this.getECLSourceFiles().size()>0) {
            raw.setECLSourceFiles(new org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLSourceFile[this.getECLSourceFiles().size()]);
            for (int i=0; i < this.getECLSourceFiles().size();i++) {
                raw.getECLSourceFiles()[i]=this.getECLSourceFiles().get(i).getRawVersion1_69();
            }
        }
        raw.setFileCluster(this.getFileCluster());
        raw.setName(this.getName());
        raw.setSubs(this.getSubs());
        return raw;
    }
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLSourceFile getRawVersion1_62() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLSourceFile raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLSourceFile();
        raw.setCount(this.getCount());
        if (this.getECLSourceFiles().size()>0) {
            raw.setECLSourceFiles(new org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLSourceFile[this.getECLSourceFiles().size()]);
            for (int i=0; i < this.getECLSourceFiles().size();i++) {
                raw.getECLSourceFiles()[i]=this.getECLSourceFiles().get(i).getRawVersion1_62();
            }
        }
        raw.setFileCluster(this.getFileCluster());
        raw.setName(this.getName());
        raw.setSubs(this.getSubs());
        return raw;
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLSourceFile getRawVersion1_58() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLSourceFile raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLSourceFile();
        raw.setCount(this.getCount());
        if (this.getECLSourceFiles().size()>0) {
            raw.setECLSourceFiles(new org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLSourceFile[this.getECLSourceFiles().size()]);
            for (int i=0; i < this.getECLSourceFiles().size();i++) {
                raw.getECLSourceFiles()[i]=this.getECLSourceFiles().get(i).getRawVersion1_58();
            }
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

    public void setECLSourceFiles(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLSourceFile[] eclSourceFiles2)
    {
        this.getECLSourceFiles().clear();
        if (eclSourceFiles2 != null) {
            for (int i=0; i < eclSourceFiles2.length;i++) {
                this.ECLSourceFiles.add(new ECLSourceFileWrapper(eclSourceFiles2[i]));
            }
        }
    }

    public void setECLSourceFiles(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ECLSourceFile[] eclSourceFiles2)
    {
        this.getECLSourceFiles().clear();
        if (eclSourceFiles2 != null) {
            for (int i=0; i < eclSourceFiles2.length;i++) {
                this.ECLSourceFiles.add(new ECLSourceFileWrapper(eclSourceFiles2[i]));
            }
        }
    }
    public void setECLSourceFiles(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLSourceFile[] eclSourceFiles2)
    {
        this.getECLSourceFiles().clear();
        if (eclSourceFiles2 != null) {
            for (int i=0; i < eclSourceFiles2.length;i++) {
                this.ECLSourceFiles.add(new ECLSourceFileWrapper(eclSourceFiles2[i]));
            }
        }
    }

    public void setECLSourceFiles(org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLSourceFile[] eclSourceFiles2)
    {
        this.getECLSourceFiles().clear();
        if (eclSourceFiles2 != null) {
            for (int i=0; i < eclSourceFiles2.length;i++) {
                this.ECLSourceFiles.add(new ECLSourceFileWrapper(eclSourceFiles2[i]));
            }
        }
    }


    public void setECLSourceFiles(org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLSourceFile[] eclSourceFiles2)
    {
        this.getECLSourceFiles().clear();
        if (eclSourceFiles2 != null) {
            for (int i=0; i < eclSourceFiles2.length;i++) {
                this.ECLSourceFiles.add(new ECLSourceFileWrapper(eclSourceFiles2[i]));
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
                + ", subs=" + subs + ", count=" + count + ", ECLSourceFiles=" + ECLSourceFiles + "]";
    }

}
