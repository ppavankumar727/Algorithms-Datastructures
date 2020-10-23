package list;
public class LinkedList {
    private Node1 head;
    public LinkedList() {
        this.head=null;
    }
    public void addToHead(String data){
        Node1 newHead = new Node1(data);
        Node1 currentHead= this.head;
        this.head=newHead;
        if (currentHead !=null){
            this.head = newHead;
        }
        this.head = newHead;
        newHead.setNextNode(currentHead);
        
    }
    public void addToTail(String data){
        //if null is the first node the new node is head 
        if(head == null)
        this.head = new Node1(data);
        else {
            Node1 currentNode = this.head;
            // itereate till the last node and add 
            while(currentNode.getNextNode() != null){
                currentNode=currentNode.getNextNode();
            }
            currentNode.setNextNode(new Node1(data));
        } 

    }
    public String removeHead(){
       Node1 removedHead= this.head;
        if(removedHead==null)
        return null;
        
        this.head = removedHead.getNextNode();
        return removedHead.getData();
    }
    public String removeTail(){
        //declare a Node varible for iteration
        Node1 removedTail= this.head;
        //if list is empty return null
         if(removedTail==null)
         return null;
         // if node is not empty iterate through the list till second last element 
         // second last elements next node will be the last element and last element consists of null value
         while(removedTail.getNextNode().getNextNode()!=null)
         removedTail = removedTail.getNextNode();
         Node1 rm = removedTail.getNextNode();
         removedTail.setNextNode(null);
         return rm.getData();
     }
    public String printList(){
        String output="<head> ";
        Node1 i=this.head;
        while(i.getNextNode()!=null){
            output += i.getData() + " ";
            i=i.getNextNode();
        }
        output += i.getData() + " ";
        output +="<tail>";
        System.out.println(output);
        return output;
    }
    
}
