package com.pack1;

public class MethodCalling_1n2 
{
	public void meth1() // main()
	{
		System.out.println("Hi from meth1()");
		System.out.println("100");
		System.out.println(100);
	}
	public void meth2()
	{
		System.out.println("Hello from meth2()");
		System.out.println(200);
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		MethodCalling_1n2 aobj=new MethodCalling_1n2();
		// Creating an object
		aobj.meth1(); // Calling a method 1
		aobj.meth2(); // Calling a method 2
		System.out.println("Java is Awesome");
		System.out.println("End");
	}

}
