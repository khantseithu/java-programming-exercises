
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

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

        // implement finding the greatest number in the list here
        int check = 0;
        for(int number : list ){
            if(number > check){
                check = number;
            }
        }
        System.out.println("The greatest number: "+ check);
    }
}
