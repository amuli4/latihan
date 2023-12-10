package com.abimulia.latihan.easy;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

	public JavaStack() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			boolean isBalanced = Parser.isBalanced(line);
			System.out.println(isBalanced);
			
		}
		scanner.close();

	}

}

class Parser{
	public static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c=='{'|| c== '(') {
				stack.push(c);
			} else if (c == '}' || c == ')') {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if ((c== '}' && top != '{') || (c== ')' && top != '(')) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
