package arrays;

public class insertiosort {

	public static void main(String args[]) {
		int[] arr= {2,1,4,3,2,6,9,5,6,8,7,9,5,6};
		for(int i=0;i<arr.length;i++) {
			int v=arr[i];
			int j=i;
			while(j>=1&&arr[j-1]>v) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=v;
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
