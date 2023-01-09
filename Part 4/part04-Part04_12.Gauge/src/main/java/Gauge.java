public class Gauge {
    private int value;
    
    public Gauge(){
        this.value = 0;
    }
    
    public void increase(){
//        if(this.value < 6){
//            for(int i = this.value; i < 6; i++){
//                this.value++;
//            }
//        }

        if(this.value < 5){
            this.value++;
        }
    }
    
    public void decrease(){
//        if(value > 0){
//            for(int i = this.value; i > 0; i--){
//                this.value--;
//            }
//        }

        if(this.value > 0){
            this.value--;
        }
    }
    
    public int value(){
        return this.value;
    }
    
    public boolean full(){
        if(this.value == 5){
            return true;
        }
        return false;
    }
}
