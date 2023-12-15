package com.abimulia.latihan.easy;

public class JavaSwitchCase {



	public static void main(String[] args) {
		Customer c1 = new Customer();
		int measurement = 3;
		switch(measurement){
		  case 3:
			System.out.println("case 3:");
		    c1.size = "S";
		    System.out.println("Set S");
		  case 6:
			System.out.println("case 6:");
		    c1.size = "M";
		    System.out.println("Set M");
		  case 9:
			System.out.println("case 9:");
		    c1.size = "L";
		    System.out.println("Set L");
		    break;
		  default:
			System.out.println("default:");
		    c1.size = "X";
		    System.out.println("Set X");
		}
		System.out.println(c1.size);

	}

}

class Customer {
	String size;
}
