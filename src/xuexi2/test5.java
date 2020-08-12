package xuexi2;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[20];
		//boolean flag = false;
		int c = 0;
		for (int i = 1; i <= arr.length; i++) {
			arr[i-1] = i;
			if (i % 3 == 0) {
				arr[i] = -arr[i];
				c++;
			}
			if (i == arr.length) {
				i = 1;
			}
			if (c == 19) {
				break;
			}
		}
		for (int i = 1; i <= arr.length - 1; i++) {
			if (arr[i] > 0) {
				System.out.println(arr[i]);
			}
		}

	}

}
