import java.util.Arrays;

public class binary_search {
    public static void main(String[] args) {
        int list[] = new int[] {7,6,10,5,9,2,1,7};
        // to ensure that array is sorted
        Arrays.sort(list);
        for( int i : list) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Element 5 at :"+binarySearch(list, 5)+" position"+" Iterative approach used");
        System.out.println("Element 7 at :"+binarySearch(list, 7,0,list.length)+" position"+" revursive approach used");
        
    }
    // this function will search for the elemt or it should return -1 
    public static int binarySearch(int list[],int target){
        int left = 0;
        int right = list.length;
        while(left<right){
           int mid = (left + right)/2;
            if(list[mid]==target){
                return mid;
            }
            else if(list[mid]>target) {
                right = mid;
            }
            else {
                left = mid;
            }
        }
        return -1;
    }
    // this is a n iterative approach of the binary search 
    // this method takes following inputs list
    // 1)target varable
    // 2)left most variable in list
    // 3)right most variable in list
    // 4)length of the variable
    //because value changes due to recursive calls
    public static int binarySearch(int list[],int target,int left,int right){
         if(left>right)
              return -1;
            int mid = (left+right)/2;
            if(list[mid]==target){
                return mid;
            }
            else if (list[mid]>target){
                //replace the right varibale with mid 
               return binarySearch(list, target,left,mid);
            }
            else {
                // replace the left variable with mid
               return binarySearch(list, target,mid,right);
            }
    }    
}
