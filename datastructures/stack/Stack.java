package stack;
import lists.LinkedList;
public class Stack <T> {
    private LinkedList <T> stack;
    private int size;
    private int maxSize;
    private static int DEFAULT_INTEGER = Integer.MAX_VALUE;

    public Stack(int maxSize){
        this.stack = new LinkedList();
        this.size = 0;
        this.maxSize=maxSize;
    }

    public Stack(){
        this(DEFAULT_INTEGER);
    }

    private boolean hasSpace(){
        return this.size < this.maxSize;
    }
    private boolean isEmpty(){
        return this.size == 0;
    }
    public T pop(){
        if(!this.isEmpty()){
            T data = this.stack.removeHead();
            this.size--;
            System.out.println("Popped "+data+" From stack size :"+this.size);            
            return data;
        }else {
            System.out.println("Stack Is Empty!!");
            return null;
        }
    }
    public boolean push(T data){
        if(this.hasSpace()){
            this.stack.addToHead(data);
            this.size++;
            System.out.println("Pushed "+data+" to stack size :"+this.size);
            return true;
        }
        else {
            System.out.println("Stack Is Full!!");
            return false;
        }

    }
    public T peek(){
        if (this.isEmpty())
        return null;
        else
       return this.stack.getHead().getData();
    }

    
}
