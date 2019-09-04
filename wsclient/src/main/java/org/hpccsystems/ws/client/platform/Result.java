/*******************************************************************************
 * Copyright (c) 2011 HPCC Systems. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.ws.client.platform;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLResult;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUResultResponse;
import org.hpccsystems.ws.client.utils.DataSingleton;
import org.hpccsystems.ws.client.utils.DatasetParser;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.wrappers.WUState;
import org.xml.sax.InputSource;

public class Result extends DataSingleton
{
    private static Map<Integer, Result> Results = new HashMap<Integer, Result>();

    public static synchronized Result get(Workunit workunit, Integer sequence)
    {
        Result result = new Result(workunit, sequence);
        if (Results.containsKey(result.hashCode()))
        {
            return Results.get(result.hashCode());
        }
        else
        {
            Results.put(result.hashCode(), result);
        }
        return result;
    }

    private Workunit  workunit;
    private ECLResult info;

    public enum Notification
    {
        RESULT
    }

    class ResultData
    {
        final int                       PAGE_SIZE   = 180;
        final int                       PAGE_BEFORE = 60;
        Map<Long, Map<Integer, String>> data;

        ResultData()
        {
            data = new HashMap<Long, Map<Integer, String>>();
        }

        String GetCell(long row, int col)
        {
            if (data.containsKey(row))
            {
                return data.get(row).get(col);
            }

            Long start = row;
            for (int i = 0; i < PAGE_BEFORE; ++i)
            {
                if (start - 1 < 0)
                {
                    break;
                }

                if (data.containsKey(start - 1))
                {
                    break;
                }

                --start;
            }

            int count = (int) (row - start);
            for (int i = count; i < PAGE_SIZE; ++i)
            {
                if (data.containsKey(start + count))
                {
                    break;
                }
                ++count;
            }

            HPCCWsWorkUnitsClient wsWorkunitsClient;
            try
            {
                wsWorkunitsClient = workunit.getPlatform().getWsClient().getWsWorkunitsClient();
                WUResultResponse response = wsWorkunitsClient.fetchRawResults(workunit.getWuid(), true, info.getSequence(), null, true, start, count);

                String resultString = response.getResult();

                if (resultString != null && !resultString.isEmpty())
                {
                    //Rodrigo: this is using the migrated parser...
                    //I'm more inclined to use Utils.parseECLResults
                    int offset = resultString.indexOf("<Dataset");
                    resultString = resultString.substring(offset);
                    new DatasetParser(response.getStart(), new InputSource(new StringReader(resultString)), data);
                    return data.get(row).get(col);
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            return data.get(row).get(col);
        }
    }

    ResultData data;

    private Result(Workunit workunit, Integer sequence)
    {
        this.workunit = workunit;
        info = new ECLResult();
        info.setSequence(sequence);
        data = new ResultData();
        setChanged();
    }

    public Workunit getWorkunit()
    {
        return workunit;
    }

    public String getWuid()
    {
        return workunit.getWuid();
    }

    public Integer getSequence()
    {
        return info.getSequence();
    }

    public String getResultName()
    {
        return info.getName();
    }

    public String getName()
    {
        return info.getName();
    }

    public String getValue()
    {
        return info.getValue();
    }

    public WUState getStateID()
    {
        if (/*info.getTotal() != null &&*/ info.getTotal() != -1)
        {
            return WUState.COMPLETED;
        }
        return WUState.UNKNOWN;
    }

    public Long getTotal()
    {
        return info.getTotal();
    }

    public String[] getResultViews()
    {
        return workunit.getResultViews();
    }

    @Override
    public boolean isComplete()
    {
        return HPCCWsWorkUnitsClient.isWorkunitComplete(getStateID()) || workunit.isComplete();
    }

    public int getColumnCount()
    {
        if (info.getECLSchemas() == null)
        {
            return 0;
        }
        return info.getECLSchemas().getECLSchemaItem().length;
    }

    public String getColumnName(int i)
    {
        if (info.getECLSchemas() == null)
        {
            return "";
        }
        return info.getECLSchemas().getECLSchemaItem()[i].getColumnName();
    }

    public String getCell(int row, int col)
    {
        return data.GetCell(row, col);
    }

    // Refresh + Update ---
    @Override
    protected void fastRefresh()
    {
        fullRefresh();
    }

    @Override
    protected void fullRefresh()
    {
        workunit.getResults();
    }

    // Updates ---
    boolean update(ECLResult result)
    {
        boolean retVal = false;
        if (result != null && info.getSequence() == result.getSequence() && !info.equals(result))
        {
            if (UpdateState(result))
            {
                retVal = true;
                notifyObservers(Notification.RESULT);
            }
        }
        monitor();
        return retVal;
    }

    synchronized boolean UpdateState(ECLResult result)
    {
        if (result != null && info.getSequence() == result.getSequence() && EqualsUtil.hasChanged(info, result))
        {

            assert (result.getECLSchemas() != null);
            info = result;
            setChanged();
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object aThat)
    {
        if (this == aThat)
        {
            return true;
        }

        if (!(aThat instanceof Result))
        {
            return false;
        }
        Result that = (Result) aThat;

        // now a proper field-by-field evaluation can be made
        return EqualsUtil.areEqual(workunit, that.workunit)
                && EqualsUtil.areEqual(info.getSequence(), that.info.getSequence());
    }

    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, workunit);
        result = HashCodeUtil.hash(result, info.getSequence());
        return result;
    }

}
