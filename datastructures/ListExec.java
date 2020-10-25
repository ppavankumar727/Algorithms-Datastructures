import list.Node1;
import list.DoublyLinkedList;
import list.LinkedList;
public class ListExec {
    public static void main(String[] args) {
        // Singly linked list implementation 
        LinkedList seasons = new LinkedList();
        seasons.addToHead("summer");
        seasons.addToTail("winter");
        seasons.addToTail("spring");
        seasons.addToTail("spring2");
        seasons.printList();
        seasons.removeHead();
        seasons.listReverse();
        seasons.printList();
        // doubly linked list implementation 
        DoublyLinkedList months = new DoublyLinkedList();
    }
    
}
