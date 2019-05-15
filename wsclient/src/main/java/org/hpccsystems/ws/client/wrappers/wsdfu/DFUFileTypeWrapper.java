/**
 *
 */
package org.hpccsystems.ws.client.wrappers.wsdfu;

/**
 * DFUFileTypeWrapper
 *
 * Simple wrapper around WSDFU file type enum generated stub
 * Provides layer of indirection between caller and ESP version specific logic
 *
 */
public class DFUFileTypeWrapper extends org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileType
{
    public static final java.lang.String _Flat = "Flat";
    public static final java.lang.String _Index = "Index";
    public static final java.lang.String _Xml = "Xml";
    public static final java.lang.String _Csv = "Csv";
    public static final DFUFileTypeWrapper Flat = new DFUFileTypeWrapper(_Flat);
    public static final DFUFileTypeWrapper Index = new DFUFileTypeWrapper(_Index);
    public static final DFUFileTypeWrapper Xml = new DFUFileTypeWrapper(_Xml);
    public static final DFUFileTypeWrapper Csv = new DFUFileTypeWrapper(_Csv);

	private static final long serialVersionUID = 1L;

	protected DFUFileTypeWrapper(String value)
	{
		super(value);
	}
}
