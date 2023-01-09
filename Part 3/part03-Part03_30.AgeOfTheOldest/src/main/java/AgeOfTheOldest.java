
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        
        while(true){
            String input = scanner.nextLine();
            
            if(input.isEmpty()){
                break;
            }
            
            String[] parts = input.split(",");
            int age = Integer.valueOf(parts[1]);
            if(age >  count){
                count = age;
            }
        }
        
        System.out.println("Age of the oldest: "+ count);

    }
}
