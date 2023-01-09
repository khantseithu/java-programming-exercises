
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int sum = 0;
        int count = 0;
        
        while(true){
            
            String input = scanner.nextLine();
            
            if(input.isEmpty()){
                break;
            }
            
            String[] parts = input.split(",");
            String name = parts[0];
            int birthYear = Integer.parseInt(parts[1]);
            
            if(name.length() > longestName.length()){
                longestName = name;
            }
            sum += birthYear;
            count++;
        }
        
        double averageYear = sum / (double)count;
        
        System.out.println("Longest name: "+  longestName);
        System.out.println("Average of the birth years: "+ averageYear);

    }
}
