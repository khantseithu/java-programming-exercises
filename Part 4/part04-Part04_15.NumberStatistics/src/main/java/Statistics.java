
public class Statistics {
    private int count;
    private int sum;
    
    

    public void addNumber(int number) {
        // write code here
        this.sum += number;
        this.count++; 
    }

    public int getCount() {
        // write code here
        return this.count;
    }
    
    public int sum(){
        return this.sum;
    }
    
    public double average(){
        return (double) sum / count;
    }
}
