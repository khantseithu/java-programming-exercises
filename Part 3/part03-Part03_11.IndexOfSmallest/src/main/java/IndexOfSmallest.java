
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999){
                break;
            }
            
            list.add(input);
        }
        
        int min = Collections.min(list);
        ArrayList<Integer> minIndexes = new ArrayList();
        
        for(int i = 0; i < list.size(); i++){
            if (list.get(i) == min){
                minIndexes.add(i);
            }
            
        }
        
        System.out.println("Smallest number: "+ min);
        
        for(int i : minIndexes){
            System.out.println("Found at index: "+ i);
        }
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
