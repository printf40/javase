package mytest;

import java.io.File;

/**
 * �ĵ�ע��
 * @author feiyy
 * 1.һ��.Java�ļ��п����ж��class ����ֻ����һ����public���ε� �ļ�����public������һ��
 * 2.ֻ��public���в�����main��ڷ���
 * 3.����ļ���û��public�����ļ���Ҫ������һ�����������ͬ
 * 
 * */
public class qwer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		int[] arr = {1,8,6,5,7,9};
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j< arr.length - 1 - i; j++){
				if(arr[j+1] < arr[j]){
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
		}
		File file = new File("./qwer.java");
		System.out.print(file.getAbsolutePath());
	}
	
}
