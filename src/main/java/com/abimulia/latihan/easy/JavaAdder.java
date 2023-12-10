package com.abimulia.latihan.easy;

import java.util.Scanner;

abstract class Calculator {
	abstract int add(int a, int b);
}

class Adder extends Calculator {
	int add(int a, int b) {
		return a+b;
	}
}

public class JavaAdder {

	public JavaAdder() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a, b;
		Scanner scanner;
		try {
			scanner = new Scanner(System.in);
			a = scanner.nextInt();
			b = scanner.nextInt();
			
			Calculator adderObject = new Adder();
			System.out.println("The sum is: " + adderObject.add(a,b));
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
		}

	}

}
