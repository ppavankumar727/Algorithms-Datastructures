package stack;

public class MinStack extends Stack{
    private Stack s2 ;
    
    public MinStack(int maxSize){
        super(maxSize);
        this.s2 = new Stack(maxSize);
    }
    public boolean push(String data){
        if(data  min())
        super.push(data);
    }
    public String min(){
        return s2.peek();
    }
}