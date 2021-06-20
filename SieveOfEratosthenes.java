
public class SieveOfEratosthenes {
    void sieveOfEratosthenes(int n){
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;
            prime[0] = false;
            prime[1] = false;


 
        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is not changed, then it is a
            // prime
            if (prime[p] == true) {
                // Update all multiples of p
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
 
        // Print all prime numbers
        for (int i = 0; i <= n; i++)
        {
            if (prime[i] == true)
                System.out.print(i + " ");
        }
    }
 
    public static void main(String args[])
    {
        int n = 100;
        System.out.print(
            " Die Ausgabe der Primzahlen sind  ");
        System.out.println(" kleiner oder gleich " + n +",so bitteschön: ");
        SieveOfEratosthenes g = new SieveOfEratosthenes();
        g.sieveOfEratosthenes(n);
    }
}

