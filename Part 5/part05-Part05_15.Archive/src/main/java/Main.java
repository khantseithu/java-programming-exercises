//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
////        ArrayList<String> list = new ArrayList<>();
//        ArrayList<Item> items = new ArrayList<>();
//
//        while(true){
//            System.out.println("Identifier? (empty will stop)");
//            String identifier = scanner.nextLine();
//            
//            if(identifier.isEmpty()){
//                break;
//            }
//            
//            System.out.println("Name? (empty will stop)");
//            String name = scanner.nextLine();
//            
////            list.add(identifier);
////            list.add(name);
//
//            Item item = new Item(identifier,name);
//            
//            if(items.contains(item)){
//                //pass
//                System.out.println("Already on list.");
//            }else{
//                items.add(item);
//            }
//            
//        }
//        
//        
//        
//        System.out.println("==Items==");
//        for (Item item : items) {
//            System.out.println(item.indentifier + ": " + item.name);
//        }
//    }
//}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Item> itemsArrayList = new ArrayList();

        while (true) {

            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();

            if (identifier.isEmpty()) {
                break;

            }

            System.out.println("Name? (empty will stop)");

            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;

            }

            Item item = new Item(name, identifier);

            if (itemsArrayList.contains(item)) {
                
                System.out.println("Already on list");

            } else {
                itemsArrayList.add(item);
            }

        }
        System.out.println("==Items==");

        for (Item e : itemsArrayList) {

            System.out.println(e);
        }

    }
}
