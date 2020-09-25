//5. Write a program to create a class Number  which implements Runnable. Run method displays the multiples of a number accepted as a parameter. In main create three objects - first object should display the multiples of 2, second should display the multiples of 5 and third should display the multiples of 8. Display appropriate message at the beginning and ending of thread. The main thread should wait for the first object to complete. Display the status of threads before the multiples are displayed and after completing the multiples.
package day6;

public class NumberThread implements Runnable {

	int multiple;

	public NumberThread(int multiple) {
		this.multiple = multiple;
	}

	@Override
	public void run() {

		System.out.println("Starting  " + Thread.currentThread().getName());
		for (int i = 1; i <= 10; i++) {

			System.out.println(multiple + " * " + i + " :" + multiple * i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("Stopping  " + Thread.currentThread().getName());
	}

}
