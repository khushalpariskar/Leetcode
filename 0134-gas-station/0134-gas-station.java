class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int tank=0,start=0,total=0;
        for(int i=0;i<n;i++){
            tank=tank+gas[i]-cost[i];
            if(tank<0){
                total+=tank;
                tank=0;
                start=i+1;
            }
        }
        return (((total+tank)<0)?-1:start);
    }
}