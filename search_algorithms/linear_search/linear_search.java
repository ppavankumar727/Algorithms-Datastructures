import java.lang.annotation.Target;

public class linear_search {
    public static void main(String[] args) {
        int list[] = new int[] {7,6,10,5,9,2,1,7};
        
        for( int i : list) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Element 5 at :"+linear_search(list, 5)+" position");

    
    }
    public static int linear_search(int []list,int target) {
        for(int i=0 ;i<list.length;i++){
            if(list[i]==target)
            return i;
        }
        return -1;
    }
    
}
