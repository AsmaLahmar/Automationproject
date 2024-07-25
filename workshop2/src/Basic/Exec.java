package Basic;

public class Exec {

	public static void main(String[] args) {
		
		Calculatrice sharp = new Calculatrice();
		
		int c = sharp.multiply(7 , 9);
		
		System.out.println(c);
		
		int b = sharp.add(15, 30);
		
		System.out.println(b);
		
		
		
		int d = sharp.add(c, b);
		
	    System.out.println(d);
	    
	    
	    double a = sharp.racine(d);
	    
	    System.out.println(a);
	    
	    
	    
	    
	    
	}
			
}


