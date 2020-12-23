package heap;
import java.util.ArrayList;
public class MinHeap {
    private ArrayList<Integer> heap;
    private int size;

    public MinHeap(){
        this.heap = new ArrayList<Integer>();
        this.heap.add(null);
        this.size=0;
    }
    private int getParent(int n){
        return (n/2);
    }
    private int getLeft(int n){
        return (2*n);
    }
    private int getRight(int n){
        return (2*n+1);
    }
    public void add(int data){
        this.heap.add(data);
        this.size++;
        this.bubbleup();
        
    }
    private void bubbleup(){
        int current = this.size;
        while((current>1)&&(this.heap.get(this.getParent(current))>this.heap.get(current))){
            this.swap(this.getParent(current),(current));
        }   
    }
    public int remove(){
        if(this.size == 0){
            System.out.println("The Heap is Empty");
            throw new Error("Heap is empty!");
        }
        this.swap(1,this.size);
        int min = this.heap.remove(this.size);
        this.size--;
        this.heapify();
        return min;
        
    }
    private void heapify(){
        int current = 1;
        int leftChild = this.getLeft(current);
        int rightChild = this.getRight(current);
        while(this.canSwap(current,leftChild,rightChild)){
            if(this.exists(leftChild)&&this.exists(rightChild)){
                if(this.heap.get(leftChild)<this.heap.get(rightChild)){
                    this.swap(leftChild,current);
                    current = this.getLeft(current);
                }
                else {
                    this.swap(rightChild,current);
                    current = rightChild;
                }
            }else{
                this.swap(leftChild,current);
                current = leftChild;
            }
            rightChild = this.getRight(current);
            leftChild = this.getLeft(current);
        }
    }
    private boolean canSwap(int current, int leftChild, int rightChild) {
        return (this.exists(leftChild) && (this.heap.get(current) > this.heap.get(leftChild)))
                || (this.exists(rightChild) && (this.heap.get(current) > this.heap.get(rightChild)));
    }

    private boolean exists(int n){
        return n<=this.size;
    }
    private void swap(int a , int b){
        int temp = this.heap.get(a);
        this.heap.set(a,this.heap.get(b));
        this.heap.set(b,temp);
    }
    
}