package org.hpccsystems.commons.errors;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Store a set of HpccErrorr.
 */
public class HpccErrorBlock
{

    private final CopyOnWriteArraySet<HpccError> he = new CopyOnWriteArraySet<>();

    /**
     * <p>Constructor for HpccErrorBlock.</p>
     */
    public HpccErrorBlock()
    {

    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    /** {@inheritDoc} */
    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        for (HpccError e : he)
        {
            s.append(e.toString()).append("\n");
        }
        return s.toString();
    }

    /**
     * <p>addAll.</p>
     *
     * @param items a {@link org.hpccsystems.commons.errors.HpccErrorBlock} object.
     */
    public void addAll(HpccErrorBlock items)
    {
        he.addAll(items.he);
    }

    /**
     * <p>getErrors.</p>
     *
     * @param st
     *            ErrorCode of errors to retrieve
     * @return HError objects with ErrorLevel=ERROR or ErrorLevel=FATAL containing the specified error code
     */
    public List<HpccError> getErrors(IErrorCode st)
    {
        List<HpccError> errs = getItems(HpccErrorLevel.ERROR, st);
        errs.addAll(getItems(HpccErrorLevel.FATAL, st));
        return errs;
    }

    /**
     * <p>getErrors.</p>
     *
     * @return HError objects with ErrorLevel=ERROR or ErrorLevel=FATAL
     */
    public List<HpccError> getErrors()
    {
        List<HpccError> errs = getItems(HpccErrorLevel.ERROR, null);
        errs.addAll(getItems(HpccErrorLevel.FATAL, null));
        return errs;
    }

    /**
     * <p>getWarnings.</p>
     *
     * @return All HError objects of ErrorLevel WARNING
     */
    public List<HpccError> getWarnings()
    {
        return getItems(HpccErrorLevel.WARNING, null);
    }

    /**
     * <p>getInfos.</p>
     *
     * @return All HError objects with ErrorLevel INFO
     */
    public List<HpccError> getInfos()
    {
        return getItems(HpccErrorLevel.INFO, null);
    }

    /**
     * <p>getItems.</p>
     *
     * @param errLevel
     *            - Level of HErrors to return
     * @param code
     *            - ErrorCode of HErrors to Return
     * @return - HError objects matching the input parameters
     */
    public List<HpccError> getItems(HpccErrorLevel errLevel, IErrorCode code)
    {
        List<HpccError> filtered = new ArrayList<HpccError>();
        for (HpccError err : he)
        {
            if ((errLevel == null || errLevel.equals(err.getErrorLevel()))
                    && (code == null || code.equals(err.getErrorCode())))
            {
                filtered.add(err);
            }
        }
        return filtered;
    }

    /**
     * <p>add.</p>
     *
     * @param err
     *            error to add
     */
    public void add(HpccError err)
    {
        if (err == null)
        {
            return;
        }
        synchronized (he)
        {
            he.add(err);
        }
    }

    /**
     * <p>toEclIdeString.</p>
     *
     * @return A collection of HErrors with ErrorLevel=ERROR/FATAL in ecl error format.
     *         filename(linenum,colnum):ErrorLevel ErrorCode.getNumVal():Error String
     */
    public String toEclIdeString()
    {
        StringBuilder sb = new StringBuilder();
        for (HpccError e : getErrors())
        {
            sb.append(e.toEclIdeString());
        }
        return sb.toString();
    }

    /**
     * <p>clear.</p>
     */
    public void clear()
    {
        he.clear();
    }

    /**
     * <p>size.</p>
     *
     * @return a int.
     */
    public int size()
    {
        return he.size();
    }

    /**
     * <p>asSet.</p>
     *
     * @return a {@link java.util.Set} object.
     */
    public Set<HpccError> asSet()
    {
        return he;
    }

    /**
     * <p>isEmpty.</p>
     *
     * @return a boolean.
     */
    public boolean isEmpty()
    {
        return he.isEmpty();
    }

}
