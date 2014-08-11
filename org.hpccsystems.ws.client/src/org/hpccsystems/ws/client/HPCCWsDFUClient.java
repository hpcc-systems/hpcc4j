package org.hpccsystems.ws.client;

import java.io.FileNotFoundException;
import java.io.StringReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.axis.client.Stub;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.hpccsystems.ws.client.soap.wsdfu.ArrayOfEspException;
import org.hpccsystems.ws.client.soap.wsdfu.DFUBrowseDataRequest;
import org.hpccsystems.ws.client.soap.wsdfu.DFUBrowseDataResponse;
import org.hpccsystems.ws.client.soap.wsdfu.DFUDataColumn;
import org.hpccsystems.ws.client.soap.wsdfu.DFUGetDataColumnsRequest;
import org.hpccsystems.ws.client.soap.wsdfu.DFUGetDataColumnsResponse;
import org.hpccsystems.ws.client.soap.wsdfu.DFUInfoRequest;
import org.hpccsystems.ws.client.soap.wsdfu.DFUInfoResponse;
import org.hpccsystems.ws.client.soap.wsdfu.WsDfuServiceSoap;
import org.hpccsystems.ws.client.soap.wsdfu.WsDfuServiceSoapProxy;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.Utils;

/**
 * Use as soap client for HPCC WsDFU web service.
 *
 */
public class HPCCWsDFUClient
{
    public static final String WSDFUURI         = "/WsDFU";
    public static final String ROW_ELEMENT		= "Row";
    public static final String DATASET_ELEMENT	= "Dataset";
    private WsDfuServiceSoapProxy wsDfuServiceSoapProxy    =  null;
    private boolean verbose = false;

    /**
     * @param verbose - sets verbose mode
     */
    /**
     * @param verbose
     */
    public void setVerbose(boolean verbose)
    {
        this.verbose = verbose;
    }

    /**
     * Provides soapproxy object for HPCCWsDFUClient which can be used to access
     * the web service methods directly
     * @return  soapproxy for HPCCWsDFUClient
     * @throws Exception
     */
    /**
     * @return
     * @throws Exception
     */
    public WsDfuServiceSoapProxy getSoapProxy() throws Exception
    {
        if (wsDfuServiceSoapProxy != null) {        
            return wsDfuServiceSoapProxy;
        }
        else
        {
            throw new Exception("wsDfuServiceSoapProxy not available.");
        }
    }

    /**
     * @param logicalname
     * @param clustername
     * @return
     * @throws Exception
     */
    public DFUInfoResponse getFileInfo(String logicalname, String clustername) throws Exception {
    	WsDfuServiceSoapProxy proxy=getSoapProxy();
    	DFUInfoRequest req=new DFUInfoRequest();
    	req.setName(logicalname);
    	if (clustername != null) {
    		req.setCluster(clustername);
    	}
    	try {
    		DFUInfoResponse resp= proxy.DFUInfo(req);
    		if (resp==null) {
    			throw new FileNotFoundException(logicalname + " does not exist");
    		}
    		return resp;
    	}
    	catch (ArrayOfEspException e) {    		
    		if (e != null)	
	        {
	            for (org.hpccsystems.ws.client.soap.wsdfu.EspException espexception : e.getException())
	            {
	                Utils.println(System.out, "Error retrieving file type for file: " + espexception.getSource() + espexception.getMessage(), false, true);
	            }
	        }
    		e.printStackTrace();
        	throw e;
    	}
    	
    }
    	
