package arrays;

public class mergesort {

	public static void main(String args[]) {
		int[] arr= {1,5,3,0,1,2,8};
		int s=0;
		int e=arr.length-1;
		
		mergesort(arr,s,e);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		
	}

	public static void mergesort(int[] arr, int s,int e) {
		if(s>=e)
			return;
		
		int m=(s+e)/2;
		mergesort(arr,s,m);
		mergesort(arr,m+1,e);
		
		mergearray(arr,s,m+1,e);
		
		
	}
	public static void mergearray(int[] arr, int st,int mid,int end) {
		int ls =st;
		int le=mid-1;
		int rs=mid;
		int re=end;
		int tempo=st;
		//int[] temp=new int[arr.length];
		while(ls<=le&&rs<=re) {
			
			if(arr[ls]<=arr[rs]) {
				temp[tempo]=arr[ls];
				ls++;
			}
			else {
				temp[tempo]=arr[rs];
				rs++;
			}
			tempo++;
		}
		while(ls<=le) {
			temp[tempo]=arr[ls];
			ls++;
			tempo++;
		}
		while(rs<=re) {
			temp[tempo]=arr[rs];
			rs++;
			tempo++;
		}
		for(int i=ls;i<=re;i++) {
			arr[i]=temp[i];
		}
		
	}
}
