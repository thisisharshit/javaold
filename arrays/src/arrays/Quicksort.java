package arrays;

public class Quicksort {

	public static void main(String args[]) {
		int[]arr= {9,8,1,2,4};
		int s=0;
		int e=arr.length-1;
		System.out.println(findpivot(arr,s,e));
	}
	public static int findpivot(int[]arr,int s, int e) {
		int l=s,r=e;
		int pivot = arr[l];
		while(l<r) {
			while(arr[l]<=pivot) {
				l++;
			}
			while(arr[r]>pivot) {
				r--;
			}
			if(l<r) {
				int temp=arr[l];
				arr[l]=arr[r];
				arr[r]=temp;
			}
		}
		arr[s] = arr[r];
		arr[r] = pivot;
		return r;
	}
}
