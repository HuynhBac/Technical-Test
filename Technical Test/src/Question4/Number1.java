package Question4;

public class Number1 extends Thread 
{

	@Override
	public synchronized void run() { // use keyword " synchronized" to make sequential process of threads
		int Number1 = 100;
		while (1==1)  // infinity loop
		{
			System.out.println(Number1);
			try {
				Thread.sleep(1000); // set delay 1000ms
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
