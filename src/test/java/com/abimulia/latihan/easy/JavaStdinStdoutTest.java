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
public class JavaStdinStdoutTest {

	@Test
	public void testMain() {
		ByteArrayOutputStream baos = null;
		PrintStream ps = null;
		try {
			String[] stInput = {"42","100","125"};
			baos = new ByteArrayOutputStream();
			ps = new PrintStream(baos);
			System.setOut(ps);
			JavaStdinStdout.main(stInput);
			String expected = "42\r\n"+"100\r\n"
					+ "125";
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
