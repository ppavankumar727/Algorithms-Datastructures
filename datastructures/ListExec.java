import list.Node1;
import list.LinkedList;
public class ListExec {
    public static void main(String[] args) {
        LinkedList seasons = new LinkedList();
        seasons.addToHead("summer");
        seasons.printList();
        seasons.addToTail("winter");
        seasons.addToTail("winter");
        seasons.printList();
        seasons.removeTail();
        seasons.printList();
        seasons.removeHead();
        seasons.printList();
    }
    
}
