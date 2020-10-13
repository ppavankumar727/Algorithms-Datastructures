public class version1 {
    public static void main(String []args){
        int [] a=new int[]{7,6,10,5,9,2,1,15,7};
        quickSort(a,0,a.length);
        printArray(a);

    }
    public static void printArray(int []a){
        for(int i : a)
        System.out.println(i);
    }

    public static void quickSort(int [] a, int start, int end){
        if((end-start)<2){
            return;
        }
            int loc=partition(a,start,end);
            quickSort(a, start, loc);
            quickSort(a, loc+1, end);
        
    }

    public static int partition(int []a,int start,int  end){
        int i=start;
        int j=end;
        int pivot = a[start];
        
        while(i < j){
            while((i<j)&&(a[--j]>=pivot));
            if(i<j){
                a[i]=a[j];
            }

            while((i<j)&&(a[++i]<=pivot));
            if(i<j){
                a[j]=a[i];
            }
        }
        a[j]=pivot;
        return j;
    }

    public static void swap(int []a,int i,int j) {
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;  
    }
    
}
