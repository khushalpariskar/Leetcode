class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String res="";
        int i=0;
        if(strs[0].equals("")||strs[strs.length-1].equals("")){
            return res;
        }
        if(strs[0].equals(strs[strs.length-1])){
            return strs[0];
        }
        while((i<strs[0].length() && i<strs[strs.length-1].length())
              && (strs[0].charAt(i)==strs[strs.length-1].charAt(i))){
            res += strs[0].charAt(i);
            i++;
        }
        return res;
    }
}