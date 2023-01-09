
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        int sum = firstNum + secondNum;
        int subtract = firstNum - secondNum;
        int product = firstNum * secondNum;
        double division = firstNum / (double) secondNum;
        System.out.println(firstNum + " + " + secondNum + " = "+ sum);
        System.out.println(firstNum + " - " + secondNum + " = "+ subtract);
        System.out.println(firstNum + " * " + secondNum + " = "+ product);
        System.out.println(firstNum + " / " + secondNum + " = "+ division);
    }
}
