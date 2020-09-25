//3. Write a program to create a class DemoThread1 implementing Runnable interface. In the constructor, create a new thread and start the thread. In run() display a message "running child Thread in loop : " display the value of the counter ranging from 1 to 10. Within the loop put the thread to sleep for 2 seconds. In main create 3 objects of the DemoTread1 and execute the program.
package day6;

public class DemoThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Running Child Thread in loop " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

		}
	}
}
