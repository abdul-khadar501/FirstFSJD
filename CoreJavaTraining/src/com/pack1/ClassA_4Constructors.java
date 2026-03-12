package com.pack1;

public class ClassA_4Constructors 
{
	void meth1(int a, String s)
	{
		System.out.println(a+a);
		System.out.println("a");
		System.out.println('a');
		System.out.println(a);
		System.out.println("s : "+s);
	}
	void meth2(int a, int b)
	{
		System.out.println(a*a);
		System.out.println(b);
		new ClassA_4Constructors().meth4("Java is awesome");
		new ClassA_4Constructors().meth3('A', 100);
		System.out.println(a-b);
	}
	void meth3(char c,int a)
	{
		System.out.println(c);
		System.out.println('c');
		System.out.println(a);
	}
	void meth4(String s)
	{
		new ClassA_4Constructors().meth1(10, "Hello World");
		System.out.println(s);
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		new ClassA_4Constructors().meth2(5, 10);
		System.out.println("End");
	}

}
