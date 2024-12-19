public class Sample6_8
{
	public static void main(String[] args) 
	{
		Company_2 cmp = new Company_2();
		Driver_2 drv1 = new Driver_2(cmp);
		drv1.start();
		Driver_2 drv2 = new Driver_2(cmp);
		drv2.start();
	}
}
class Company_2
{
	private int sum = 0;
	public synchronized void add(int a)
	{
		int tmp = sum;
		System.out.println("目前的合計金額是"+tmp+"元");
		System.out.println("賺到了"+a+"元");
		tmp += a;
		System.out.println("合計金額是"+tmp+"元");
		sum = tmp;
	}
}
class Driver_2 extends Thread
{
	private Company_2 comp;
	public Driver_2(Company_2 c)
	{
		comp = c;
	}
	
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			comp.add(50);;
		}
	}
}