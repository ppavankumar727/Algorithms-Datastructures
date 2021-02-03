package lists;
public class Node1 <T> {
    private T data;
    private Node1 next;

    public Node1 (T data){
        this.data = data;
        this.next = null;
    }
    public void setNextNode(Node1 next){
        this.next = next;
    }
    public Node1 getNextNode(){
        return this.next;
    }
    public void setData(T data){
        this.data = data;
    }
    public T getData(){
       return this.data;
    }

}