/**
 * In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) 
 * is an abstract data type that generalizes a queue, for which elements can be added to or removed from either the front (head) 
 * or back (tail).
 * 
 * In this problem, you are given N integers. 
 * You need to find the maximum number of unique integers among all the possible contiguous subarrays of size M.
 */
package com.abimulia.latihan.medium;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 */
public class JavaDequeue {

	/**
	 * 
	 */
	public JavaDequeue() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            int count = counts.getOrDefault(num, 0);
            counts.put(num, ++count);
            if ( i >= m-1) {
            	if (counts.size() > max) max = counts.size();
            	Integer removed = deque.removeFirst();
            	int removing = counts.get(removed);
            	removing--;
            	if (removing==0) {
            		counts.remove(removed);
            	} else {
            		counts.put(removed, removing);
            	}
            }
        }
        System.out.println(max);
	}

}
