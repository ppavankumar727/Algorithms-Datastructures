import queues.Queue;
public class QueueExec {
    public static void main(String[] args) throws Exception {
        //bounded Queue of 5
        Queue months = new Queue(6);
         months.enqueue("jan");
        months.enqueue("feb");
        months.enqueue("mar");
        months.enqueue("apr");
        months.enqueue("jun");
       months.enqueue("jul");
        //overflow will occour error will be thrown 
        //go to queue class queus/Queue.java
        //try {
            months.enqueue("aug");
        //} catch (Exception e){
        // System.out.println(e.getMessage());
           System.out.println("Something went wrong.");

    //}finally{
    //    System.out.println("surpassed try catch");
    //}
        months.printQueue();

        Queue movies = new Queue();
        //testing uderflow
        movies.dequeue();
        movies.enqueue("baahubali");
        movies.enqueue("baahubali2");
        movies.enqueue("baahubali3");

        //peek months
        System.out.println(months.peek());

        //peek mocies
        System.out.println(movies.peek());
        
    }
}
