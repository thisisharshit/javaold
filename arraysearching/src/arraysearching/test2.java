package arraysearching;

public class test2 {
	
	public static void MergeSort(int[]l,int[]r,int[]a) {
		int nl=l.length,nr=r.length,i,j,k;i=j=k=0;
		while(i<nl&&j<nr)
		{if(l[i]<r[j])
		 { a[k] =l[i];i++;k++;}
		else {a[k]=r[j];j++;k++;}	
		}
		while(i<nl) { a[k] =l[i];i++;k++;}
		while(j<nr) {a[k]=r[j];j++;k++;}
	}
	public static void Divide(int []a){
		int n=a.length;
		if(n==1) return;
		int mid=n/2;
		int[] left=new int[mid];
		int []right=new int[n-mid];
		for(int i=0;i<mid;i++) left[i]=a[i];
		for(int i=mid;i<n;i++) right[i-mid]=a[i];
		Divide(left);Divide(right);
		MergeSort(left,right,a);
	}

	public static void main(String args[]) {
		int[] arr= {21,34,41,22,35};
		int[]arr2= {61,34,45,21,11};
		Divide(arr);
		Divide(arr2);
		int i=0;
		int j=arr2.length-1;
		while(i<arr.length&&j>0) {
			if(arr[i]==arr2[j]) {
				System.out.println(arr[i]);
			}
			else if(arr[i]>arr[j]) {
				j--;
			}
		}
	}
}
