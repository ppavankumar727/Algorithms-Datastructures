package queues;
import lists.LinkedList;
public class Queue<T> {
    private LinkedList queue;
    private int size;
    private int maxSize;
    private static int DEFAULT_SIZE=Integer.MAX_VALUE;
    
    public Queue(int maxSize){    
        this.queue=new LinkedList();
        this.maxSize=maxSize;
        this.size=0;
    }
    public Queue(){
        this(DEFAULT_SIZE);
    }

    public boolean isEmpty(){
        return this.size==0;
    }
    public boolean hasSpace(){
        return this.size<this.maxSize;
    }
    public void enqueue(T data)throws Exception{
        // we can only add data if we have space in the queue 
        //we add data and increment the size variable
        //we add at the tail
        if(this.hasSpace()){
            this.queue.addToTail(data);
            this.size++;
            System.out.println("Added "+data+" Queue Size is "+this.size);
        }
        else {
            // we throw an error on to the scree if the queue is full
           // throw new Error("Queue is Full!");
           System.out.println("Queue is Full!");
        }
    }
    public T dequeue()throws Exception {
        //if queue is empty we cannnot remove further 
        // so we check whether empty or not if not empty we are supposed to remove
        // we remove it from the front
        if(!this.isEmpty()){
           T data = this.queue.removeHead();
           this.size--;
           System.out.println("The removed data is "+data+" queue size :"+this.size);
           return data;
        }
        else {
            //throw new Error("The Queue Is Empty!!");
            System.out.println("The Queue Is Empty!!");
            return null;
        }
    }
    public T peek(){
        //if list is empty we dont return anything 
        //so we check if the list is empty and return the data
        if(!this.isEmpty()){
            return this.queue.getHead().getData();
        }
        else{
            return null;
        }
    }
    
   public void printQueue(){
       this.queue.printList();
   }
}