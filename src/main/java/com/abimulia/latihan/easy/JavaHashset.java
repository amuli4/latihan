package com.abimulia.latihan.easy;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashset {

	public JavaHashset() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        
        HashSet<String> hsName = new HashSet<String>();
        for (int i = 0; i < t; i++) {
        	hsName.add(pair_left[i]+","+pair_right[i]);
            System.out.println(hsName.size());
        }
        s.close();
	}

}
