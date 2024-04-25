import java.util.*;
class Main{
    public static int MaximumProduct(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        int max1 = nums[n-1] * nums[n-2] * nums[n-3];
        int max2 = nums[0]*nums[1]*nums[2];
        return Math.max(max1,max2);
    }
    public static void main(String[] args){
        int[] nums = {5,3,2};
        System.out.println("Maximum Product of an array: "+MaximumProduct(nums));
    }
}