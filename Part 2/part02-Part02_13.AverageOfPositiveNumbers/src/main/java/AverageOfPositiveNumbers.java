
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while(true){
            int n = Integer.valueOf(scanner.nextLine());
            
            if (n == 0){
                break;
            }
            if (n > 0){
                count = count +1;
                sum = sum + n;
            }
//            if (n != 0){
//                count = count +1;
//            }
        }
        
        double percentage = sum / (double) count;
        
        if(count == 0){
            System.out.println("Cannot calculate the average");
        } else{
            System.out.println(percentage);
        }
    }
}
