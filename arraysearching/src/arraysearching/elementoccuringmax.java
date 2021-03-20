package arraysearching;

public class elementoccuringmax {

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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {5,2,2,1,0,6,6,6,3};
		Divide(arr);
		int max=0;
		int ct=1;
		int ans=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]) {
				ct++;
			}else {
				ct=1;
			}
			if(max<ct) {
				max=ct; 
				ans=arr[i];
			}
			
			//System.out.println(max);
		}

		System.out.println(max);
		System.out.println(ans);
		
	}
}
