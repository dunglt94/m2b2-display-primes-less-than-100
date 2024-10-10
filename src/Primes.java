public class Primes {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            int N = 2;
            boolean isPrime = true;
            while (N <= Math.sqrt(i)) {
                if (i % N == 0) {
                    isPrime = false;
                    break;
                }
                N++;
            }
            if (isPrime) {
                if (i == 2) System.out.print(i);
                else System.out.print(", " + i);
            }
        }
    }
}
