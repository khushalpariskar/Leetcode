class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        boolean dp[]= new boolean[n];
        for(int i=0;i<n;i++){
            dp[i]=false;
        }
        //int n= nums.length;
        dp[n-1]=true;
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<nums[i];j++){
                if((j+i)<=n){
                    // System.out.println(i+" "+j+" "+(i+j+1));
                    if(dp[(i+j+1)]==true){
                        dp[i]=true;
                        break;
                    }
                }
                else{
                    break;
                }
            }
        }

        return dp[0];
        
    }
}