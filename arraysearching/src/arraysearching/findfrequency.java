package arraysearching;

public class findfrequency {

	public static int binarysearchrec(int[] arr, int n, int s, int e) {
		if(s>=e) return -1;
		
		int m=(s+e)/2;
		if(arr[m]==n) return m;
		else if(arr[m]>n) return binarysearchrec(arr,n,s,m-1);
		else return binarysearchrec(arr,n,m+1,e);	
	}
	public static void main(String args[]) {
		int [] arr= {1,2,3,3,3,3,3,7,7,9,10,10,10,10};
		int n=10;int ct=0;int i;
		int index=binarysearchrec(arr,n,0,arr.length-1);
		if(index==-1) {
			System.out.println(0);
		}else{
			for(i=0;i<index;i++) {
				if(arr[i]==n) {
					ct++;
				}
			}
			for(i=index;i<arr.length;i++) {
				if(arr[i]==n) ct++;
			}
			System.out.println(ct);
		}
		
	}
}
