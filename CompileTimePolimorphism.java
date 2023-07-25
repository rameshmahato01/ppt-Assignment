package basicpgm;


public class CompileTimePolimorphism {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }

	public static void main(String[] args) {
		 CompileTimePolimorphism  ctp = new CompileTimePolimorphism ();

	        int sum1 = ctp.add(2, 3);
	        int sum2 = ctp.add(2, 3, 4);
	        double sum3 = ctp.add(2.5, 3.7);
	        String concatenatedString = ctp.add("Hello", " World");

	        System.out.println("Sum of two integers: " + sum1); 
	        System.out.println("Sum of three integers: " + sum2);
	        System.out.println("Sum of two double values: " + sum3); 
	        System.out.println("Concatenated string: " + concatenatedString); 
	    
		// TODO Auto-generated method stub

	}

}
