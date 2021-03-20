package arrayrotation;

public class binarysearch {

	public static int binarysearchrec(int[] arr,int n,int s, int e) {
		if(s>e) return -1;
		
		int m=(s+e)/2;
		int mid=arr[m];
		if(mid==n) return m;
		else if(mid>n) return binarysearchrec(arr,n,s,m-1);
		else return binarysearchrec(arr,n,m+1,e);
	}
	public static void main(String args[]) {
		int[] arr = {1,2,3,5,6,98,100};
		int ans = binarysearchrec(arr,98,0,arr.length-1);
		if(ans==-1) System.out.println("element not found");
		else System.out.println("element found at "+ans+" position");
	}
}
