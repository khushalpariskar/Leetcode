class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int val=-1;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)+"").equals(" ")){
                val = i;
            }
        }
        return s.substring(val+1,s.length()).length();
    }
}