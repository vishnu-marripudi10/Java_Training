//2. In the previous program remove the try{}catch(){} block surrounding the sleep method and try to execute the code. What is your observation?

package day6;

import java.util.Date;

class ThreadTimeSleep1 extends Thread {
	private String threadName;

	ThreadTimeSleep1(String name) {
		threadName = name;
		System.out.println("Creating " + threadName);
	}

	static void printDateTime() {
		Date date = new Date();
		String str = String.format("Current Date/Time : %tc", date);
		System.out.println(str);
	}

	public void run() {
		System.out.println("Running " + threadName);

	}
}

public class ThreadTimeSleepMain1 {
	public static void main(String args[]) {
		ThreadTimeSleep1 tt = new ThreadTimeSleep1("MyThread");
		tt.start();
	}
}