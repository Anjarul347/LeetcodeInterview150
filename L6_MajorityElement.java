/*
 * iven an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 */
import java.util.*;
public class L6_MajorityElement {
    public static int majorityElement(int []nums){

        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
    public static void main(String[] args) {
       
        Scanner sc=new  Scanner(System.in);

        System.out.println("Enter the number of array:-");
        int n=sc.nextInt();
        int []nums=new int[n];
        System.out.printf("Enter %d array element:-",n);

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        int k=majorityElement(nums);

        System.out.printf("\n The majority element is %d",k);
    }
}
