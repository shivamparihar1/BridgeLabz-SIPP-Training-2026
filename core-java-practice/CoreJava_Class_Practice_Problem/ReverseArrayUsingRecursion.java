package corejava.class_practice_problem;

public class ReverseArrayUsingRecursion {

    public static void reverse(int nums[], int start, int end){
        if(start >= end) return;
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
//        for(int x : nums) System.out.print(x+" ");
        reverse(nums, start+1, end-1);
//        for(int x : nums) System.out.print(x+" ");

    }

    public static void main(String[] args) {
        int[] nums = new int[]{10, 20, 30, 40, 50};
        reverse(nums,0, 4);
//        System.out.println(nums);
        for(int x : nums) System.out.print(x+ " ");

    }
}
