package src.javaDSA;

public class sumofnumber_givenNum {
    public static void main(String[] args) {
        int num1 = 5;
        int num = 10;

        int sum = 0;

        for (int i = num1; i <= num; i++) {
            sum += i;
        }

        System.out.println("The sum of numbers from " + num1 + " to " + num + " is: " + sum);
    }
    
}
