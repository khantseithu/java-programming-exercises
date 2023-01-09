
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        int sum = 0;
        int count = 0;
        int evencount = 0;
        int oddcount = 0;
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            
            
            if(num != -1){
                sum += num;
                count++;
                if (num % 2 == 0){
                    evencount++;
                } else{
                    oddcount++;
                }
                continue;
            } 
            
            if(num == -1){
                System.out.println("Thx! Bye!");
                System.out.println("Sum: "+ sum);
                System.out.println("Numbers: "+ count);
                double average = 1.0 * sum / count;
                System.out.println("Average: "+ average);
                System.out.println("Even: "+ evencount);
                System.out.println("Odd: "+ oddcount);
                break;
            }
            
            
        }
        
        
    }
}
