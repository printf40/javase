package xuexi2;

public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(2,3));
		//int a = 1;
		

	}
	public static int max(int a, int b) {
		return a>b?a:b;
	}
	
	//重载的方法
	//1.方法名一样
	//2.方法参数类型不同
	//3.方法参数个数不同
	public int sum1(int a, int b) {
		return a + b;
	}
	public double sum (int a, int b) {
		return a + b;
	}
	

}
