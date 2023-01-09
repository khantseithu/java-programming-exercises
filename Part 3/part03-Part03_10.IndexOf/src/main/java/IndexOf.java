
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        // implement here finding the indices of a number
        System.out.println("Search for?");
        int input = Integer.valueOf(scanner.nextLine());
        int index = list.indexOf(input);
        for(int i = 0; i < list.size(); i++){
            int num = list.get(i);
            
            if (num == input){
                System.out.println(input + " is at index " + i);
            }
        }
        
        int smallest = list.get(0);
        for(int i = 0; i < list.size(); i++){
            int number = list.get(0);
            if (number < smallest){
                smallest = number;
            }
        }
        System.out.println("Smallest number: "+ smallest);
        
        for(int i = 0; i < list.size(); i++){
            int base = list.get(i);
            if (base == smallest){
                System.out.println("Found at index: "+ base);
            }
        }
    }
}
