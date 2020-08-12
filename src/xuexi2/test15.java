package xuexi2;

public class test15 {
	
	public static void main(String[] args) {
		//斐波那契
		//Fn = ( ( (1+Math.sqrt(5) )/2) - ( (1-Math.sqrt(5) )/2)) / Math.sqrt(5)
		jiecheng(10);
		
		
	}
	

	public static void jiecheng(int n)
	{
		int sum =1;
		for(int i =n; i>1;i--)
		{
			sum*=i;
		}
		System.out.println(sum);
		//return sum;
	}

	
	public static boolean isLeapYear(int year)
	{
		if(year%400==0)
		{
			return true;
		}
		if(year %4 ==0 && year %100 !=0)
		{
			return true;
		}
		return false;
	}
	
	public static int ZhiShu(int n)
	{
		for(int i=n+1;;i++)
		{
			boolean flag = true;//是质数
			for(int j=2; j<=i-1;j++)
			{
				if(i%j==0)
				{
					flag = false;//不是质数
					break;
				}
			}
			if(flag)
			{
				return i;
			}
		}
	}
	
	public static int feibonaqie(int n)
	{
		if(n==1 || n==2)
		{
			return 1;
		}
		else
		{
			return feibonaqie(n-1) + feibonaqie(n-2);
		}
	}
	
	public static int qwer(int n) {
		int Fn = ( ( (1+1) ) );
		return Fn;
	}



}
