
import java.util.Scanner;

/*
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 

Constraints:

nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[j] <= 109
 */

public class L4_MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
       
            
            int i = m - 1; 
            int j = n - 1; 
            int k = m + n - 1; 
            
            while (i >= 0 && j >= 0) {
                if (nums1[i] > nums2[j]) {
                    nums1[k] = nums1[i];
                    i--;
                } else {
                    nums1[k] = nums2[j];
                    j--;
                }
                k--;
            }
            
            //If there are remaining elements in nums2, copy them
            while (j >= 0) {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of first array element:-");
        int m=sc.nextInt();
        System.out.println("Enter the number of second element:-");
        int n=sc.nextInt();

        int []nums1=new int[m+n];
        int []nums2=new int[n];

        System.out.println("Enter 1st array elements:-");
        for(int i=0;i<m;i++){
            nums1[i]=sc.nextInt();
        }
        System.out.println("Enter 2nd array elements:-");
        for(int i=0;i<n;i++){
            nums2[i]=sc.nextInt();
        }

        merge(nums1, m, nums2, n);

        System.out.println("After merge the array is:-");

        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }
      

    }
}
