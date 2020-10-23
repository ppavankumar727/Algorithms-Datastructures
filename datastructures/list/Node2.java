package list;

public class Node2 {

    private String data;
    private Node2 next;
    private Node2 previous;
  
    public Node2(String data) {
      this.data = data;
      this.next = null;
    }
    
    public void setNextNode(Node2 node) {
      this.next = node;
    }
  
    public void setPreviousNode(Node2 node) {
      this.previous = node;
    }
  
    public Node2 getNextNode() {
      return this.next;
    }
  
    public Node2 getPreviousNode() {
      return this.previous;
    }
  
  }
