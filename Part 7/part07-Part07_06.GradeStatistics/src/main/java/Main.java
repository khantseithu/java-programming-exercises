import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GradeBook gradeBook = new GradeBook();

        TextInterface txtInterface = new TextInterface(scanner, gradeBook);
        txtInterface.start();
    }
}