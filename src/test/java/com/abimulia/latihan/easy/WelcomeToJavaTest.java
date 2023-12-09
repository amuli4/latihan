/**
 * 
 */
package com.abimulia.latihan.easy;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

/**
 * 
 */
public class WelcomeToJavaTest {
	WelcomeToJava welcomeToJava = new WelcomeToJava();
	@Test
	public void testMain() {
		ByteArrayOutputStream baos = null;
		PrintStream ps = null;
		try {
			baos = new ByteArrayOutputStream();
			ps = new PrintStream(baos);
			System.setOut(ps);
			WelcomeToJava.main(null);
			String expected = "Hello, World.\r\n"
					+ "Hello, Java.";
			String consoleOutput = baos.toString();
			assertTrue(consoleOutput.contains(expected));
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			if (ps != null) {
				ps.close();
			}
		}
		
		
		
		
	}
	

}
