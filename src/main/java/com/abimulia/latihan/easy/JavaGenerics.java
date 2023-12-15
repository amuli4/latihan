package com.abimulia.latihan.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaGenerics {

	public JavaGenerics() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		List<String> listString = new ArrayList<String>();
		List<Integer> listInteger = new ArrayList<Integer>();
		while (sc.hasNext()) {
			String currObj = sc.next();
			if (currObj.equals("quit")) {
				break;
			}
			try {
				Integer currInt =Integer.parseInt(currObj);
				listInteger.add(currInt);
			} catch (Exception e) {
				listString.add(currObj);
			}
		}
		printArray(listInteger.toArray());
		printArray(listString.toArray());
		sc.close();

	}
	public static void printArray(Object[] arr) {
	    for(int i = 0; i < arr.length; i++) {
	        System.out.println(arr[i]);
	    }
	}

}

