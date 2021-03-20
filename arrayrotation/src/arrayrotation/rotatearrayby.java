package arrayrotation;
import java.util.Scanner;
public class rotatearrayby {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int rotateby=s.nextInt();
		int i=0,j=rotateby-1;
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;j--;
		}
		i=rotateby;j=a.length-1;
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;j--;
		}
		i=0;j=a.length-1;
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;j--;
		}
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
