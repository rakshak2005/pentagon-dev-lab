package day.two;

public class calculators {
      String name = "casio";
      double price = 1200.5;
      
      int addition () {
    	  int a = 30;
    	  int b = 50;
    	  int c = a+b;
    	  return c;
      }
      
      double divide() {
    	  double a = 20.5;
    	  double b = 30.9;
    	  double c = a/b;
    	 return c;
      }
      
      int multiply() {
    	  int a = 6;
    	  int b = 9;
    	  int c = a*b;
    	  return c;
      }
      
      int subs() {
    	  int a = 5;
    	  int b = 8;
    	  int c = a+b;
    	  return c;
      }
      
      public static void main(String[] args) {
    	  calculators calc = new calculators();
    	 
		System.out.println(calc.name);
		System.out.println(calc.price);
		int x = calc.addition();
		System.out.println(x);
		double y = calc.divide();
		System.out.println(y);
		int z = calc.multiply();
		System.out.println(z);
		int w = calc.subs();
		System.out.println(w);
		
      }
      
}
