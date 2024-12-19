public class Sample6_5
{
	public static void main(String[] args) 
	{
		Car_6 car1 = new Car_6("1號車");
		car1.start();
		
		for(int i = 0;i<5;i++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println("正在進行main()的處理工作");
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}

}