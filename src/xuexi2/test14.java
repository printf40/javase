package xuexi2;

public class test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5。 
		//2.    编写一个方法，判断该年份是平年还是闰年。 
		//3.    编写一个方法，输出大于200的最小的质数。 
		//4.    写一个方法，功能：定义一个一维的int 数组，长度任意,
		//然后将它们按从小到大的顺序输出（使用冒泡排序）。

	}
	public static int jie(int a) {
		for (int i = 1; i<=a; i++){
			System.out.println(i+"*");
		}
		return a;
	}
	public static int[] pai(int[] a) {
		for (int i = 1; i<a.length; i++) {
			for (int j = 0; j<a.length-j; j++) {
				if(a[j+1] < a[j]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

}
