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
    public void remove(){
        if(this.heap.isEmpty()){
            System.out.println("The Heap is Empty");
            return;
        }
        this.swap(1,this.size);
        this.heap.remove(this.size);
        this.size--;
    }
    private void heapify(){
        int current = 1;
        while(this.exists(this.getLeft(current))&&this.canSwap(current)){
            if(this.exists(this.getLeft(current))&&this.exists(this.getRight(current))){
                if(this.heap.get(this.getLeft(current))<this.heap.get(this.getRight(current)))){
                    this.swap(this.getLeft(current),current);
                    current = this.getLeft(current);
                }
                else {
                    this.swap(this.getRight(current),current);
                    current = this.getRight(current);
                }
            }else{
                this.swap(this.getLeft(current),current);
                current = this.getLeft(current);
            }

        }
    }
    private boolean canSwap(int current){
        if(this.heap.get(this.getLeft(current))<this.heap.get(this.heap.get(current))||this.heap.get(this.getRight(current))<this.heap.get(current)))
        return true;

        else return false;
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