class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int sum =1;
        int max =0;
        if(nums.length==1){
            return 1;
        }
        for(int i=1;i<nums.length;i++){
            if((nums[i-1]+1 == nums[i])){
                sum++;
            } else if(nums[i-1]!=nums[i]){
                sum=1;
            }
            max=Integer.max(max,sum);
            //System.out.println(nums[i-1]+" "+nums[i]+" "+max+" "+sum);
        }
        return max;
    }
}