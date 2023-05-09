class Solution {
    public void reverse(int[] nums, int start, int end){
        for(int i=start;i <=(start+end)/2;i++){
            int temp = nums[i];
            nums[i] = nums[end-i+start];
            nums[end-i+start] = temp;
        }        
    }

    public void rotate(int[] nums, int k) {
        if(nums.length==1 || nums.length==k){
            return;
        }
        if(k>nums.length){
            k=k%nums.length;
        }
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
        
    }
}