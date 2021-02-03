package stack;

public class MinStack extends Stack{
    private Stack<Integer> s2 ;
    
    public MinStack(int maxSize){
        super(maxSize);
        this.s2 = new Stack(maxSize);
    }
    public boolean push(int data){
       Boolean b =  super.push(data);
        if( data < min() )
           s2.push(data);
        return b;
    }
    public int pop () {
        if( min() == (int) super.peek())
        s2.pop();
        return (int) super.pop();
    }

    public int min(){
        return s2.peek();
    }
}