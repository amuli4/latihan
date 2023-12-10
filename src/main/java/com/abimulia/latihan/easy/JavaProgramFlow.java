package com.abimulia.latihan.easy;


interface BaseI {
	void method();
}

class BaseC {
	public void method() {
		System.out.println("Inside BaseC::method");
	}
}

/**
 * Result is Inside BaseC::method
 */
public class JavaProgramFlow extends BaseC implements BaseI {

	public static void main (String []s) {
		(new JavaProgramFlow()).method();
	}

}
