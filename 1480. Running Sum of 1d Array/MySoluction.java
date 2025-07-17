public class MySoluction {
    public int[] runningSum(int[] nums){
        int[] result = new int[nums.length];
        result[0] = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            for (int j = 0; j < i; j++){
                result[i] += nums[j];
            }
        }
        return result;
    }
}