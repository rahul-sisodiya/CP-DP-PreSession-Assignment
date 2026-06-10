class BruteForce {
    public int[] twoSum(int[] nums, int target) {
        int [] ans = {-1,-1};
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if(target == nums[i]+nums[j] && i!=j){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}
