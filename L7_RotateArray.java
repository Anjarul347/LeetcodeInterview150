import java.util.Scanner;
public class L7_RotateArray {
    public static void rotate(int[] nums, int k) {
       int n = nums.length;
       k = k % n;
       int[] rotated = new int[n];

       for (int i = 0; i < n; i++) {
           rotated[(i + k) % n] = nums[i];
       }

       for(int i = 0; i < n; i++) {
           nums[i] = rotated[i];
       }  
       
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
        System.out.println("Enter how many times you want to rotate the array:-");
        int k=sc.nextInt();
        rotate(nums, k);

        System.out.println("The array after rotation:-");
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
        
        
    }
    
}
