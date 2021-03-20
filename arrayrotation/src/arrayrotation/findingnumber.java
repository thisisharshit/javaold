package arrayrotation;

public class findingnumber {

	public static int findpivotpoint(int[] arr,int s,int e) {
		if(s==e) {
			return s;
		}
		if(s==e-1) {
			if(arr[s]<arr[e]) {
				return s;
			}
			else {
				return e;
			}
		}
		
		//recursive call
		int m=(s+e)/2;
		if(arr[s]<arr[m]) {
			return findpivotpoint(arr,m+1,e);
		}
		else {
			return findpivotpoint(arr,s,m);
		}
	}
	
	public static boolean binarysearchrec(int[] arr,int n,int s, int e) {
		if(s>e) return false;
		
		int m=(s+e)/2;
		int mid=arr[m];
		if(mid==n) return true;
		else if(mid>n) return binarysearchrec(arr,n,s,m-1);
		else return binarysearchrec(arr,n,m+1,e);
	}
	
	public static void main(String args[]) {
		int[] arr= {15,16,18,19,20,1,2};
		int s=0;
		int e=arr.length-1;
		int pivot=findpivotpoint(arr,s,e);
		System.out.println(pivot);
		int []left=new int[pivot];
		int r=arr.length-pivot-1;
		int []right = new int[r];
		for(int i=0;i<pivot;i++) {
			left[i]=arr[i];
		}
		for(int i=0;i<r;i++) {
			right[i]=arr[pivot+i+1];
		}
		int n=16;
		if(n==arr[pivot]) {
			System.out.println(true);
		}else{
			System.out.println(binarysearchrec(right,n,0,right.length-1)||binarysearchrec(left,n,0,left.length-1));
		}
		
		
	}
}
