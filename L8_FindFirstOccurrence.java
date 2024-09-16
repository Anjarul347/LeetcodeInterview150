/*
Leetcode Problem No- 28: 
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 

Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
 */
import java.util.Scanner;


public class L8_FindFirstOccurrence {

    public static int findFirstOccurrence(String haystack, String needle){
        int j;
        int haysLength=haystack.length();
        int needleLength=needle.length();
        for(int k=0;k<=haysLength-needleLength;k++){
            j=0;
            for(int i=k;i<haysLength;i++){
                if(haystack.charAt(i)==needle.charAt(j)){
                    j+=1;
                    if(j==needleLength){
                        return i-(j-1);
                    }
                }
                else{
                    break;
                }
                
            }
        }
        
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string as the value of haystack:-");
        String haystack=sc.nextLine();

        System.out.println("Enter a substring to find its Occurrence:-");

        String needle=sc.nextLine();

        int k=findFirstOccurrence(haystack,needle);

        System.out.println("The first occurrence is "+ k);
        // if(haystack.charAt(0)==needle.charAt(0)){
        //     System.out.println(haystack.charAt(2));
        // System.out.println(needle.charAt(1));
        // }
        


    }
}
