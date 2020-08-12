package xuexi2;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean arr[] = new boolean[500];
		for (int i = 0; i<arr.length; i++) {
			arr[i] = true;
		}
		int index = 0;
		int fnum = arr.length;
		int c = 0;
		
		while (fnum > 1) {
			if (arr[index] == true) {
				c++;
				if(c % 3 == 0) {
					c = 0;
					arr[index] = false;
					fnum--;
				}
			}
			index++;
			if (index == arr.length) {
				index = 0;
			}
			
			
		}
		for (int i = 0; i<arr.length;i++) {
			if(arr[i] == true) {
				System.out.println(i+1);
			}
		}
		//System.out.println();
		
	}

}
