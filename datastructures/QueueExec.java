import queues.Queue;
public class QueueExec {
    public static void main(String[] args) {
        //bounded Queue of 5
        Queue months = new Queue(6);
        months.enqueue("jan");
        months.enqueue("feb");
        months.enqueue("mar");
        months.enqueue("apr");
        months.enqueue("jub");
        months.enqueue("jul");
        //overflow
        months.enqueue("aug");

        
        
    }
}
