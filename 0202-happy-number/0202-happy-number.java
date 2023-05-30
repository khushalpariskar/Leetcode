class Solution {
    public boolean isHappy(int n) {
        LinkedHashSet<Integer> loop = new LinkedHashSet<>();
        while(!loop.contains(n)){
            loop.add(n);
            int newNum =0;
            while(n!=0){
                int dig = n%10;
                newNum+=dig*dig;
                n=n/10;
            }
            if(newNum==1){
                return true;
            }
            n=newNum;
            
        }
        return false;
    }
}