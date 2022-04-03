    /*
        367. Valid Perfect Square
        link = https://leetcode.com/problems/valid-perfect-square/
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Follow up: Do not use any built-in library function such as sqrt.

Example 1:

Input: num = 16
Output: true
Example 2:

Input: num = 14
Output: false
    */
public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(14));
    }

    public static boolean isPerfectSquare(int num) {
        int low=0; int high=num;
        while(low<=high){
        int mid=(low+high)/2;
        long msq=(long)mid*(long)mid;
        if(msq==num){
        return true;
        }
        else if(msq>num){
        high=mid-1;
        }
        else{
        low=mid+1;
        }
        }
        return false;
    }
}
