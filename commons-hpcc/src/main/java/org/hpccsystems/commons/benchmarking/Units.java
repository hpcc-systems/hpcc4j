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

import java.lang.Math;

/**
 * Represents the units for an IMetric.
 */
public class Units
{
    public enum Type
    {
        SECONDS("s"),
        BYTES("B"),
        COUNT(""),
        PERCENTAGE("%");

        public String typePostfix;
        private Type(String postFix)
        {
            typePostfix = postFix;
        }
    };
    public Type type;

    public enum Scale
    {
        NANO("n",-9),
        MICRO("u",-6),
        MILLI("m",-3),
        UNIT("",0),
        KILO("K",3),
        MEGA("M",6),
        GIGA("G",9);
        
        public String scalePrefix;
        public int scalePower = 0;
        private Scale(String prefix, int scalePower)
        {
            this.scalePrefix = prefix;
            this.scalePower = scalePower;
        }
    };
    public Scale scale;
    
    public Units(Type type)
    {
        this.type = type;
        this.scale = Scale.UNIT;
    }

    public Units(Type type, Scale scale)
    {
        this.type = type;
        this.scale = scale;
    }

    public String toString()
    {
        return scale.scalePrefix + type.typePostfix;
    }


    public static double calculateScaleConversion(Units.Scale from, Units.Scale to)
    {
        return Math.pow(10.0,(double)(from.scalePower-to.scalePower));
    }
};
