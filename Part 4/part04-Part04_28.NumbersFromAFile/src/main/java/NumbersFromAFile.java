
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NumbersFromAFile {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        
        try(Scanner read = new Scanner(Paths.get(file))){
            int counter = 0;
            while(read.hasNextLine()){
                int row = Integer.valueOf(read.nextLine());
                if(row >= lowerBound && row <= upperBound){
                    counter++;
                }
            }
            System.out.println("Numbers: "+ counter);
        } catch (IOException ex) {
            Logger.getLogger(NumbersFromAFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

}
