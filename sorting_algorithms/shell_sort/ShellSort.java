public class ShellSort {
    public static void main(String[] args) {
        int [] a=new int[] {55,75,23,54,86,-22,-1};
        for (int gap =a.length/2;gap>0;gap/=2) {
            for (int i=gap;i<a.length;i++) {
                int newElement=a[i];
                int j=i;
                while(j>=gap&&a[j-gap]>newElement){
                    a[j]=a[j-gap];
                    j-=gap;
                }
                a[j]=newElement;
            }
        }
        for (int k=0;k<a.length;k++)
            System.out.println(a[k]);
        
    }
    
}
