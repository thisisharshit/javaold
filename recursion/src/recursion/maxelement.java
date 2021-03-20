package recursion;
import java.util.Scanner;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class maxelement {

	public static void main(String args[]) {
	/*	
		int[] arr = {6,7,8,1,5,7,401,4,12,4,4};
		System.out.println(maxnum(arr,0,arr.length-1));
		
	}
	public static int maxnum(int[] arr,int s, int e) {
		if(s>=e) {
			return arr[s];
		}
		return Math.max(arr[s], maxnum(arr,s+1,e));
		
	*/
	Scanner r = new Scanner(System.in);
	int n = r.nextInt();
	int count=0;
	int[] ar = new int[n];
	for(int i=0;i<n;i++){
	    ar[i] = r.nextInt();
	}
	Arrays.sort(ar);
	for(int i=0;i<n;i++){
	    if(ar[i]==0) continue;
	    if(ar[0]!=0 && i==0){
	        count++;
	        continue;
	    }
	    if(ar[i-1]!=ar[i]){
	        count++;
	    }
	}
	System.out.print(count);
}
}
