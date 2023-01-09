
import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    
    public Suitcase(int maxWeight){
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item){
        items.add(item);
    }
    
    public void printItems(){
        for(Item item : items){
            System.out.println(item);
        }
    }
    
    public int totalWeight(){
        int weight = 0;
        for(Item item : items){
            weight += item.getWeight();
        }
        
        return weight;
    }
    
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        
        Item heaviestItem  = this.items.get(0);
        for(Item item : items){
            
            if(item.getWeight() > heaviestItem.getWeight()){
                heaviestItem = item;
            }
            
        }
        return heaviestItem;
    }
    
    public String toString(){
        String weightOutput = " (" + totalWeight() + " kg)";
        String itemOutput = "";

        if (items.isEmpty()) {
            itemOutput = "no items";
        } else if (items.size() == 1) {
            itemOutput = "1 item";
        } else {
            itemOutput = items.size() + " items";
        }

        return itemOutput + weightOutput;
    }
    
}
