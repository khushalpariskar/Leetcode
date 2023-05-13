class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        String arr[] = new String[numRows];
        Arrays.fill(arr,"");
        int level=0;
        boolean flag = true;
        for(int i=0;i<s.length();i++){
            arr[level] += s.charAt(i);
            if(flag){
                level++;
            } else{
                level--;
            }
            if(level==numRows-1 || level==0){
                flag = !flag;
            }
        }
        String result="";
        for(String str: arr){
            result+=str;
        }
        return result;
    }
}