
    


public class solution1 {   // Filename must be Solution.java
    public int[] thoSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for(int k = 0; k < nums.length; k++) {
                 if (i!=j &&j!=k&&k!=i&& (nums[i] + nums[j] +nums[k] == 0) ) 
                 return new int[]{i, j, k};
                }
            }
        }

        
        return null;
    }
    public static void main(String[] args) {
        int[] nums = {0, -1, 0, 1 ,2,-2};
        
        solution1 sol = new solution1();
        int[] result = sol.thoSum(nums);

        if (result != null) {
            System.out.println(result[0] + ", " + result[1] + ", " + result[2]);
        } else {
            System.out.println("No pair found");
        }
    }
}

