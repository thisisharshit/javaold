package arrays;
import java.util.Scanner;

public class takingarrayinput {


	public static void main(String args[]) {
		/*Scanner sc = new Scanner(System.in); 
		  
        // String input 
        String name = sc.nextLine(); 
  
        // Character input 
        char gender = sc.next().charAt(1); 
  
        // Numerical data input 
        // byte, short and float can be read 
        // using similar-named functions. 
        int age = sc.nextInt(); 
        long mobileNo = sc.nextLong(); 
        double cgpa = sc.nextDouble(); 
  
        // Print the values to check if the input was correctly obtained. 
        System.out.println("Name: "+name); 
        System.out.println("Gender: "+gender); 
        System.out.println("Age: "+age); 
        System.out.println("Mobile Number: "+mobileNo); 
        System.out.println("CGPA: "+cgpa);*/
		Scanner sc = new Scanner(System.in); 
		  
        // Initialize sum and count of input elements 
        int sum = 0, count = 0; 
  
        // Check if an int value is available 
        while (sc.hasNextInt()) 
        { 
            // Read an int value 
            int num = sc.nextInt(); 
            sum += num; 
            count++; 
        } 
        int mean = sum / count; 
        System.out.println("Mean: " + mean);
	}
}
