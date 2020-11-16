package lists;
public class DoublyLinkedList{
    //as doubly linked list maintains 2 pointers beggining and ending 
    private Node2 head;
    private Node2 tail;
    public DoublyLinkedList(){
        this.head=null;
        this.tail=null;
    }
    public void addToHead(String data){
        Node2 newHead = new Node2(data);
        Node2 currentHead = this.head;
        // checking weather list is not empty and adjusting the pointers
        if(currentHead !=null){
            currentHead.setPreviousNode(newHead);
            newHead.setNextNode(currentHead);
        }
        this.head = newHead;
        //if tail is null the list was empty before adding  
        // so we have to remove null assing tail to new node
        if(this.tail==null){
        this.tail=newHead;
      }
    
    }
    public void addToTail(String data){
        Node2 newTail= new Node2(data);
        Node2 currentTail= this.tail;
        // checking weather list is not empty and adjusting the pointers
        if(currentTail != null){
            currentTail.setNextNode(newTail);
            newTail.setPreviousNode(currentTail);
        }
        this.tail = newTail;
        //if head is null the list was empty before adding  
        // so we have to remove null assing head to new node
        if(this.head == null)
        this.head=newTail;
    }
    public String removeHead(){
        Node2 removedHead = this.head;
        // if head is null then return null 
        if(removedHead == null)
        return null;
        // update the head to remove
        this.head=removedHead.getNextNode();
        //if updated head is not ewal to null so it has elements
        // so we have to update the previous link of the head
        if(this.head != null){
            this.head.setPreviousNode(null);
        }
        //if removed head is equal to tail then list had only one element
        //so we have to remove the tail here 
        if(this.tail==removedHead){
        this.removeTail();
        }
        return removedHead.getData();
    }
    public String removeTail(){
        Node2 removedTail = this.tail;
        // if tail is null then return null 
        if(removedTail == null)
        return null;
        // update the tail to remove
        this.tail=removedTail.getPreviousNode();
        //if updated tail is not ewal to null so it has elements
        // so we have to update the next link of the tail
        if(this.tail != null){
            this.tail.setNextNode(null);
        }
        //if removed tail is equal to head then list had only one element
        //so we have to remove the head here 
        if(this.head==removedTail){
            this.removeHead();
        }
        return removedTail.getData();
    }

    public String printList(){
        String output="<head> ";
        Node2 i=this.head;
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