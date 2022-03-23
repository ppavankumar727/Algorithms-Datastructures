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
        System.out.println(mySqrt(9));
    }
    public static int mySqrt(int x) {
       int i ;
        for ( i = 0;(i*i)<=x;i++){}
        return (i-1);
    }
}

