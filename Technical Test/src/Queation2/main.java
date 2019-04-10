package Queation2;

public class main {

	public static void main(String[] args) 
	{
		
		Thread thread1 = new Thread(new ToyotaCar()); // put class ToyotaCar into thread1
		thread1.start();
		try {
			thread1.join();  // wait thead1 die then run thead2
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Thread thread2 = new Thread(new BMWCar()); // put class BMWCar into thread2
		thread2.start();

		
	}
}


