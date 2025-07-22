public class MySolution_2 {
    public int[] runningSum(int[] nums){
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            if (i == 0){
                result[i] = nums[i];
            } else {
                result[i] = (result[i - 1] + nums[1]);
            }
        }        
        return result;
    }
}
