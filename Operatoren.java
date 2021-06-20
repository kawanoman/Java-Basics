	/* ######################################################################
	 
	 							PraxisZettel-Java 11 
	 							     Aufgabe1
	 							
	###################################################################### */
/*Java implementation to Divide two integers without using division and mod operator*/

//import relevant Packages for Java.
import java.io.*; 
class Operatoren { 
	
	// Function to divide a by b and 
	// return a quotient of it 
	static int div(int dividend, int divisor) {
		//Declaration of variables.
		int sign;//  Value of the divisor's sign 
		int quotient;// Value of how often one number is divisible by another.
		// sign will be negative only if 
		// either one of them is negative 
		// otherwise it will be positive 
		sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1; 
	
		// Making both divisor and 
		// dividend positive 
		dividend = Math.abs(dividend); 
		divisor = Math.abs(divisor); 
		// Zero division Exception. 
	    if (divisor == 0)  { 
	        System.out.println("Cannot Divide by 0");
	    }
	    if (dividend == 0) {
	    	System.out.println(dividend + " / " + divisor +  " is equal to : " + 0);
	    }
	    if (divisor == 1)  
	    { 
	        System.out.println(dividend + " / " + divisor +   " is equal to : " +   sign * dividend); 
	    }
		
	 // Initialize the quotient
	    quotient =0;
	    
		while (dividend >= divisor)  // if dividend is greater than equal to divisor 
			 
		{ 
			dividend -= divisor; // subtract divisor from dividend and increase 
			// quotient by one.	
			// or dividend = dividend - divisor ; 
			++quotient; 
		} 
	
		return sign * quotient; 
	}	 
	
	
	static int mod(int dividend, int divisor) 
    { 
        return (dividend - divisor * (dividend / divisor)); 
    }
	// let's see if the Program works for some positive and negative numbers!
	
		public static void main (String[] args) { 
			int a = 15; 
			int b = 3; 
			System.out.print("Das Ergebnis der ersten Division-Rechnung ist:" );	
			System.out.println(div(a, b)); 
			
			a = 30; 
			b = -4; 
			System.out.print(" Das Ergebnis der zweiten Division-Rechnung ist:" );	
			System.out.println(div(a, b)); 
			
			System.out.print("Das Ergebnis des Rests:");
			System.out.println(mod(100, 7));
			
			
			
	        


	        

	        
		}
  
	
	   
   
       
    } 
 


