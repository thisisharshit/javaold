
public class Polymorphism {

	public static void main(String args[]) {
		methodoverloading obj = new methodoverloading();
		obj.add(7, 4);
		obj.add(4, 5, 1);
		//obj.add(4, 2.2);
		//obj.add(1);
		obj.add('k', 'b');
	}
}


class methodoverloading{
	
	void add(int a , int b) {
		System.out.println("adding two numbers");
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c) {
		System.out.println("adding three numbers");
	}
	
	void add(int a , float b) {
		System.out.println("adding two int and float");
	}
}