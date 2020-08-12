package xuexi2;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		int key = 5;
		int low = 0;
		int high = arr.length-1;
		int l = -1;
		while (low <= high) {
			//找中间位置
			int mid = (low + high)/2;
			if (key > arr[mid]) {
				low = mid + 1;
			} else if (key < arr[mid]) {
				high = mid - 1;
			} else {
				l = mid;
				break;
			}
		}
		if (l == -1) {
			System.out.println("没找到");
		} else {
			System.out.println(arr[l]+"和"+l);
		}

	}

}
