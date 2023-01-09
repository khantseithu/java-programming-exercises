
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int input = Integer.valueOf(scanner.nextLine());
        
        for(int i = 1; i <= input; i++){
            System.out.println(i);
        }
        
        System.out.println("Where to?");
        int wt = Integer.valueOf(scanner.nextLine());
        
        
        System.out.println("Where from?");
        int secinput = Integer.valueOf(scanner.nextLine());
        
        for(int j = secinput; j <= wt; j++){
            if(wt < secinput){
                break;
            }
            System.out.println(j);
        }
        
    }
}
