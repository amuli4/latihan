package com.abimulia.latihan.medium;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaBigDecimal {

	
	public static void main(String[] args) {
		//Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        
        //Reference for original string index
        List<String> stList = new ArrayList<String>();
        for (int i = 0; i < s.length; i++) {
			stList.add(s[i]);
		}
       

        BigDecimal[] bd = new BigDecimal[n];
        for (int i = 0; i < n; i++) {
            bd[i] = new BigDecimal(s[i]);
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
            	 BigDecimal bd1 = new BigDecimal(s[i]);
                 BigDecimal bd2 = new BigDecimal(s[j]);

                if (bd1.compareTo(bd2) < 0) {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                } else {
                	if (bd1.compareTo(bd2) == 0) {
//                      Check  original index
                		int idxS1 = stList.indexOf(s[i]);
                		int idxS2 = stList.indexOf(s[j]);
                		if (idxS1> idxS2) {
                			String temp = s[i];
                            s[i] = s[j];
                            s[j] = temp;
						}
                    }
                }
                
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

	}

}
