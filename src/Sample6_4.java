public class Sample6_4
{
	public static void main(String[] args) 
	{
		Car_6 car1 = new Car_6("一號車");
		car1.start();
		
		try
		{
			car1.join();
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("結束main()的處理工作");
	}
}