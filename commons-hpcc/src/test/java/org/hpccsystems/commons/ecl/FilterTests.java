/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems®.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************/

package org.hpccsystems.commons.ecl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FilterTests {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
	
	}
	
	@Test
	public void testFieldFilterRange()
	{
		System.out.println("\n----------FieldFilterRange Tests----------");

        String value = "4.5";
        FieldFilterRange fr = FieldFilterRange.makeEq(value);
        System.out.println("Testing Equality (String) FilterRange creation - " + fr.toString());
        assertEquals("['"+value+"']", fr.toString());

        Double dvalue = 2.333;
        fr = FieldFilterRange.makeEq(dvalue);
        System.out.println("Testing Equality (Double) FilterRange creation - " + fr.toString());
        assertEquals("["+dvalue+"]", fr.toString());

        fr = FieldFilterRange.makeLE(4.5);
        System.out.println("Testing Less than Equality (Double) FilterRange creation - " + fr.toString());
        assertEquals("(,4.5]", fr.toString());

        fr = FieldFilterRange.makeGE(-982);
        System.out.println("Testing Greater than Equality (Double) FilterRange creation - " + fr.toString());
        assertEquals("[-982,)", fr.toString());

	    String [] vals = new String[2];
	    vals[0] = "one";
	    vals[1] = "two";
	    fr = new FieldFilterRange(vals, false);
	    
	    FieldFilterRange fr2 = FieldFilterRange.makeIn(vals);
	    System.out.println("Testing IN [Alpha] FilterRange creation - " + fr.toString());
	    assertEquals(fr.toString(), fr2.toString());

        String [] in = {"1.0", "1.1", "1.3", "2.3", "3.4"};
        fr = FieldFilterRange.makeIn(in);
        System.out.println("Testing IN [Alpha] FilterRange creation 2- " + fr.toString());

        Double [] ind = {1.0, 1.1, 1.3, 2.3, 3.4};
        fr =FieldFilterRange.makeIn(ind);
        System.out.println("Testing IN [Numeric] FilterRange creation - " + fr.toString());

        try
	    {
	        fr = FieldFilterRange.makeStartsWith("a", (short)1);
	        System.out.println("Testing starts with FilterRange creation - " + fr.toString());

            fr = FieldFilterRange.makeStartsWith("xy", (short)2);
            System.out.println("Testing starts with FilterRange creation 2- " + fr.toString());
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	}
	
	@Test
	public void testFieldFilter()
	{
		System.out.println("\n----------FieldFilter Tests----------");

		FieldFilter ff = new FieldFilter("field1");
	    System.out.println("Testing Wildcard FieldFilter creation - " + ff.toString());
	    assertEquals("field1*", ff.toString());

	    FieldFilterRange [] filterRanges = new FieldFilterRange[2];

	    FieldFilterRange fr = FieldFilterRange.makeEq(1.0);
	    filterRanges[0] = fr;

	    ff = new FieldFilter("field2", fr);
	    System.out.println("Testing single clause FieldFilter creation - " + ff.toString());
	    assertEquals("field2=[1.0]", ff.toString());

	    fr = FieldFilterRange.makeLE("8.0");
	    filterRanges[1] = fr;

	    ff = new FieldFilter("field2", filterRanges);
	    System.out.println("Testing multi clause FieldFilter creation - " + ff.toString());
	    assertEquals("field2=[1.0],(,'8.0']", ff.toString());

	    ff =  new FieldFilter("field3", FieldFilterRange.makeIn(new Object [] {1.2, 23.2, 0.999}));
	    System.out.println("Testing Numeric IN FieldFilter creation - " + ff.toString());
	    assertEquals("field3=[1.2],[23.2],[0.999]", ff.toString());

	    ff =  new FieldFilter("field4", FieldFilterRange.makeIn(new Object [] {"james", "john", "jake"}));
	    System.out.println("Testing Alph IN FieldFilter creation - " + ff.toString());
	    assertEquals("field4=['james'],['john'],['jake']", ff.toString());

	    try
	    {
	        ff = new FieldFilter("myField", FieldFilterRange.makeStartsWith("a", (short)1));
	        System.out.println("Testing StartsWith FieldFilter creation - " + ff.toString());
		    assertEquals("myField=['a:1']", ff.toString());
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	}

	@Test
	public void testFileFilter()
	{
		System.out.println("\n----------FileFilter Tests----------");
		
		FileFilter [] filters = new FileFilter[2];
		FileFilter hpccfilter = new FileFilter();

		try
		{
			hpccfilter.appendFieldFilter(new FieldFilter("field1"));
			System.out.println(hpccfilter.toJson());

			filters[0] = hpccfilter;
			
			hpccfilter = new FileFilter();
			
			FieldFilterRange [] filterRanges = new FieldFilterRange[2];
			FieldFilterRange fr = FieldFilterRange.makeEq(1.0);
			filterRanges[0] = fr;

			FieldFilter ff = new FieldFilter("field2", fr);

		    fr = FieldFilterRange.makeLE("8.0");
		    filterRanges[1] = fr;
		    
		    ff = new FieldFilter("field2", filterRanges);
		    
		    hpccfilter.appendFieldFilter(ff);
			filters[1] = hpccfilter;

		    assertEquals("field2=[1.0],(,'8.0']", ff.toString());
		    
		    System.out.println(hpccfilter.toJson());
			
			System.out.println(FileFilter.toJson(filters));
		}
		catch (Exception e) {}	
	}
}
