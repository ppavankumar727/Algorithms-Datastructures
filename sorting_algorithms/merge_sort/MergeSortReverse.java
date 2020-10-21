public class MergeSortReverse {
    public static void main(String[] args) {
        int [] a =new int [] {33,59,11,23,0,4,170};
        mergeSort(a, 0, a.length-1);

        for (int i : a)
        System.out.println(i);
        
        

    }
    public static void mergeSort(int [] a,int lb, int ub) {
        if(lb < ub){
            int mid = (lb+ub)/2;
            mergeSort(a, lb, mid);
            mergeSort(a, mid+1, ub);
            merge(a,lb,mid,ub);

        }
    }
    public static void merge(int []a,int lb , int mid , int ub) {
        int i =lb;
        int j =mid+1;
        int [] b = new int[a.length];
        int k=0;
        while ((i<=mid)&&(j<=ub)){
            if (a[i]>a[j]){
                b[k]=a[i];
                i++;
                k++;
            }
            else {
                b[k]=a[j];
                k++;
                j++;
            }
        }
        if(i<=mid){
            while(i<=mid){
                b[k] = a[i];
                i++;
                k++;
            }
        }
        else {
            while(j<=ub){
                b[k]=a[j];
                j++;
                k++;
            }

        }
        k=0;

        for(int h=lb;h<=ub;h++){
            a[h]=b[k];
            k++;
        }

    }

    
}
