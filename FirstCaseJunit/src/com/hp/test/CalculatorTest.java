package com.hp.test;
import junit.framework.Assert;
import junit.framework.TestCase;

import com.hp.bean.Calculator;

public class CalculatorTest extends TestCase{
	 public void testAdd(){
		   int a =10;
		   int b=20;
		   int expectedSum = 30;
		   int actualSum = 0;
		   Calculator cal = null;

		  cal = new Calculator();
		  actualSum = cal.add(a,b);
		  Assert.assertEquals(expectedSum ,actualSum);
		    
		  }

		  public void testAddWithNegativeValues(){
		   int a = -10;
		   int b = -20;
		   int expectedSum = -30;
		   int actualSum = 0;
		   Calculator cal = null;

		   cal = new Calculator();
		   actualSum = cal.add(a,b);
		   Assert.assertEquals(expectedSum,actualSum);
		  }
}
