package arraysearching;

public class duplicatenum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {5,2,1,0,6,3,5,2,1,8,8,9,9};
		for(int i=0;i<arr.length;i++) {
			if(arr[Math.abs(arr[i])]>=0) {
				arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
			}else {
				System.out.println(Math.abs(arr[i])+" ");
			}
		}
	}
}
