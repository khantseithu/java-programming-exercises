
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        return this.squares > compared.squares;
    }
    
    public int priceDifference(Apartment compared){
        int thisPrice = this.squares * this.princePerSquare;
        int comparedPrice = compared.squares * compared.princePerSquare;
        
        return Math.abs(thisPrice - comparedPrice);
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int priceDifference = this.priceDifference(compared);
        if(priceDifference > 0){
            return true;
        }else{
            return false;
        }
        
        
    }
}
