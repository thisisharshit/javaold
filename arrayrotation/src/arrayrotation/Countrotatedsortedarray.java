package arrayrotation;

import java.util.Scanner;

public class Countrotatedsortedarray {

	public static void  main(String args[]) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        //System.out.println(Math.pow(2,2 ));
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            
        }
        int k= s.nextInt();
        int l=0;
        int e=a.length-1;
        int pivot = findpivot(a,l,e);
        
        binarysearch obj = new binarysearch();
        if(pivot==-1) {
        	System.out.println("given element is at "+(obj.binarysearchrec(a, k, l ,e)+1)+" position");
        }
        else if(a[pivot]==k) {
        	System.out.println("given element is at "+pivot+" position");
        }
        else if(k > a[l]) {
        	System.out.println("given element is at "+(obj.binarysearchrec(a, k, l, pivot-1)+1)+" position");
        }
        else {
        	System.out.println("given element is at "+(obj.binarysearchrec(a, k, pivot+1,e)+1)+" position");
        }
        
   
	}
	static int findpivot(int[]arr, int s, int e) {
		if(s>e) return -1;
		if(s==e) return s;
		
		int m=(s+e)/2;
		if(m<e&&arr[m]<arr[m-1]) return m;
		
		if(arr[s]>=arr[m]) return findpivot(arr,s,m-1);
		else return findpivot(arr,m+1,e);
	}
}
