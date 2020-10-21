public class Node {
    private String data;
    private Node next;

    public Node (String data){
        this.data = data;
        this.next = null;
    }
    public void setNextNode(Node next){
        this.next = next;
    }
    public Node getNextNode(){
        return this.next;
    }
    public setData(String data){
        this.data = data;
    }

}