public class MySolution {
    public int findLHS(int[] nums) {
        ArrayList<Integer> LHSList = new ArrayList<>();
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();

        // Check index occurred LHS
        for (int i = 0; i < nums.length; i++){
            Integer LHSOccurred = 0;
            for (int j = 0; j < nums.length; j++){
                if (nums[i] - nums[j] == 1 || nums[i] - nums[j] == -1){
                    LHSOccurred = 1;
                    break;
                }
            }
            LHSList.add(LHSOccurred);
        }

        for (int x = 0; x < nums.length; x++){
            if (LHSList.get(x) == 1){
                ArrayList<Integer> tempList = new ArrayList<>();
                Integer lockedValue = null;
                tempList.add(nums[x]);

                for (int y = 0; y < nums.length; y++){
                    if (lockedValue == null && !(x == y)){
                        if (nums[x] + 1 == nums[y]){
                            lockedValue = nums[y];
                            tempList.add(nums[y]);
                        } else if (nums[x] == nums[y]){
                            tempList.add(nums[y]);
                        }
                    } else if (lockedValue != null && !(x == y)){
                        if (nums[y] == lockedValue){
                            tempList.add(nums[y]);
                        } else if (nums[x] == nums[y]){
                            tempList.add(nums[y]);
                        }
                    }
                }
                results.add(tempList);
            }
        }

        Integer LHSLength = 0;
        for (ArrayList<Integer> result: results){
            if (result.size() > LHSLength){
                LHSLength = result.size();
            }
        }

        return LHSLength;
    }
}
