package src.javaDSA;

public class primenum {

    public static void main(String[] args) {

        int n = 10;
        int count = 0;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                count = count + 1;
            }
        }

        if (count == 2) {
            System.out.println("Yes, number is prime");
        } else {
            System.out.println("No, number is not prime");
        }
    }
}