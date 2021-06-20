//import relevant Packages for Java.
import java.io.*; 
public class PowerToP {

	// Function to calculate N raised to the power P,where N is 2 for 2Power numbers. "Iterative Approach".
    static int powerInt1(int N, int P) 
    { 
        int pow = 1; 
        for (int i = 1; i <= P; i++) 
            pow *= N; 
        return pow; 
    }
    
    static int powerLong1(int N, long P) 
    { 
    	
  
        int pow = 1; 
        for (int i = 1; i <= P; i++) 
            pow *= N; 
        return  pow;
        
    }
    
    static int powerShort1(int N, short P) 
    { 
    	
  
        int pow = 1; 
        for (int i = 1; i <= P; i++) 
            pow *= N; 
        return pow;
        
    }
    
    static int powerByte1(int N, byte P) 
    { 
    	
  
        int pow = 1; 
        for (int i = 1; i <= P; i++) 
            pow *= N; 
        return pow;
        
    }  
    
   	//#################################################################################
   	
   	// Function to calculate 2 raised to the power P with  the "recursive approach". 
       static int powerInt( int N , int P) // where N= 2 
       { 
           if (P == 0) 
               return 1; 
           else
               return N * powerInt(N, P - 1); 
       }
       
       static long powerLong( int N , long P) // where N= 2 
       { 
           if (P == 0) 
               return 1; 
           else
               return (long) N * powerLong(N, (long)P - 1); 
       }
       
       static short powerShort( int N , short P) // where N= 2 
       { 
           if (P == 0) 
               return 1; 
           else
               return  (short) (N * powerShort(N, (short) (P - 1))); 
       }
       
       static byte powerByte( int N , byte P) // where N= 2 
       { 
           if (P == 0) 
               return 1; 
           else
               return (byte) (N * powerByte(N, (byte) (P - 1))); 
       }
       
   	// let's see if the Program works for different approaches!
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Display some results with  the iterative approach. 
		 System.out.println(powerInt1(2, 3));
	     System.out.println(powerLong1(2,10000L));
	     System.out.println(powerShort1(2,(short) 10));
	     System.out.println(powerInt1(2,50));
	     
		    
		// Display some results with  the recursive approach.  
	     System.out.println(powerInt(2, 3));
	     System.out.println(powerLong(2, (long) 10000L));
	     System.out.println(powerShort(2, (short) 10));
	     System.out.println(powerByte(2,(byte) -50));
	        
	      

	        

	}

}
