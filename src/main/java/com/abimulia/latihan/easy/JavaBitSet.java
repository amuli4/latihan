/**
 * Java's BitSet class implements a vector of bit values (i.e.: false (0) or true (1)) that grows as needed, 
 * allowing us to easily manipulate bits while optimizing space (when compared to other collections). 
 * Any element having a bit value of 1 is called a set bit.
 * 
 * Given 2 BitSets, B1 and B2 , of size N where all bits in both BitSets are initialized to 0, perform a series of M operations. 
 * After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.
 * 
 * The M subsequent lines each contain an operation in one of the following forms:
 * AND <set> <set>
 * OR  <set> <set>
 * XOR <set> <set>
 * FLIP <set> <index>
 * SET <set> <index>
 * 
 */
package com.abimulia.latihan.easy;

import java.util.BitSet;
import java.util.Scanner;

/**
 * 
 */
public class JavaBitSet {

	/**
	 * 
	 */
	public JavaBitSet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        for (int i = 0; i < m; i++) {
            String operation = scanner.next();
            int operand1 = scanner.nextInt();
            int operand2 = scanner.nextInt();

            switch (operation) {
                case "AND":
                    if (operand1 == 1) {
                        b1.and(b2);
                    } else {
                        b2.and(b1);
                    }
                    break;
                case "OR":
                    if (operand1 == 1) {
                        b1.or(b2);
                    } else {
                        b2.or(b1);
                    }
                    break;
                case "XOR":
                    if (operand1 == 1) {
                        b1.xor(b2);
                    } else {
                        b2.xor(b1);
                    }
                    break;
                case "FLIP":
                    if (operand1 == 1) {
                        b1.flip(operand2);
                    } else {
                        b2.flip(operand2);
                    }
                    break;
                case "SET":
                    if (operand1 == 1) {
                        b1.set(operand2);
                    } else {
                        b2.set(operand2);
                    }
                    break;
                default:
                    break;
            }

            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }

        scanner.close();

	}

}