    /**
     * @param logicalname
     * @param beginrow
     * @param numrows
     * @param clustername
     * @return
     * @throws Exception
     */
    public Element getFileData(String logicalname, Long beginrow, Integer numrows, String clustername) throws Exception  {
    	WsDfuServiceSoapProxy proxy=getSoapProxy();
    	DFUBrowseDataRequest req=new DFUBrowseDataRequest();
    	req.setLogicalName(logicalname);
    	if (clustername != null) {
    		req.setCluster(clustername);
    	}
    	if (beginrow ==null) {
    		beginrow=(long) 1;
    	}
    	if (numrows==null) {
    		numrows= 1;
    	}
    	req.setStart(beginrow);
    	req.setCount(numrows);
    	
    	try {
    		DFUBrowseDataResponse resp=proxy.DFUBrowseData(req);    
    		if (resp==null) {
    			return null;
    		}
    		String xmlresult= resp.getResult(); 
      	    SAXReader reader = new SAXReader();
      	    if (!xmlresult.contains("<" + DATASET_ELEMENT)) {
      	    	return null;
      	    }
      	    xmlresult=xmlresult.substring(xmlresult.indexOf("<" +DATASET_ELEMENT));
      	    Element dataset=null;
      	    try {
      	    	Document newNodeDocument = reader.read(new StringReader(xmlresult));
      	    	dataset = newNodeDocument.getRootElement();
      	    } catch (Exception e) {
      	    	e.printStackTrace();
      	    	return null;
      	    }
      	    return dataset;
    	}
    	catch (ArrayOfEspException e) {    		
    		if (e != null)	
	        {
	            for (org.hpccsystems.ws.client.soap.wsdfu.EspException espexception : e.getException())
	            {
	                Utils.println(System.out, "Error retrieving file type for file: " + espexception.getSource() + espexception.getMessage(), false, true);
	            }
	        }
    		e.printStackTrace();
        	throw e;
    	}
    }
    /**
     * @param logicalname - logical filename to retrieve the dfu data columns for. Currently this method/service call
     * 						functions for THOR files but will return nothing for CSV/XML/FLAT data files
     * @param clustername - optional. The cluster the logical filename is associated with.
     * @return ArrayList of DFUDataColumns
     * @throws Exception
     */
    public ArrayList<DFUDataColumn> getFileDataColumns(String logicalname, String clustername) throws Exception {
    	WsDfuServiceSoapProxy proxy=getSoapProxy();
    	DFUGetDataColumnsRequest req=new DFUGetDataColumnsRequest();
    	ArrayList<DFUDataColumn> cols=new ArrayList<DFUDataColumn>();
		
    	req.setOpenLogicalName(logicalname);
    	if (clustername != null) {
    		req.setCluster(clustername);
    	}
    	try {
    		DFUGetDataColumnsResponse resp=proxy.DFUGetDataColumns(req);
    		if (resp==null) {
    			return cols;
    		} 
    		//one of the few times reflection is actually useful
    		for (Method m : resp.getClass().getMethods())
    		{
    			    if (m.getName().startsWith("getDFUDataKeyedColumns") && m.getParameterTypes().length == 0) {
    			      final Object r = m.invoke(resp);
    			      DFUDataColumn[] thesecols=(DFUDataColumn[]) r;
    			      if (r != null) {
    			    	  cols.addAll(Arrays.asList(thesecols));
    			      }
    			    }
    			    if (m.getName().startsWith("getDFUDataNonKeyedColumns") && m.getParameterTypes().length == 0) {
      			      final Object r = m.invoke(resp);
      			      DFUDataColumn[] thesecols=(DFUDataColumn[]) r;
      			      if (r != null) 
      			      {
      			    	  cols.addAll(Arrays.asList(thesecols)); 
      			      }
      			    }
    		}    		
    	}
    	
    	catch (ArrayOfEspException e) {    		
    		if (e != null)	
	        {
	            for (org.hpccsystems.ws.client.soap.wsdfu.EspException espexception : e.getException())
	            {
	                Utils.println(System.out, "Error retrieving field names for file: " + espexception.getSource() + espexception.getMessage(), false, true);
	            }
	        }
    		e.printStackTrace();
        	throw e;
    	}
    	return cols;
    }
    /**
     * Provides the WSDL URL originally used to create the underlying stub code
     *
     * @return original WSLD URL
     */
    public static String getOriginalWSDLURL()
    {
        return (new org.hpccsystems.ws.client.soap.wsdfu.WsDfuLocator()).getWsDfuServiceSoapAddress();
    }

    /**
     * @param wsDfuServiceSoapProxy
     */
    public HPCCWsDFUClient(WsDfuServiceSoapProxy wsDfuServiceSoapProxy)
    {
        this.wsDfuServiceSoapProxy = wsDfuServiceSoapProxy;
    }

