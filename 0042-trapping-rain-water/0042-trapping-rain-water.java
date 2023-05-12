class Solution {
    public int trap(int[] height) {
        int maxLeft[] = new int[height.length];
        int maxRight[] = new int[height.length];
        maxLeft[0] = 0;
        int maxValue=0;
        for(int i=1;i<height.length;i++){
            maxLeft[i] = Integer.max(maxLeft[i-1],height[i-1]);
        }
        for(int i=height.length-2;i>=0;i--){
            maxRight[i] = Integer.max(maxRight[i+1] , height[i+1]);
        }
        int sum=0;
        for(int i=0;i<height.length;i++){
            int val = (Math.min(maxLeft[i],maxRight[i]) - height[i]);
            sum += val<0 ? 0: val;
            // System.out.println(maxLeft[i]);
        }
        return sum;
    }
}