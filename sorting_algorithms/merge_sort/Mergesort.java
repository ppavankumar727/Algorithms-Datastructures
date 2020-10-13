public class Mergesort {
     public static void main(String[] args) {
         int []a=new int[] {15,5,24,8,1,3,16,10,20};
         mergeSort(a,0,(a.length-1));
         print(a);
    }
    public static void print(int a[]) {
        for(int i : a)
        System.out.println(i);
    }

    public static void mergeSort(int[]a,int lb,int ub) {
        if (lb<ub) 
        {            
            int mid = (ub+lb)/2;
            mergeSort(a, lb, mid);
            mergeSort(a,mid+1,ub);
            merge(a,lb,mid,ub);
    }
}
    public static void merge(int []a,int lb,int mid,int ub) {
        int i=lb;
        int j=mid+1;
        int k=lb;
        int [] b= new int[a.length];
        while ((i<=mid)&&(j<=ub)) {
            if (a[i]<a[j]) {
                b[k]=a[i];
                i++;
                k++;
            }
            else{
                b[k]=a[j];
                j++;
                k++;
            }
        }
        if(i<=mid)
            while (i<=mid) {
                b[k]=a[i];
                i++;
                k++;
            }
        else 
        while (j<=ub) {
            b[k]=a[j];
            k++;
            j++;
        }
        for(int l=lb;l<=ub;l++){
            a[l]=b[l];
        }
    }
}