    /**
     * @param baseConnection
     */
    public HPCCWsDFUClient(Connection baseConnection)
    {
       this(baseConnection.getProtocol(), baseConnection.getHost(), baseConnection.getPort(), baseConnection.getUserName(), baseConnection.getPassword());
    }

    /**
     * @param protocol
     * @param targetHost
     * @param targetPort
     * @param user
     * @param pass
     */
    public HPCCWsDFUClient(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        String address = Connection.buildUrl(protocol, targetHost, targetPort, WSDFUURI);

        initHPCCWsDFUSoapProxy(address, user, pass);
    }

    
    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     * @param baseURL   Target service base URL
     * @param user      User credentials
     * @param pass      User credentials
     */
    private void initHPCCWsDFUSoapProxy(String baseURL, String user, String pass)
    {
        wsDfuServiceSoapProxy = new WsDfuServiceSoapProxy(baseURL);
        if (wsDfuServiceSoapProxy != null)
        {
                WsDfuServiceSoap wsDfuServiceSoap = wsDfuServiceSoapProxy.getWsDfuServiceSoap();
                if (wsDfuServiceSoap != null)
                {
                    if (user != null && pass != null)
                        Connection.initStub((Stub) wsDfuServiceSoap, user, pass);
                }
        }
    }
    
	/**
	 * This method retrieves a list of columns for a THOR or CSV dataset.
	 * 	-if THOR, this is a straightforward service call to get the columns.
	 * 	-if CSV, depending on whether or not the CSV was sprayed or output by thor, it may or may not
	 * 	- have a record definition associated with it. If it doesn't, the number of fields in the CSV
	 * 	- is calculated by retrieving the first line and splitting it on the separator, and returning
	 * 	- a list of string Field1, Field2, etc. fields (that match the standard CSV field naming conventions.)
	 * 
	 * @param datasetname - the name of the dataset to get dataset fields for. Can begin with '~' or not.
	 * @param clusterName - optional. If given, the name of the cluster associated with the dataset.
	 * @param fieldSeparator - optional. if given, and if the file being retrieved is a csv file, and if no field definitions 
	 * 									exist for that csv,. this separator will be used rather than the separator defined 
	 * 									during spraying when splitting up the first line of the file to define the number of fields
	 * @return	an ArrayList of DFUDataColumns containing the name and field type.
	 * @throws Exception
	 */
	/**
	 * @param datasetname
	 * @param clusterName
	 * @param fieldSeparator
	 * @return ArrayList of DFUDataColumn objects
	 * @throws Exception
	 */
	public ArrayList<DFUDataColumn> getDatasetFields(String datasetname, String clusterName, String fieldSeparator) throws Exception {
		String filetype="";
		DFUInfoResponse resp=null;
		try {
			resp=getFileInfo(datasetname,null);
			//thor files store filetype in content type
			filetype=resp.getFileDetail().getContentType();
			if (filetype==null || filetype.equals("")) 
			{
				//some csvs in OSS HPCC Store filetype in format
				filetype=resp.getFileDetail().getFormat();
				//csvs loaded as ascii get a format of "csv", csvs loaded as utf-8 get a format of "utf8"
				if (filetype.toLowerCase().startsWith("utf")) {
					filetype="CSV";
				}
				if (filetype==null || filetype.equals("")) 
				{
					//some HPCC-generated xml files use neither, check ecl record for xpath
					if (resp.getFileDetail().getEcl() != null && resp.getFileDetail().getEcl().toLowerCase().contains("xpath")) {
						filetype="XML";
					//in some cases THOR files have nothing in format or filetype, but if the file doesn't have any
						//identifying info but does have a record definition,
						//assume it's a THOR file
					} else if (resp.getFileDetail().getEcl() != null) {
						filetype="THOR";
					} else {
						throw new Exception("Unknown file format for logical file " + datasetname);
					}
				}
			}
			
		} catch (Exception e) {
			throw e;
		}
		ArrayList<DFUDataColumn> fields=new ArrayList<DFUDataColumn>();
		if (filetype.equalsIgnoreCase("THOR") || filetype.equalsIgnoreCase("FLAT")) {
			fields=getFileDataColumns(datasetname, null);
		} else if (filetype.equalsIgnoreCase("CSV")) {
			//CSVs created by HPCC have file data; sprayed csvs return only "line" from this call, and have their fields defined
			// in the record definition in the ecl attribute of dfu file info
			try {
				fields=getFileDataColumns(datasetname, null);
				if (fields.size()==2 && fields.get(0).getColumnLabel().equals("line")) {
					fields=new ArrayList<DFUDataColumn>();
				}
				if (fields != null && fields.size()>0) {
					return fields;
				}
			} catch (Exception e) {}
			if (fieldSeparator == null)
			{
				fieldSeparator=resp.getFileDetail().getCsvSeparate();
			}
			String ecl=resp.getFileDetail().getEcl();
			if (ecl==null || ecl.equals(""))
			{
				String firstrow=getFirstRow(datasetname,clusterName);
				if (firstrow != null) {
					String[] flds=firstrow.split(fieldSeparator);
					for (int i=0; i < flds.length; i++) {
						DFUDataColumn du=new DFUDataColumn();
						du.setColumnLabel("Field" + String.valueOf(i+1));
						du.setColumnType("STRING");
						fields.add(du);
					}
				}
			} else {
				fields=this.getRecordFromECL(ecl);
			}
		} else if (filetype.equalsIgnoreCase("XML")) {
			String ecl=resp.getFileDetail().getEcl();
			if (ecl!=null && !ecl.equals(""))
			{
				fields=this.getRecordFromECL(ecl);
			}
		}	
		return fields;
	}
	/**
	 * Returns the first row of data for a dataset
	 * @param datasetname - logical filename, with or without '~' at the beginning
	 * @param clustername - optional. name of the cluster the file's associated with
	 * @return a String of data representing the first row in the file.
	 * @throws Exception
	 */
	public String getFirstRow(String datasetname, String clustername) throws Exception {
		Element rowdata=getFileData(datasetname, (long)1, 1,clustername);
		if (rowdata != null && rowdata.element(ROW_ELEMENT) != null) {
			String firstrow=rowdata.element(ROW_ELEMENT).getStringValue();
			if (firstrow != null) {
				return firstrow;
			}
		}
		return null;
	}

