package xuexi2;

import java.util.Arrays;

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,45,78,96,63,35,74,18};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		//二分查找
		int index = Arrays.binarySearch(arr,78);
		System.out.println(index);
		//数组的遍历
		for (int item : arr) {
			System.out.println(item);
		}
	}

}
