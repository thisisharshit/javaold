package arrays;

import java.util.Scanner;

public class zerosandones {

	public static void main(String args[]) {
		/*Scanner s=new Scanner(System.in);

	    System.out.println("enter number of elements");

	    int n=s.nextInt();

	    int arr[]=new int[n];

	    System.out.println("enter elements");

	    for(int i=0;i<n;i++){//for reading array
	        arr[i]=s.nextInt();

	    }*/
		int[] arr= {1,1,1,0,0,1,1,1,1,0,0,0,0,1,0,1,0};
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			if(arr[i]==1&&arr[j]==1) {
				j--;
			}
			else if(arr[i]==0&&arr[j]==0) {
				i++;
			}
			if(arr[i]==1&&arr[j]==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			
			
		}
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
