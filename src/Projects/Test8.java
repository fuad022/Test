package Projects;

public class Test8 {
    public static void main(String[] args) {
        int[] nums = {25, 45, 55, 60, 78, 88, 9, 41, 23, 63};

        int small = nums[0];
        int large = nums[0];
        //test2
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > large) {
                large = nums[i];
            } else if (nums[i] < small) {
                small = nums[i];
            }
        }
        System.out.println("Large num: " + large);
        System.out.println("Small num: " + small);
    }
}
