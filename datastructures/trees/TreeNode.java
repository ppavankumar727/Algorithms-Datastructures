import java.util.ArrayList;
public class TreeNode {
    private Object data;
    private ArrayList<TreeNode> children ;

    public TreeNode(Object data){
        this.data = data;
        this.children=new ArrayList<TreeNode>();
    }
    public Object getData(){
        return this.data;
    }
    public ArrayList<TreeNode> getChildren(){
        return this.children;
    }
    //Adding a child is simple we just add to the ArrayList
    public void addChild(TreeNode child){
        this.children.add(child);
    }
    public void addChild(Object data){
        TreeNode child = new TreeNode(data);
        this.addChild(child);
    }
    //removing child gets little 
    //we check wether the children list is empty or not if empty we return 
    public void removeChild(TreeNode childToRemove){
        if(this.children.isEmpty())
            return;
        //we check wether the child exist in the children list of current child array
        // if exist we remove it 
        if(this.children.contains(childToRemove)){
            this.children.remove(childToRemove);
        }
        //if the child doesent exit in the current children array 
        //it can exist in the childs children so we perform this task
        //its recursion we iterate through every node and call remove child method 
        //with paramater passed
        else{
            for(TreeNode child : this.children){
                child.removeChild(childToRemove);
            }
        }

    }
    //if data is passed instead of node itself
    //we call this function 
    public void removeChild(Object data){
        //if data doesent exist here we return
        if(this.children.isEmpty())
        return;
        //we iterate through the array to check weather the data matches children 
        //if it matches we remove it
        for(TreeNode child : this.children){
            if(child.data == data){
                this.children.remove(child);
                return;
            }
        }
        //if child doesent exist here it may exist in the children of childrens
        // so we recursively call remove child method in each child to check if the data exists in children nodes
        for(TreeNode child : this.children){
            this.removeChild(data);
        }

    }




}