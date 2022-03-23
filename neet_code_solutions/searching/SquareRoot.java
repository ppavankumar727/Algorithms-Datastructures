/*source = https://leetcode.com/problems/sqrtx/
69. Sqrt(x)
Easy

Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
*/
public class SquareRoot 
{
    public static void main(String[] args) {
        System.out.println(mySqrt(8
        ));
    }
    public static int mySqrt(int x) {
        int low=0; int high=x; int ans=-1;
        while(low<=high){
        int mid=(low+high)/2;
        long msq=(long)mid*(long)mid;
        if(msq==x){
        return mid;
        }
        else if(msq>x){
        high=mid-1;
        }
        else{
        low=mid+1;
        ans=mid;
        }
        }
        return ans;
    }
}

