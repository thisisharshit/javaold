package student;

public class Address {
	private String streetaddress, city, state;
	private int zipcode;
	public Address(String street,String town,String st, int zip) {
		streetaddress=street;
		city=town;
		state=st;
		zipcode=zip;
	}
	public String tostring() {
		String result;
		result=streetaddress+"\n";
		result+=city+","+state+" "+zipcode;
		return result;
	}
	public static void main(String args[]) {
		Address obj= new Address("qwerfgdf","asfg","aesfdgf",213);
		
		obj.toString();
	}
}
