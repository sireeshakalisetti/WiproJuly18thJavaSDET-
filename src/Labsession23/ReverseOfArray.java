package Labsession23;

public class ReverseOfArray {

	public static void main(String[] args) {
		int arr1[] = new int[5];
		int arr2[] = new int[5];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
		for(int i=arr1.length-1;i>=0;i--) {
			System.out.print(arr1[i]+ " ");
			arr2[i] = arr1[i]; // TODO Auto-generated method stub
		}
		System.out.println();
		for(int j=0;j<arr2.length;j++) {
			System.out.print(arr2[j]+ " ");
			
		}
	

	}

}
