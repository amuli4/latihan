/**
 *  Pick One options
 *  [ ] ABABABAB...(pattern repeats).
 *  [ ] BABABABA...(pattern repeats).
 *  [ ] AABAABAA...(pattern repeats).
 *  [x] A pattern cannot be predicted and can vary each time the program is run.
 */
package com.abimulia.latihan.easy;

class SampleDemo implements Runnable{
	private Thread t;
	private String threadName;
	
	SampleDemo (String threadName){
		this.threadName = threadName;
	}
	
	public void run() {
		while(true)
			System.out.println(threadName);
	}
	
	public void start() {
		if (t== null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
	
}

/**
 * 
 */
public class JavaThreads {
	
	public static void main(String[] args) {
		SampleDemo A = new SampleDemo("A");
		SampleDemo B = new SampleDemo("B");
		
		B.start();
		A.start();
	}



}
