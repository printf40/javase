package xuexi2;

public class test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.��дһ��������������n�Ľ׳ˣ�����5�Ľ׳���1*2*3*4*5�� 
		//2.    ��дһ���������жϸ������ƽ�껹�����ꡣ 
		//3.    ��дһ���������������200����С�������� 
		//4.    дһ�����������ܣ�����һ��һά��int ���飬��������,
		//Ȼ�����ǰ���С�����˳�������ʹ��ð�����򣩡�

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
