package methodandclasses;


public class methodandclasses {
         String Name = "CSDS";
         int sem = 7 ;
         char sec = 'b';
         int classStrength() {
        	 int boys = 50;
        	 int girls = 30;
        	 int strenth = boys + girls;
        	 return strenth;
         }
    public static void main(String[] args) {
		methodandclasses s = new methodandclasses();
		String Branch = s.Name ;
		int sec = s.sem;
		int strenth = s.classStrength();
	    System.out.println("Branch: " + Branch );
	    System.out.println("Sec: "+ sec);
	    System.out.println("Strenth: "+ strenth);
	    
	}
}
