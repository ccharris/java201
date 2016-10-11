package org.elevenfifty.java201;

import static java.lang.System.out;

import java.math.BigDecimal;

public class MoneyTest {

	public static void main(String[] args) {
		
		final BigDecimal money = new BigDecimal ("12.34");
		//good use of final to make sure that money isn't reassigned
		BigDecimal addTo = money.add(new BigDecimal("1.32"));
		
		out.println(addTo);
		//use objects instead of primitive type if you need the null option
		
		//any time null is on the left side of a .operator you will get a null pointer exception
		//can fix a lot of things by setting final variables, can't have null
		//final says it can never change, one of the many reasons to use final a lot
		//super refers to one step up in the class heirarchy
		//protected is like default but available to anything in same package and things that extend
		//default is only available to things in the package
	}

}
