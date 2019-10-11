package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("$10,000 @ 2% interest = " + calculateInterest(10000.0, 2.0));

        for(int i=0; i<6; i++) {
            System.out.println("Loop " + i + " hello");
        }

        // using the for statement call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window.

        for(int i=2; i<9; i++) {
            System.out.println("$10,000 @ " + (double) i + " interest is " + String.format("%.2f", calculateInterest(10000.0, (double) i)));

        }

        System.out.println("***********************************");

        // How would you modify the for loop above to do the same thing as
        // shown, but to start from 8% and work back to 2%?

        for(int i=8; i>=2; i--) {
            System.out.println("$10,000 @ " + (double) i + " interest is " + String.format("%.2f", calculateInterest(10000.0, (double) i)));

        }

        System.out.println("***********************************");


        // Create a for statement using any range of numbers
        // determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the number of prime numbers found
        // if that count is 3 exit the for loop
        // hint: use break; statement to exit
        int count = 0;
        for(int i=0; i<10000; i++) {
            if (count <3) {
                boolean test = isPrime(i);
                if (test) {
                    System.out.println(i);
                    count++;
                }
            } else {
                break;
            }

        }

        System.out.println("***********************************");
        
        int whileCount = 0;
        int primeCount = 0;
        while(primeCount != 3) {
            boolean test = isPrime(whileCount);
            if (test) {
                System.out.println(whileCount);
                primeCount++;
            }
            whileCount++;
        }
    }

    public static boolean isPrime(int n) {
        if( n==1) {
            return false;
        }

        for (int i=2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;

    }

    private static double calculateInterest(double amount, double interestRate) {
        return (amount *(interestRate/100));
    }

}
