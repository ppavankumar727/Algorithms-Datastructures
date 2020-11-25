package stack;
import lists.LinkedList;
public class Stack {
    private LinkedList stack;
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
    public String pop(){
        if(!this.isEmpty()){
            String data = this.stack.removeHead();
            this.size--;
            return data;
        }else {
            return null;
        }
    }
    public boolean push(String data){
        if(this.hasSpace()){
            this.stack.addToHead(data);
            this.size++;
            return true;
        }
        else {
            return false;
        }

    }
    public String peek(){
       return this.stack.getHead().getData();
    }

    
}
