public class ThreeStack {
    private int [] stack;
    private int size1;
    private int size2;
    private int size3;
    int top1,top2,top3;

    public  ThreeStack (int size1,int size2,int size3) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
        this.stack = new int[size1+size2+size3];
    }
    

}
