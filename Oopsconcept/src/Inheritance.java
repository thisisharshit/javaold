
public class Inheritance {

	public static void main(String args[]) {
		Tiger t = new Tiger();
		System.out.println(t.address +" "+ t.animaltype);
		t.eat();
		Dog d= new Dog("jhbm");
		d.speakname();
		d.bark();
		d.whoami();
		Animal a = new Animal();
		
		//Dog d1  = new Dog("bark");
		
		//d1.speakname();
		//Child c = new Child();
	}
}
class Animal{
	
	public String address = "jungle";
	public void eat() {
		System.out.println("i am eating");
	}
}

class Tiger extends Animal{
	public String animaltype = "tiger";
	public void speak() {
		System.out.println("roar");
	}
}


class myanimal{
	
	public myanimal() {
		System.out.println("my name is harshit");
	} // default constructor
	
	public myanimal(String nameAnimal) {
		System.out.println("creating animal object");
			name = nameAnimal;
	}
	String name = "animal the great!";
	void speakname() {
		System.out.println(name);
	}
	void whoami() {
		System.out.println("i am an animal");
	}
}

class Dog extends myanimal{
	
	public Dog(String sound) {
		//tries to create object of myanimal
		//call the myainmall constructor
		//by default it is called the default constructor
		//we need to  call the correct constructor of myanimal
		
		super(); //calling parent class constructor, if nothing in super will give error becoz there is no default constructor in myanimal
		System.out.println("creating dog object");
	}
	
	int bark() {
		System.out.println("i am a dog!!");
		return 0;
	}
	
	public void whoami() {  //method overriding
		System.out.println("my name is bruno!!");
	}
}

class Parent{
	public Parent(){
		System.out.println("cvhjkljvbn");
	}
}

class Child extends Parent{
	public Child() {
		super();   //way to call default constructor
		//it will create parent object - calls parent cons 
		System.out.println("kjhgfxcvbnm");
	}
}


class A{
	void play() {
		System.out.println("A is playing");
	}
}

class B{
	void play() {
		System.out.println("B is playing");
	}
}

//class C extends A,B = what will happen if we call C c = new C(); c.play();
// multiple inheritance is not allowed in java
// it will create ambiguity 