import javax.naming.directory.SearchResult;

public class FindFirstAndLast {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(searchRange(nums,8)[0]);
    }
/*
link = https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

34. Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.


*/
    public static int[] searchRange(int[] nums, int target) {
        int output[] = new int[2];
        output[0] =-1;
        output[1]=-1;
        int i,j;
        for( i = 0;i<nums.length;i++){
            if(nums[i]==target){
                output[0] =i;
                break;
            }
        }
        for( j = i;j<nums.length && nums[j]==target;j++){}
        
        if(output[0]!=-1)
        output[1]=j;
        return output;
    }
}
