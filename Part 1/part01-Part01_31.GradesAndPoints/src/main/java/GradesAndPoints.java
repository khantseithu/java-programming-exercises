
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        
        int p = Integer.valueOf(scan.nextLine());
        if (p > 100){
            System.out.println("incredible!");
        } else if(p >= 90 && p <= 100){
            System.out.println("5");
        } else if(p >= 80 && p <= 89){
            System.out.println("4");
        } else if(p >= 70 && p <= 79){
            System.out.println("3");
        } else if(p >= 60 && p <= 69){
            System.out.println("2");
        } else if(p >= 50 && p <= 59){
            System.out.println("1");
        } else if(p >= 0 && p <= 49){
            System.out.println("failed");
        } else {
            System.out.println("impossible!");
        }
    }
}
