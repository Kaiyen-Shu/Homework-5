public class Sample6_2 
{
	public static void main(String[] args) 
	{
		Car_6 car1 = new Car_6("1號車");
		car1.start();
		
		Car_6 car2 = new Car_6("2號車");
		car2.start();
		
		for(int i = 0;i<5;i++)
			System.out.println("正在進行main()的處理工作");
	}

}