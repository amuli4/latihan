package com.abimulia.latihan.easy;

/**
 * Result 9.0
 */
public class JavaStaticCodeAnalysis5 {


	public static void main(String[] args) {
		try {
			Float f1 = new Float("3.0");
			System.out.println("f1 " + f1);
			int x = f1.intValue();
			System.out.println("x "+x);
			byte b = f1.byteValue();
			System.out.println("b " +b);
			double d = f1.doubleValue();
			System.out.println("d " +d);
			System.out.println(x+b+d);
		} catch (NumberFormatException e) { 
			System.out.println("bad number"); 
		}

	}

}
