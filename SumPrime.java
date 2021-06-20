
import java.util.*; 

class SumPrime { 
	
	//Gib die Summe der Primzahlen  im Bereich von 0 bis Limit aus. 
	// ds ist der Datentyp (SumOfPrime) wird für die Anforderung der Aufgabe auf int oder long angepasst.

	static int sumOfPrimes(int limit) 
	{ 
		// Array to store prime numbers 
		boolean prime[]=new boolean[limit + 1]; 
		Arrays.fill(prime, true); 
	
		for (int p = 2; p * p <= limit; p++) { 
	 
			if (prime[p] == true) { 
	
				// Update all multiples of p 
				for (int i = p * 2; i <= limit; i += p) 
					prime[i] = false; 
			} 
		} 
	
		// Die Summe der Primzahlen mithilfe von Sieb des Eratosthenes  zurückgeben .
		int sum = 0; 
		for (int i = 0; i <= limit; i++) 
			if (prime[i]) 
				sum += i; 
		return sum; 
	} 

        // Überprüfung mit dem Limit(2000000).
	public static void main(String args[]) 
	{ 
		int n = 2000000; 
		System.out.print(sumOfPrimes(n)); 
	} 
} 

