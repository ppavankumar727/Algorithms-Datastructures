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
    // we are overloading this funtion 
    // because we cant pass parameter from main class because the head variable is private
    public void printListReverse(){
        printListReverse(this.head);
    }
    // prints the list in reverse order 
    // uses recursive method 
    private void printListReverse(Node1 node1){
        if(node1.getNextNode()==null)
        System.out.print(node1.getData()+" ");
        else{
            printListReverse(node1.getNextNode());
            System.out.print(node1.getData()+" ");
        }
    }
    public void swapElements(String data1,String data2){
        Node1 node1 = this.head;
        Node1 node2 = this.head;
        Node1 previousNode1 = null;
        Node1 previousNode2 = null;
        if(data1 == data2){
            System.out.println("Swap not possible because both the data are same");
            return;
        }
        while(node1 != null){
            if(node1.getData() == data1)
            break;
            previousNode1 = node1;
            node1 =node1.getNextNode();
        }

        while(node2 != null){
            if(node2.getData() == data2)
            break;
            previousNode2 = node2;
            node2 = node2.getNextNode();
        }
        if(node1==null || node2 ==null){
            System.out.println("one of the node is null means it doesent exist in the list");
            return;
        }

        if(previousNode1==null){
            this.head = node2;
        }
        else {
            previousNode1.setNextNode(node2);
        }
        if(previousNode2 == null){
            this.head = node1;
        }
        else {
            previousNode2.setNextNode(node1);
        }
        Node1 temp = node1.getNextNode();
        node1.setNextNode(node2.getNextNode());
        node2.setNextNode(node1);

    }

    public void listReverse(){
        if(this.head==null)
        return;
        else {
            Node1 currentHead= this.head;
            Node1 prev = null;
            Node1 cnext = currentHead.getNextNode();
            while(currentHead != null){
                currentHead.setNextNode(prev);
                prev = currentHead;
                currentHead = cnext;
                if(cnext != null)
                cnext = cnext.getNextNode();
            }
            this.head = prev;
        }
    }
    
}
