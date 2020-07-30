package mytest;

import java.io.File;

/**
 * 文档注释
 * @author feiyy
 * 1.一个.Java文件中可以有多个class 但是只能有一个是public修饰的 文件名跟public的类名一样
 * 2.只有public类中才能有main入口方法
 * 3.如果文件中没有public的类文件名要跟其中一个类的名字相同
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
