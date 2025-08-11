package Labsession23;

public class SumOfArray {

	public static void main(String[] args) {
		int arr[] = new int[5];
		int sum = 0;
		arr[0] = 30;
		arr[1] = 60;
		arr[2] = 90;
		arr[3] = 120;
		arr[4] = 150;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];// TODO Auto-generated method stub
		}
		System.out.println(sum);

	}

}
