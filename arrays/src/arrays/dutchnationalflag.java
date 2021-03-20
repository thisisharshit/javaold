package arrays;

public class dutchnationalflag {

	public static void main(String args[]) {
		int[] arr= {1,2,0,0,1,1,1,2,2,2,0,0,0,0,1,2,1,1,2,0,0,0,1,0,1,0,2,0,1,0,2,0,1,0,2,0,2,0,2,2,2,0,1,0,1,1,1,0};
		int s=0;
		int m=0;
		int e=arr.length-1;
		while(m<=e) {
			if(arr[m]==0) {
				
				int temp=arr[s];
				arr[s]=arr[m];
				arr[m]=temp;
				s++;
				m++;
				
			}
			else if(arr[m]==1) {
				m++;
			}
			else {
				int temp=arr[e];
				arr[e]=arr[m];
				arr[m]=temp;
				e--;
			}
			
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
	}
}
