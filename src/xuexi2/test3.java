package xuexi2;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int sum=0;
			int arr []=new int[4];
			arr[0]=10;
					arr[1]=20;
			arr[2]=30;
			arr[3]=40;
			
			int arr2[]={80,23,45,67};
			double avg = 0;
			
			System.out.println(arr2[2]);
			for (int i=0;i<arr2.length;i++){
				sum+=arr2[i];
				avg= (double)sum/arr2.length;
			}
			System.out.println(avg);


	}

}
