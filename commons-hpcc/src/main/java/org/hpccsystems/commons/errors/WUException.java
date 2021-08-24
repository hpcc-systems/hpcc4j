package org.hpccsystems.commons.errors;

import java.rmi.RemoteException;

public class WUException extends Exception
{
	/**
	 * Base Exception with a WUID field
	 * Useful in cases where workunit requests cause exceptions,
	 * and caller would like to know the offending WUID
	 */
	private static final long serialVersionUID = 1L;
	String wuid = null;

	public WUException(Throwable cause, String wuid) 
	{
		super(cause);
		setWuid(wuid);
	}

	public WUException(String message, RemoteException e, String wuid)
	{
		super(message, e);
		setWuid(wuid);
	}

	public String getWuid()
	{
		return wuid;
	}

	public Boolean hasWuid()
	{
		return wuid != null && !wuid.isEmpty();
	}

	public void setWuid(String wuid)
	{
		this.wuid = wuid;
	}
}
