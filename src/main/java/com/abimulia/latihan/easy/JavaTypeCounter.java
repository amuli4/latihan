package com.abimulia.latihan.easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class JavaTypeCounter {

	public JavaTypeCounter() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String stInput = scanner.nextLine();
		countDataType(stInput);
		countType(stInput);
		scanner.close();

	}
	
	public static void countDataType(String input) {
		String[] tokens = input.split("\\s+");
		List<Integer> intCount = new ArrayList<Integer>();
		List<Double> doubleCount = new ArrayList<Double>();
		List<String> stCount = new ArrayList<String>();
		for (String token : tokens) {
			try {
				intCount.add(Integer.parseInt(token));
			} catch (NumberFormatException nfe) {
				try {
					doubleCount.add(Double.parseDouble(token));
				} catch (Exception e) {
					stCount.add(token);
				}
				
			}
		}
		System.out.println("countDataType");
		System.out.println("string " + stCount.size());
		System.out.println("integer " + intCount.size());
		System.out.println("double " + doubleCount.size());
	}
	
	public static void countType(String input) {
		String[] tokens = input.split("\\s+");
        int stringCount = 0;
        int integerCount = 0;
        int doubleCount = 0;
        for (String token : tokens) {
            try {
                Integer.parseInt(token);
                integerCount++;
            } catch (NumberFormatException e1) {
                try {
                    Double.parseDouble(token);
                    doubleCount++;
                } catch (NumberFormatException e2) {
                    stringCount++;
                }
            }
        }
        System.out.println("countType");
        System.out.println("string " + stringCount);
        System.out.println("integer " + integerCount);
        System.out.println("double " + doubleCount);
	}
	

}
