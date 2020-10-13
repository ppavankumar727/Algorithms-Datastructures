public class SelectionSort {
    public static void main(String[] args) {
        int [] a=new int[] {55,75,23,54,86,-22,-1};

    for (int unsroted=a.length-1;unsroted>0;unsroted--)
    {
    int largest=0;
    for(int i=1;i<=unsroted;i++)
        if(a[i]>a[largest])
            largest=i;
       swap(a,largest,unsroted);
    }
       for(int i=0;i<a.length;i++)
           System.out.println(a[i]);
    }

    public static void swap(int[]  list,int i,int j){
        if (i==j)
     return;
             int temp=list[i];
             list[i] = list[j];
             list[j]=temp;
 
 
     }
    
}
