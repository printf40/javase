package mytest;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//变量声明
		int a;
		//变量a没有被初始化不可以打印
		//System.out.println(a);
		//赋值
		a = 10;
		System.out.println(a);//a必须在赋值后才能使用
		
		int b = 20;
		System.out.println(b);
		b = 30;
		b = 50;
		System.out.println(b);
		
		//声明小数(double)
		double x = 12.34;
		double y = 15.678;
		
		//声明字符串类型
		String str = "haha";
		str = "hehe";
		System.out.println(x);
		System.out.println(str);
		
		//设置常亮
		final double PI = 3.14;
		
		//基本数据类型中的整数
		//byte(1字节)，short（2字节），int（4字节），long（8字节）
		
		//十进制数
		int a1 = 10;
		
		//十六进制
		int b1 = 0x10;//16
		
		//八进制
		int c1 = 010;//8
		
		//二进制
		int d1 = 0B100;//4
		
		//进制互转
		//十进制 > 十六 八 二(短除法)
		//十六 八 二 > 十进制(权加法)
		//十六进制 八 <> 二进制
		
		//十进制转换其他进制
		System.out.println(Integer.toBinaryString(100));//二进制
		System.out.println(Integer.toHexString(100));//十六
		System.out.println(Integer.toOctalString(100));//八进制
		
		//十转十六
		int i1 = 20;
		int i2 = i1 & 15;
		String m = (i2 > 9)?(char)(i2 - 10 + 'A')+"":i2+"";
		int i3 = i1 >>> 4;
		int i4 = i3 & 15;
		String n = (i4 > 9)?(char)(i4 - 10 + 'A')+"":i4+"";
		System.out.println(n+m);
		
		
		
		
		
	}

}
