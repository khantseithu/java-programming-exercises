
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(2, 9);
    }
    public static void divisibleByThreeInRange(int beginning, int ending){
        for(int i = beginning; i <= ending; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