	/**
	 * @param eclRecordDefinition - a RECORD definition, either in RECORD\nSTRING1\nEND; format, or in {STRING1 field} inline format,.
	 * 			currently handles XPATH recordsets but doesn't save XPATH info. A few issues with child dataset records
	 * @return An ArrayList of DFUDataColumns 
	 * @throws Exception
	 */
	private ArrayList<DFUDataColumn> getRecordFromECL(String eclRecordDefinition) throws Exception {
		ArrayList<DFUDataColumn> cols=new ArrayList<DFUDataColumn>();
		eclRecordDefinition=eclRecordDefinition.replaceAll("(;|,|RECORD|\\{|\\})","\n");
		eclRecordDefinition=eclRecordDefinition.replaceAll("RECORD","RECORD\n");
		eclRecordDefinition=eclRecordDefinition.replaceAll("\n\n","\n");
		String[] lines=eclRecordDefinition.split("\n");
		for (int i=0; i < lines.length; i++) {
			String thisline=lines[i].trim();
			if (thisline.equals("")) {
				continue;
			}
			if (thisline.matches("(RECORD|END|\\{|\\})")){
				continue;
			}
			//TODO: handle xml field definitions
			if (thisline.toLowerCase().contains("xpath")){
				continue;
			}
			String[] fieldargs=thisline.split(" ");
			if (fieldargs.length < 2) {
				throw new Exception("Invalid record field definition " + thisline);
			}
			if (!fieldargs[0].toUpperCase().matches("(STRING|INTEGER|QSTRING|UTF|UNSIGNED|INTEGER|UNICODE|DATA|VARSTRING|VARUNICODE|DECIMAL|REAL)\\d{0,3}")) {
				throw new Exception("Invalid record field type " + fieldargs[0]);
			}
			DFUDataColumn col=new DFUDataColumn();
			col.setColumnType(fieldargs[0].toUpperCase());
			col.setColumnLabel(fieldargs[1]);
			cols.add(col);
		}
		return cols;
	}
}
