
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String name = "";
        
        while(true){
            String input = scanner.nextLine();
            
            if(input.isEmpty()){
                break;
            }
            
            String[] parts = input.split(",");
            String namee = parts[0];
            int age = Integer.valueOf(parts[1]);
            if(age >  count){
                count = age;
                name = namee;
            }
        }
        
        System.out.println("Name of the oldest: "+ name);


    }
}
