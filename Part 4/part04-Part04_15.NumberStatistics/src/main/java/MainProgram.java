
import java.util.Scanner;

public class MainProgram {
    
    public static int sum = 0;
    public static int evenSum = 0;
    public static int oddSum = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise
//        Statistics statistics = new Statistics();
//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
//        System.out.println("Count: " + statistics.getCount());
//        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Average: " + statistics.average());
        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
        System.out.println("Enter numbers: ");
        
        while(true){
            int input = scanner.nextInt();
            
            if(input == -1){
                break;
            }
            if(input % 2 == 0){
                evenSum += input;
            }else{
                oddSum += input;
            }
            sum += input;
        }
        
        System.out.println("Sum: "+ sum);
        System.out.println("Sum of even numbers: "+ evenSum);
        System.out.println("Sum of even numbers: "+ oddSum);
    }
}
