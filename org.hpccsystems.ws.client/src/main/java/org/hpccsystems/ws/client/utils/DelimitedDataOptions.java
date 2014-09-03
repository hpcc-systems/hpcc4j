package org.hpccsystems.ws.client.utils;

/**
 * @author pastrarx
 *
 * Represents variable/delimited field data formats
 */
public class DelimitedDataOptions
{
    public final static String csvDefaultSeparate   = "\\,";
    public final static String csvDefaultEscape     = "";
    public final static String csvDefaultQuote      = "'";
    public final static String csvDefaultTerminator = "\n";

    String recordTerminator;
    String fieldDelimiter;
    String escapeSequence;
    String quote;

    /**
     * Creates a default CSV field data format descriptor
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

    public String getRecordTerminator()
    {
        return recordTerminator;
    }

    public void setRecordTerminator(String recordTerminator)
    {
        this.recordTerminator = recordTerminator;
    }

    public String getFieldDelimiter()
    {
        return fieldDelimiter;
    }

    public void setFieldDelimiter(String fieldDelimiter)
    {
        this.fieldDelimiter = fieldDelimiter;
    }

    public String getEscapeSequence()
    {
        return escapeSequence;
    }

    public void setEscapeSequence(String escapeSequence)
    {
        this.escapeSequence = escapeSequence;
    }

    public String getQuote()
    {
        return quote;
    }

    public void setQuote(String quote)
    {
        this.quote = quote;
    }
}
