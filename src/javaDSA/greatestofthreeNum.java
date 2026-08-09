package src.javaDSA;

public class greatestofthreeNum {
    public static void main(String[] args) {
        int num = 40;
        int num1 = 20;
        int num2 = 30;

        if (num > num1 && num > num2) {
            System.out.println(num + " is the greatest number.");
        } else if (num1 > num && num1 > num2) {
            System.out.println(num1 + " is the greatest number.");
        } else {
            System.out.println(num2 + " is the greatest number.");
        }
    }
}
