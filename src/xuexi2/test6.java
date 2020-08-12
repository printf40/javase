package xuexi2;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,45,78,96,35,2,5,95,16};
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i; j++) {
				if (arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = arr[j];
				}
			}
		}
		
		
		
		

	}

}
