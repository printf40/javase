package xuexi2;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�����Ĳ����ǻ����������͡����������ǡ�ֵ������
		//�����Ĳ����������������͡����������ǡ����á�
	    //����:�ַ���
		
		int[] arr = {10, 20, 30};
		fn2(arr);
		
		System.out.println(arr[0]);
		
		String str = "123";
		
		fn3(str);
		
		System.out.println(str);
		System.out.println(fn(2));

	}
	
	public static void fn3(String str)
	{
		str = "hello";
	}
	
	public static int fn(int x)
	{
		x= x *3;	
		System.out.println(x);
		return x;
		
	}
	
	public static void fn2(int[] x)
	{
		x[0] = 30;	
		//System.out.println(x);
	}


	}


