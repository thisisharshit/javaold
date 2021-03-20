package student;

public class student {
	public String firstname,lastname;
	public Address homeaddress,schooladdress;
	public int testscore1,testscore2,testscore3;
	public double average;

	
	public  student(String first, String last, Address home, Address school) {
		firstname=first;
		lastname=last;
		homeaddress = home;
		schooladdress= school;
		testscore1=0;
		testscore2=0;
		testscore3=0;
	}
	public String tostring() {
		String result;
		result=firstname+" "+lastname+"\n";
		result+="Home address:\n"+ homeaddress +"\n";
		result+="schooladdress:\n"+schooladdress;
		
		result+="\ntestscore1: "+testscore1+"  testscore2: "+testscore2+"  testscore3: "+testscore3+"\n";
		result+="Avg marks: "+average;
		return result;
	}
	
	public void settestscore(int testnumber,int score) {
		if(testnumber==1) {
			testscore1=score;
			
		}
		else if(testnumber==2) {
			testscore2=score;
		}
		else if(testnumber==3) {
			testscore3=score;
		}
		else {
			return;
		}
	}
	public int gettestscore(int testnumber) {
		if(testnumber==1) {
			return testscore1;
			
		}
		else if(testnumber==2) {
			return testscore2;
		}
		else if(testnumber==3) {
			return testscore3;
		}
		else {
			return 0;
		}
	}
	public void average() {
		double sum=testscore1+testscore2+testscore3;
		
		average  = sum/3;

		return;
	}
	public static void main(String args[]) {
		student obj1= new student("harshit","agarwal",harshithome,schooladd);
		
		obj1.toString();
	}
	

	
}
