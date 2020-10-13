package CountingSort;

public class CountingSort {
    public static void main(String []args){
        int a[] = new int[] {7,6,10,5,9,2,1,7};
        countingSort(a, 1, 10);
        printArray(a);


    }
    public static void countingSort(int []a, int min ,int max){
        int[] countinArray = new int [(max-min)+1];
        for ( int i =0;i<a.length;i++){
            countinArray[(a[i]-min)]++;
        }
        int j=0;
        for(int k=min ; k <=max;k++ ){
            while(countinArray[k-min]>0){
                a[j++]=k;
                countinArray[k-min]--;
            }

        }
    }
 public static void printArray(int []a){
     for (int i : a)
     System.out.println(i);
 }
}
