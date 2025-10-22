public class solution2 {
    
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
class Test {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        
        solution2 sol = new solution2();
        int[] result = sol.runningSum(nums);

        if (result != null) {
            for (int num : result) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("No result found");
        }
    }
}
