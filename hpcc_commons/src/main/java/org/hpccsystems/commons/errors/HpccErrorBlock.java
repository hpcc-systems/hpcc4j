package org.hpccsystems.commons.errors;

import org.apache.commons.lang3.StringEscapeUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Store a set of HpccErrorr.
 *
 */

public class HpccErrorBlock {

	private final CopyOnWriteArraySet<HpccError> he = new CopyOnWriteArraySet<>();

	public HpccErrorBlock() {
	    
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String s="";
		for ( HpccError e : he)
			s = s  + e.toString() + "\n";
		return s;
	}

    public void addAll(HpccErrorBlock items) {
        he.addAll(items.he);
	}

	/**
     * @param st  ErrorCode of errors to retrieve
     * @return  HError objects with ErrorLevel=ERROR or ErrorLevel=FATAL containing the specified error code
     */
    public List<HpccError> getErrors(IHpccErrorCode st) {
	    List<HpccError> errs= getItems(HpccErrorLevel.ERROR, st);
	    errs.addAll(getItems(HpccErrorLevel.FATAL, st));
	    return errs;
    }

    /**
     * @return HError objects with ErrorLevel=ERROR or ErrorLevel=FATAL
     */
    public List<HpccError> getErrors() {
    	List<HpccError> errs=  getItems(HpccErrorLevel.ERROR, null);
    	errs.addAll(getItems(HpccErrorLevel.FATAL, null));
  	    return errs;
    }

    /**
     * @return  All HError objects of ErrorLevel WARNING
     */
    public List<HpccError> getWarnings() {
    	 return getItems(HpccErrorLevel.WARNING, null);
    }

    /**
     * @return  All HError objects with ErrorLevel INFO
     */
    public List<HpccError> getInfos() {
    	 return getItems(HpccErrorLevel.INFO, null);
    }

    /**
     * @param errLevel - Level of HErrors to return
     * @param code - ErrorCode of HErrors to Return
     * @return - HError objects matching the input parameters
     */
    public List<HpccError> getItems(HpccErrorLevel errLevel, IHpccErrorCode code) {
    	List<HpccError> filtered=new ArrayList<HpccError>();
    	for (HpccError err:he) {
    		if ((errLevel==null || errLevel.equals(err.getErrorLevel()))
    				&& (code==null || code.equals(err.getErrorCode()))
    				) {
    			filtered.add(err);
    		}	        	
    	}
    	return filtered;
	}

    
    /**
     * @param err error to add
     */
    public void add(HpccError err) {
		synchronized(he)
		{
			he.add(err);
		}
	}

	/**
     * @return  the HError objects for Errors/Fatals - converted to an HTML Error String. Example: <p class='erroritem'>Html-escaped error string</p>
     */
    public String toHtmlErrorString() {
    	StringBuilder sb=new StringBuilder();
    	for ( HpccError e : getErrors())
    	{
    		sb.append("<p class='erroritem'>").append(StringEscapeUtils.escapeHtml4(e.getMessage())).append("</p>");
    	}
		return sb.toString();
	}

	/**
	 * @return  A collection of all HErrors in ECL Error string format
 	 * filename(linenum,colnum):ErrorLevel ErrorCode.getNumVal():Error String
	 */
	public String toECLString() {
		StringBuilder sb=new StringBuilder();
		for ( HpccError e:he)
		{
			sb.append(e.toECLErrorString());
		}
		return sb.toString();
	}

	/**
	 * @return A collection of HErrors with ErrorLevel=ERROR/FATAL in ecl error format.
	 * filename(linenum,colnum):ErrorLevel ErrorCode.getNumVal():Error String
	 * 
	 */
	public String toECLErrorString() {
		StringBuilder sb=new StringBuilder();
		for ( HpccError e : getErrors() )
		{
		   sb.append(e.toECLErrorString());
		}
		return sb.toString();
	}

	/**
	 * All errors/warnings converted to messages
	 * @return  a concatenated string of all errors/warnings
	 */
	public String toMessageString() {
		StringBuilder sb=new StringBuilder();
		for (HpccError e:he) {
			sb.append(e.getMessage());
		}
		return sb.toString();
	}
	
	public void clear() {
		he.clear();
	}
	public int size() {
		return he.size();
	}
	public Set<HpccError> asSet() {
		return he;
	}
	public boolean isEmpty() { return he.isEmpty(); }

}

