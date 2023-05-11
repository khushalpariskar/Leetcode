class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[]= new int[nums.length];
        res[0]=1;
        int n=nums.length;
        for(int i=1;i<nums.length;i++){
            res[i]=res[i-1]*nums[i-1];
        }
        int right=1;
        for(int i=n-1;i>=0;i--){
            res[i] *=right;
            right *=nums[i];
        }
        return res;
    }
}