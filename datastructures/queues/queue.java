package queues;
import lists.LinkedList;
public class queue {
    private LinkedList quque;
    private int count;
    private int maxSize;
    private static int DEFAULT_SIZE=Integer.MAX_VALUE;
    
    public queue(int maxSize){
        this.quque=new LinkedList();
        this.maxSize=maxSize;
        this.count=0;
    }
    
}
