/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2020 HPCC Systems®.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package org.hpccsystems.commons.benchmarking;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 * Helper class that sums together metrics with the same name.
 */
public class MetricSumTransformer implements IMetricSetTransformer
{
    @Override
    public List<IMetric> transform(List<IMetric> metrics)
    {
        if (metrics.size() == 0)
        {
            return metrics;
        }

        // Sort metrics by name
        Comparator<IMetric> compare = new Comparator<IMetric>()
        {
            public int compare(IMetric m1, IMetric m2)
            {
                return m1.getName().compareTo(m2.getName());
            }
        };
        Collections.sort(metrics,compare);

        // Combine metrics with the same name
        ArrayList<IMetric> summedMetrics = new ArrayList<IMetric>();
        
        SimpleMetric workingMetric = new SimpleMetric(metrics.get(0));
        summedMetrics.add(workingMetric);
        for (int i = 1; i < metrics.size(); i++)
        {
            IMetric curMetric = metrics.get(i);
            if (workingMetric.getName() != curMetric.getName())
            {
                workingMetric = new SimpleMetric(curMetric);
                summedMetrics.add(workingMetric);
            }
            else
            {
                workingMetric.setValue(workingMetric.getValue() + curMetric.getValue());
            }
        }

        return summedMetrics;
    }
}
