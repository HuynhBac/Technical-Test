package Queation2;

public class BMWCar implements Runnable
	{

	@Override
	public void run() {
		System.out.println("BMW Car Characteristic");
		int wheel = 4;
		System.out.println("wheel = " + wheel);
		int doors = 4;
		System.out.println("Doors = " + doors);
		int seats = 5;
		System.out.println("Seats = " + seats);
		int maxSpeed = 200;
		for (int i=0;i<10;i++)
			{
				System.out.println((i+1)+".maxSpeed = " + maxSpeed);
			}	
		
	}			
	}

