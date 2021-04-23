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
	@Override
	public String toString() {
		
		String result;
		result=streetaddress+"\n";
		result+=city+", "+state+" "+zipcode;
		return result;
	}
	public static void main(String args[]) {
		Address obj= new Address("12, new agrasen colony","beawar","raj.",305901);
		
		System.out.println(obj);
	}
}
