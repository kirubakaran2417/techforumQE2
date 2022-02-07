package arrays;

import java.util.Scanner;

public class sumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum = 0;
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter no of elements you wat in array");
		int arr[]= {22,25,26,25,22};
		int length=arr.length;
		for(int i=0;i<length;i++) {
			
			for(int j=i+1;j<length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate elements: "+arr[j]);
				}
			}
			//sum=sum+arr[i];
		}
		//System.out.println("sum: "+sum);
	}

}
