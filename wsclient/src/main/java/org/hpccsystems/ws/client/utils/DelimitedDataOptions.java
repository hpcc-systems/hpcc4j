package org.hpccsystems.ws.client.utils;

/**
 * @author pastrarx
 *
 * Represents variable/delimited field data formats
 */

public class DelimitedDataOptions implements java.io.Serializable
{

	private static final long serialVersionUID = -5945517448265644272L;
	public final static String csvDefaultSeparate   = "\\,";
    public final static String csvDefaultEscape     = "";
    public final static String csvDefaultQuote      = "'";
    public final static String csvDefaultTerminator = "\n";

    String recordTerminator;
    String fieldDelimiter;
    String escapeSequence;
    String quote;

    /**
     * Creates a default CSV field data format descriptor.
     */
    public DelimitedDataOptions()
    {
        this.recordTerminator = csvDefaultTerminator;
        this.fieldDelimiter = csvDefaultSeparate;
        this.escapeSequence = csvDefaultEscape;
        this.quote = csvDefaultQuote;
    };

    /**
     * Creates a custom delimited field data format descriptor, options not provided are csv defaulted.
     *
     * @param recordTerminator
     *            the record terminator
     * @param fieldDelimiter
     *            the field delimiter
     * @param escapeSequence
     *            the escape sequence
     * @param quote
     *            the quote
     */
    public DelimitedDataOptions(String recordTerminator, String fieldDelimiter, String escapeSequence, String quote)
    {

        if (recordTerminator != null && recordTerminator.length() > 0)
            this.recordTerminator = recordTerminator;
        else
            this.recordTerminator = csvDefaultTerminator;

        if (fieldDelimiter != null && fieldDelimiter.length() > 0)
            this.fieldDelimiter = fieldDelimiter;
        else
            this.fieldDelimiter = csvDefaultSeparate;

        if (escapeSequence != null && escapeSequence.length() > 0)
            this.escapeSequence = escapeSequence;
        else
            this.escapeSequence = csvDefaultEscape;

        if (quote != null && quote.length() > 0)
            this.quote = quote;
        else
            this.quote = csvDefaultQuote;
    }

    /**
     * Gets the record terminator.
     *
     * @return the record terminator
     */
    public String getRecordTerminator()
    {
        return recordTerminator;
    }

    /**
     * Sets the record terminator.
     *
     * @param recordTerminator
     *            the new record terminator
     */
    public void setRecordTerminator(String recordTerminator)
    {
        this.recordTerminator = recordTerminator;
    }

    /**
     * Gets the field delimiter.
     *
     * @return the field delimiter
     */
    public String getFieldDelimiter()
    {
        return fieldDelimiter;
    }

    /**
     * Sets the field delimiter.
     *
     * @param fieldDelimiter
     *            the new field delimiter
     */
    public void setFieldDelimiter(String fieldDelimiter)
    {
        this.fieldDelimiter = fieldDelimiter;
    }

    /**
     * Gets the escape sequence.
     *
     * @return the escape sequence
     */
    public String getEscapeSequence()
    {
        return escapeSequence;
    }

    /**
     * Sets the escape sequence.
     *
     * @param escapeSequence
     *            the new escape sequence
     */
    public void setEscapeSequence(String escapeSequence)
    {
        this.escapeSequence = escapeSequence;
    }

    /**
     * Gets the quote.
     *
     * @return the quote
     */
    public String getQuote()
    {
        return quote;
    }

    /**
     * Sets the quote.
     *
     * @param quote
     *            the new quote
     */
    public void setQuote(String quote)
    {
        this.quote = quote;
    }
}
