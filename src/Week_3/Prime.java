package Week_3;

import java.util.*;

public class Prime {

    /**
     * Create method to find check if number is prime number or not.
     * @param a the number that we need to check.
     * @return boolean result.
     */
    public static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPrime(n)) {
            System.out.print(n + " is Prime");
        }
        else System.out.print(n + " is not Prime");
    }
}