package day6;

import day6.DemoThread;
public class DemoThreadMain {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new DemoThread());
		Thread thread2 = new Thread(new DemoThread());
		Thread thread3 = new Thread(new DemoThread());
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
