import lists.*;
import lists.LinkedList;
public class ListExec {
    public static void main(String[] args) {
        // Singly linked list implementation 
        System.out.println("------------------------------\nSingly Linked List Implementation\n------------------------------");

        LinkedList<String> seasons = new LinkedList();
        seasons.addToHead("summer");
        seasons.addToTail("winter");
        seasons.addToTail("spring");
        seasons.addToTail("spring2");
        seasons.printList();
        seasons.removeHead();
        seasons.listReverse();
        seasons.printList();
        // below method doesent print <head> and <tail>
        seasons.printListReverse();
        // now we are checking our swapping functions 
        seasons.printList();
        seasons.swapElements("winter", "spring");
        seasons.printList();
        // we print this function because we return position of node
        // removeFromEnd gives null if index does not exist 
        System.out.println(seasons.removeFromEnd(1).getData());
        System.out.println(seasons.removeFromEnd(2).getData());

        //this function returns middle node in the list 
        System.out.println(seasons.findMiddle().getData());
        seasons.printList();
        //adding duplicate elements to check delete dupicate elements function
        seasons.addToTail("spring");
        seasons.addToTail("spring");
        seasons.addToTail("spring");
        //before calling the function
        seasons.printList();
        seasons.removeDuplicate();
        //after calling the function
        seasons.printList();
//==========================================================doubly linked list implementation=========================         
        System.out.println("------------------------------\nDoubly Linked List Implementation\n------------------------------");
        DoublyLinkedList months = new DoublyLinkedList();
        months.addToHead("jan");
        months.addToTail("feb");
        months.addToHead("march");
        months.addToHead("sept");
        months.addToTail("nov");
        months.printList();
        months.removeHead();
        months.printList();
        months.removeTail();
        months.printList();
    }
    
}
