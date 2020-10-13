public class StableCount {
    public static void main(String [] args){
        int [] a= new int[]{2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9};
        countingSort(a);
        printArray(a);

    }
    public static void countingSort(int []a){
        int n = a.length;
        int k=-1;
        for(int i=0 ;i<n;i++){
            if(a[i]>k)
            k=a[i];
        }
        int [] b = new int[a.length];
        int [] count  = new int[k+1];

        for(int i=0 ;i<n;i++){
            ++count[a[i]];
        }
        for (int i=1;i<count.length;i++){
            count[i]=count[i]+count[i-1];
        }
        for (int i=n-1;i>=0;i--){
            b[--count[a[i]]]=a[i];
        }
        for(int i =0 ;i <n ;i++){
            a[i]=b[i];
        }
        
    }
    public static void printArray(int []a){
        for(int i : a)
        System.out.println(i);
    }

}