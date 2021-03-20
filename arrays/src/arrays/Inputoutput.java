package arrays;
import java.io.*;
import java.util.*;

public class Inputoutput {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
			int n = Integer.parseInt(br.readLine().trim());
			int arr[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");
			for(int i=0; i<n; i++){
				arr[i] = Integer.parseInt(inputLine[i]);
			}
			int maxEle = arr[n-1];
			StringBuffer str = new StringBuffer();
			ArrayList<Integer> res = new ArrayList<Integer>();
			for(int i=n-1; i>=0; i--) {
				if(arr[i] >= maxEle){
					maxEle = arr[i];
					res.add(maxEle);
				}
			}
			for(int i=res.size()-1; i>=0; i--){
				str.append(res.get(i)+" ");
			}
			System.out.println(str);
		}
	}

}
