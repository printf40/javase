package mytest;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������
		int a;
		//����aû�б���ʼ�������Դ�ӡ
		//System.out.println(a);
		//��ֵ
		a = 10;
		System.out.println(a);//a�����ڸ�ֵ�����ʹ��
		
		int b = 20;
		System.out.println(b);
		b = 30;
		b = 50;
		System.out.println(b);
		
		//����С��(double)
		double x = 12.34;
		double y = 15.678;
		
		//�����ַ�������
		String str = "haha";
		str = "hehe";
		System.out.println(x);
		System.out.println(str);
		
		//���ó���
		final double PI = 3.14;
		
		//�������������е�����
		//byte(1�ֽ�)��short��2�ֽڣ���int��4�ֽڣ���long��8�ֽڣ�
		
		//ʮ������
		int a1 = 10;
		
		//ʮ������
		int b1 = 0x10;//16
		
		//�˽���
		int c1 = 010;//8
		
		//������
		int d1 = 0B100;//4
		
		//���ƻ�ת
		//ʮ���� > ʮ�� �� ��(�̳���)
		//ʮ�� �� �� > ʮ����(Ȩ�ӷ�)
		//ʮ������ �� <> ������
		
		//ʮ����ת����������
		System.out.println(Integer.toBinaryString(100));//������
		System.out.println(Integer.toHexString(100));//ʮ��
		System.out.println(Integer.toOctalString(100));//�˽���
		
		//ʮתʮ��
		int i1 = 20;
		int i2 = i1 & 15;
		String m = (i2 > 9)?(char)(i2 - 10 + 'A')+"":i2+"";
		int i3 = i1 >>> 4;
		int i4 = i3 & 15;
		String n = (i4 > 9)?(char)(i4 - 10 + 'A')+"":i4+"";
		System.out.println(n+m);
		
		
		
		
		
	}

}
