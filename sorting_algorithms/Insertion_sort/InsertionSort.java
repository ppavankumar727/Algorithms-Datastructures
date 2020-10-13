public class InsertionSort {

    public static void main(String args[]){

        int [] a=new int[] {55,75,23,54,86,-22,-1};

        for(int unsorted=1;unsorted<a.length;unsorted++){
            int newElement=a[unsorted];
            int i;
            for ( i=unsorted;i>0&&a[i-1]>newElement;i--)
                a[i]=a[i-1];
            a[i]=newElement;
        }
        for(int j=0;j<a.length;j++)
        {
            System.out.println(a[j]);
        }
        

    }
}