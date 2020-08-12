package xuexi2;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//求数组的最大值、最小值
		int[] arr = {23,45,78,96,35,84,72};
		
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}

	}

}
