
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IsItInTheFile {
    public static boolean foundStatus;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try(Scanner read = new Scanner(Paths.get(file))){
            while(read.hasNextLine()){
                String line = read.nextLine();
                if(line.equals(searchedFor)){
                    foundStatus = true;
                }else{
                    foundStatus = false;
                }
            }
            if(foundStatus){
                System.out.println("Found!");
            }else{
                System.out.println("Not Found.");
            }
        } catch (IOException ex) {
            System.out.println("Reading the file "+ file + " failed.");
        }

    }
}
