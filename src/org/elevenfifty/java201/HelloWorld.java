package org.elevenfifty.java201;

import static java.lang.Math.pow;

public class HelloWorld {
	
	//class starts with capital letter, variable starts with a lowercase letter, use camelCase

	private final String bar = "bar";
	//using final on values, prevents bugs, generally a good thing to do
	//booleans  default to false
	
	//declare things as Integer, which is an object, you can set to null, if it's optional is a good time to use it
	//safe to assign up to a larger data type. but dangerous to assing down.

	public static void main(String[] args) {
		String name = args[0];
		System.out.println("Hello " + name + "!");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println(pow(12, 2));
		// new HelloWorld().foo();
		HelloWorld hw = new HelloWorld();
		final int k = 123;
		long l = k;
		float f = k;
		double d = k;
		
		hw.foo();
		hw.foo(k);

		// overloading, can have a bunch of different methods called the same
		// thing that take different parameters

		String s = String.valueOf(k);
		System.out.println(s);
	}

	public void foo(int k) {
		System.out.println(k);
		//if final it means it can never be overrided
	}

	public void foo() {
		System.out.println("foo");
		System.out.println(bar);
	}

}
