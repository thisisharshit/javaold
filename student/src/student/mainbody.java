package student;

public class mainbody {

public static void main(String args[]) {
		
		Address schooladd= new Address("qwert","wert","2ert",8);
		
		Address harshithome=new Address("sfvd","sfvfsd","sfs",6);
		
		student harshit =new student("harshit","agarwal",harshithome,schooladd);
		
		//System.out.println(obj.tostring());
		
		harshit.settestscore(1, 93);
        harshit.settestscore(2, 86);
        harshit.settestscore(3, 77);
        harshit.average();
        
        
    
        System.out.println(harshit);
        //System.out.println();
      
		//System.out.println(obj.average());
		
		//System.out.println(obj.gettestscore(0));
		//System.out.print(obj.settestscore(2,30,4));
	}
}
