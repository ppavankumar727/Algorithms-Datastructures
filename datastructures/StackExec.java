import stack.Stack;
public class StackExec {
    public static void main(String[] args){
        Stack movies = new Stack();
        //unbounded queue
        movies.push("hello");
        movies.push("shawshank redemption");
        movies.push("heider");
        movies.pop();
        movies.pop();
        movies.pop();
        //underflow
        movies.pop();
        //bounded queue
        Stack months = new Stack(2);
        months.push("jav");
        months.push("feb");
        //overfloq
        months.push("mar");
    }
}
