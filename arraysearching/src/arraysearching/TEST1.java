package arraysearching;

public class TEST1 {

	public static void main(String args[])
	{
		int[] arr=new int[100];
		int open=1;
		int close=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=close;
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j=j+i+1) {
				if(arr[j]==close) arr[j]=open;
				else if(arr[j]==open) arr[j]=close;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==open) {
				System.out.println(i+1+" door is open.");
			}
		}
	}
}
