package lists;

public class LinkedList <T> {
    private Node1<T> head;
    public LinkedList() {
        this.head=null;
    }
    public void addToHead(T data){
        Node1<T> newHead = new Node1<T>(data);
        Node1<T> currentHead= this.head;
        this.head=newHead;
        if (currentHead !=null){
            this.head = newHead;
        }
        this.head = newHead;
        newHead.setNextNode(currentHead);
        
    }
    public Node1<T> getHead(){
        return this.head;
    }
    public void addToTail(T data){
        //if null is the first node the new node is head 
        if(head == null)
        this.head = new Node1<T>(data);
        else {
            Node1<T> currentNode = this.head;
            // itereate till the last node and add 
            while(currentNode.getNextNode() != null){
                currentNode=currentNode.getNextNode();
            }
            currentNode.setNextNode(new Node1<T>(data));
        } 

    }
    public T removeHead(){
       Node1<T> removedHead= this.head;
        if(removedHead==null)
        return null;
        
        this.head = removedHead.getNextNode();
        return removedHead.getData();
    }
    public T removeTail(){
        //declare a Node varible for iteration
        Node1<T> removedTail= this.head;
        //if list is empty return null
         if(removedTail==null)
         return null;
         // if node is not empty iterate through the list till second last element 
         // second last elements next node will be the last element and last element consists of null value
         while(removedTail.getNextNode().getNextNode()!=null)
         removedTail = removedTail.getNextNode();
         Node1<T> rm = removedTail.getNextNode();
         removedTail.setNextNode(null);
         return rm.getData();
     }
    public String printList(){
        String output="<head> ";
        Node1<T> i=this.head;
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
    public void swapElements(T data1,T data2){
        //node 1 to search for node with data1 
        //previousNode1<T> to keep track of previous pointer of node1 
        //node 2 to search for node with data 
        //previousNode2 to keep track of previous pointer of node2
        Node1<T> node1 = this.head;
        Node1<T> node2 = this.head;
        Node1<T> previousNode1<T> = null;
        Node1<T> previousNode2 = null;
        // if both the data are same then we cant swap them
        if(data1 == data2){
            System.out.println("Swap not possible because both the data are same");
            return;
        }
        //now we reach the node which consists of the data1
        // we maintain 2 pointers 
        while(node1 != null){
            if(node1.getData() == data1)
            break;
            previousNode1 = node1;
            node1 =node1.getNextNode();
        }
        //now we reach the node which consists of the data2
        // we maintain 2 pointers 
        while(node2 != null){
            if(node2.getData() == data2)
            break;
            previousNode2 = node2;
            node2 = node2.getNextNode();
        }
        // if data dint match that means given inputs are not present in our data here
        // so we return null here
        if(node1==null || node2 ==null){
            System.out.println("one of the node is null means it doesent exist in the list");
            return;
        }
        // if previous node is null for node 1 then it is  supposed to be head node
        // so as we are swapping we have to assign this.head pointer to node2 
        // or else we set previous of node 1 to point to node 2 
        if(previousNode1==null){
            this.head = node2;
        }
        else {
            previousNode1.setNextNode(node2);
        }
        // if previous node is null for node 2 then it is  supposed to be head node
        // so as we are swapping we have to assign this.head pointer to node1
        //or else we set previous of node 2 to point to node 1
        if(previousNode2 == null){
            this.head = node1;
        }
        else {
            previousNode2.setNextNode(node1);
        }
        // now we change the what node1 and node2 actually points here
        //we use temp to keep track of node1 next element here
        Node1 temp = node1.getNextNode();
        node1.setNextNode(node2.getNextNode());
        node2.setNextNode(temp);

    }
    public Node1<T> removeFromEnd(int postion){
        // two nodes one will be chasing end other will be position steps behind the tail
        Node1<T> tailSeeker = this.head;
        Node1<T> current = null;
        int count = 0;
        while(tailSeeker != null){
            tailSeeker = tailSeeker.getNextNode();
                if (count >= postion){
                    if(current == null){
                    current = this.head;
                    }
                    current = current.getNextNode();
                }
            count ++;
        }
        return current;
    }
    public Node1<T> findMiddle(){
        Node1<T> fastPointer = this.head;
        Node1<T> slowPointer = this.head;
        //move the fastpointer 2 times 
        //move the slow pointer ones 
        // when fastpoiinter reaches end slow would be at middle
        while(fastPointer != null){
            fastPointer = fastPointer.getNextNode();
            // we cannot move further if fast pointer reaches null so we check before moving here
            if(fastPointer!=null){
            fastPointer = fastPointer.getNextNode();
            slowPointer = slowPointer.getNextNode();
            }
        }
        return slowPointer;
    }
    public void removeDuplicate(){
        if(this.head == null){
            System.out.println("Zero Elements in the list");
            return;
        }
        Node1<T> itereator1 = this.head;
        Node1<T> itereator2 = itereator1.getNextNode();
        while(itereator1 != null){
            Node1<T> prev = itereator1;
            while(itereator2 != null){
                if(itereator1.getData() == itereator2.getData()){
                    prev.setNextNode(itereator2.getNextNode());
                    itereator2.setNextNode(null);
                    itereator2 = itereator1.getNextNode();
                    continue;
                }
                prev = itereator2;
                itereator2 = itereator2.getNextNode();
            }
            itereator1=itereator1.getNextNode();
            if(itereator1 != null)
            itereator2=itereator1.getNextNode();
        }         
    }
    public void listReverse(){
        if(this.head==null)
        return;
        else {
            Node1<T> currentHead= this.head;
            Node1<T> prev = null;
            Node1<T> cnext = currentHead.getNextNode();
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
