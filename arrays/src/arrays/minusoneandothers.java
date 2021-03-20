package arrays;

public class minusoneandothers {

	public static void main(String args[]) {
		int[] arr = {-1,-1,6,1,9,3,2,-1,4,-1};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=-1) {
				int j=arr[i];
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
