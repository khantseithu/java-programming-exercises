
public class Main {

    public static void main(String[] args) {


        // Try out your class here
//        SimpleCollection c = new SimpleCollection("characters");
//        System.out.println("Pisin: " + c.longest());
//        
//        c.add("magneto");
//        c.add("mystique");
//        c.add("phoenix");
//        
//        System.out.println("Longest: " + c.longest());
        
        SimpleCollection j = new SimpleCollection("characters");
        System.out.println("Longest: " + j.longest());

        j.add("magneto");
        j.add("mystique");
        j.add("phoenix");

        System.out.println("Longest: " + j.longest());


        
    }
}
