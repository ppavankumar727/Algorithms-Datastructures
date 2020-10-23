package list;
public class Node1 {
    private String data;
    private Node1 next;

    public Node1 (String data){
        this.data = data;
        this.next = null;
    }
    public void setNextNode(Node1 next){
        this.next = next;
    }
    public Node1 getNextNode(){
        return this.next;
    }
    public void setData(String data){
        this.data = data;
    }
    public String getData(){
       return this.data;
    }

}