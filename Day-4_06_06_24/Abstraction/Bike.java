package Abstraction;

public class Bike extends Honda
{
	public void run() 
		{
			System.out.println("running safely");
		}
		public static void main(String[] args) 
		{
			Honda h=new Bike();
			h.run();
		}
}
