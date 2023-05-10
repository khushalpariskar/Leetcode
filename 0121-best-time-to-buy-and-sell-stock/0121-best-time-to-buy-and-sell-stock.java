class Solution {
    public int maxProfit(int[] prices) {
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        int max[] = new int[prices.length];
        int min[] = new int[prices.length];
        for(int i=0;i<prices.length;i++){
            maxInt = Integer.min(maxInt, prices[i]);
            max[i] = maxInt;
            minInt = Integer.max(minInt, prices[prices.length-i-1]);
            min[prices.length-i-1] = minInt;
        }
        int result = 0;
        for(int i=0;i<max.length;i++){
            result = Integer.max(Math.abs(max[i]-min[i]), result);
        }
        return result;
    }
}