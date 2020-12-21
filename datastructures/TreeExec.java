import trees.Tree;
import trees.TreeNode;
public class TreeExec {
    public static void main(String[] args) {
        TreeNode animals = new TreeNode("Animals");
        TreeNode reptile = new TreeNode("Reptiles");
        TreeNode mammals = new TreeNode("Mammals");
        animals.addChild(reptile);
        animals.addChild(mammals);
        reptile.addChild("Lizard");
        reptile.addChild("Snake");
        TreeNode equine = new TreeNode("Equine");
        TreeNode bovine = new TreeNode("Bovine");
        TreeNode marsupial = new TreeNode("Marsupial");
        mammals.addChild(equine);
        mammals.addChild(bovine);
        mammals.addChild(marsupial);
        equine.addChild("Horse");
        equine.addChild("Zebra");
        bovine.addChild("Husky");
        marsupial.addChild("Koala");
    
        Tree animalTree = new Tree(animals);
    
        // Add and remove accordingly
    
        bovine.removeChild("Husky");
        bovine.addChild("Cow");
        marsupial.addChild("Kangaroo");
    
        animalTree.print();
    
        System.out.println("Printing DFS Traversal:");
        // Depth-first traversal
        animalTree.depthFirstTraversal(animals);
    
        System.out.println("");
        System.out.println("Printing BFS Traversal:");
        // Breadth-first traversal
        animalTree.breadthFirstTraversal();
    
      }
}
