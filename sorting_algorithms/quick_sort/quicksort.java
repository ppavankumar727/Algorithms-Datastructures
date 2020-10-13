public class quicksort{
    public static void main(String []args) {
        int [] a =new int[] {7,6,10,5,9,2,1,15,7};
        quicksort(a,0,a.length-1);
        printarray(a);
        
    }
    public static void printarray(int [] a) {
        for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
        }
        
    }
    public static void quicksort (int []a, int lb,int ub){
        if (lb<ub){
            int loc =partision(a, lb, ub);
            quicksort(a, lb, loc-1);
            quicksort(a, loc+1,ub);
            
        }
    }
    public static void Swap (int []a, int i,int j ) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        
    }

    public static int partision(int [] a,int lb,int ub) {
        int pivot = a[lb];
        int start = lb;
        int end = ub;
        while(start<end){
        while((a[start]<=pivot) && (start <end)) {
            start++;
        }
        while(a[end]>pivot){
            end--;
        }
        if(start<end){
            Swap (a,start,end);
        
        }
    }
    Swap(a,end,lb);
    return end;
}
        
        

        
    }