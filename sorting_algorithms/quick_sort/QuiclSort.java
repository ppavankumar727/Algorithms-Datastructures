public class QuiclSort {
    public static void main(String []args){
        int [] a=new int[]{7,6,10,5,9,2,1,15,7};
        quickSort(a,0,a.length-1);
        printArray(a);

    }
    public static void printArray(int []a){
        for(int i : a)
        System.out.println(i);
    }

    public static void quickSort(int [] a, int lb, int ub){
        if(lb<ub){
            int loc=partition(a,lb,ub);
            quickSort(a, lb, loc-1);
            quickSort(a, loc+1, ub);
        }
    }

    public static int partition(int []a,int lb,int  ub){
        int start=lb;
        int end=ub;
        int pivot = a[lb];
        
        while(start < end){
            while((a[start]<=pivot)&&(start<end))
            start++;
            while(a[end]>pivot)
            end--;
            if(start<end){
                swap(a,start,end);
            }
        }
        swap(a,end,lb);
        return end;
    }

    public static void swap(int []a,int i,int j) {
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;  
    }
    
}
