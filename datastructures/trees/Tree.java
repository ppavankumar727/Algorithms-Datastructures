import java.util.Queue;
import java.util.LinkedList;
public class Tree{
    private TreeNode root;

    public Tree(TreeNode root){
        this.root = root;
    }
    public void  print(){
        this.print(this.root,0);
    }
    public void print(TreeNode current,int level){
        String levelMarks = "";
        for(int i = 0 ; i<level;i ++){
            levelMarks+="-- ";
        }
        System.out.println(levelMarks+current.getData());
        for(TreeNode child : current.getChildren()){
            this.print(child,level+1);
        }
    }
    //depth first first reaches depth of each child then moves to the next child siblings depth 
    public void depthFirstSearch(TreeNode current){
        System.out.println(current+" ");
        for(TreeNode child : current.getChildren()){
            this.depthFirstSearch(child);
        }
    }
    //we use queushere first in first out
    //the data of the current will be printed 
    //then their childs will be added to the queue
    //so it goes according the breadth order 
    //childs will be printed after the parents siblings get printed 
    //childs wait in queue
    public void breadthFirstSearch(){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(this.root);
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            System.out.println(current.getData());
            queue.addAll(current.getChildren());
        }
    }

}