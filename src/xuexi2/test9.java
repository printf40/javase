package xuexi2;

public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char cs[] = {'a','b','c','d','e','f'};
		char copy[] = new char[cs.length];
		
		for (int i=0; i<cs.length; i++) {
			copy[i] = cs[i];
		}
		for (char item : copy) {
			System.out.println(item);
		}
	}

}
