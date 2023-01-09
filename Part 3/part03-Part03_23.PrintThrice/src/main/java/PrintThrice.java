
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        // Write your program here
        System.out.println("Give a word: ");
        String input = scanner.nextLine();
        for(int i = 0; i < 3; i++){
            result += input;
            
        }
        System.out.println(result);
    }
}
