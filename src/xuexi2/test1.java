package xuexi2;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数组是定长的
		//动态初始化
		int[] arr = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		//静态初始化
		int sum = 0;
		int[] arr2 = {88,23,45,67,96};//长度定了
		
		for (int i = 0; i <= arr2.length-1; i++) {
			sum += arr2[i];
		}
		System.out.println(sum);
		
		//char类型的静态初始化
		char[] cs = {'a','b','c'};
		
	}

}
