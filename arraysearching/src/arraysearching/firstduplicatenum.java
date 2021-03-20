package arraysearching;

public class firstduplicatenum {

	/*public static void main(String args[]) {
		int[] arr= {3,2,1,2,2,1};
		int flag=0;
		for(int i=0;i<arr.length-1;i++) {
			int num=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]==num) {
					flag=1;
					System.out.println(num+" is the first duplicate element");
					break;
				}
				//if(flag==1) break;
			
			}
			if(flag==1) break;
			
		}
	}*/
	
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
		int []arr= {5,2,1,0,6,3,5};
		int []temp=new int[arr.length];
		int n=arr.length;
		for(int i=0;i<temp.length;i++) {
			temp[i]=arr[i];
		}
		Divide(temp);
		System.out.println(temp[4]);
		System.out.println(countoccurences(temp,5,n));
	}
	public static int binarysearchrec(int[] arr,int n,int s, int e) {
		if(s>e) return -1;
		
		int m=(s+e)/2;
		int mid=arr[m];
		if(mid==n) return m;
		else if(mid>n) return binarysearchrec(arr,n,s,m-1);
		else return binarysearchrec(arr,n,m+1,e);
	}
	public static int countoccurences(int[] arr,int x,int n) {
		//int n=arr.length-1;
		
		int ind=binarysearchrec(arr,x,0,n-1);
		if (ind == -1) 
	        return 0; 
	  
	    // Count elements on left side. 
	    int count = 1; 
	    int left = ind - 1; 
	    while (left >= 0 && arr[left] == x) 
	        count++;left--; 
	  
	    // Count elements on right side. 
	    int right = ind + 1; 
	    while (right < n && arr[right] == x) 
	        count++; right++; 
	  
	    return count;
		
	}
	
}
