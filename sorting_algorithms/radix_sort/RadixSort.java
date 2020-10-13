public class RadixSort {
    public static void main(String [] args){
        int [] a = new int[] {200,100,500,708,637,488};
        radixSort(a, a.length);
        printArray(a);

    }
    public static void radixSort(int [] a ,int n){
        int pos = highest(a);
        for (int i=1;(pos/i)!=0;i*=10){
            countingSort(a,i);
        }
    }
    public static void countingSort(int []a , int i){
        int k=-1;
        int [] b=new int[a.length];

        for (int j=0 ;j<a.length;j++){
            if(((a[j]/i)%10)>k)
            k=((a[j]/i)%10);
        }
        int [] count = new int [k+1];

        for (int j=0;j<a.length;j++){
            ++count[((a[j]/i)%10)];
        }
        for(int j=1;j<count.length;j++){
            count[j]=count[j]+count[j-1];
        }
        for(int j=a.length-1;j>=0;j--){
            b[--count[((a[j]/i)%10)]]=a[j];
        }
        for(int j=0;j<a.length;j++)
        a[j]=b[j];
    }
    public static int highest(int []a){
        int high=-1;
        for (int i : a){
            if (i > high)
            high =i;
        }
        return high;
    }
    public static void printArray(int []a){
        for (int i : a)
        System.out.println(i);
    }
}
