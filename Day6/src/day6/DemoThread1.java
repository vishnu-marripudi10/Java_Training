//4. Rewrite the earlier program so that, now the class DemoThread1 instead of implementing from Runnable interface, will now extend from Thread class.

package day6;

public class DemoThread1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Running Child Thread in loop " + Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

		}
	}
}
