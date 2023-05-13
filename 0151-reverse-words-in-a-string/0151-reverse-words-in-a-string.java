class Solution {
    public String reverseWords(String s) {
        s=s.trim().replaceAll("\\s+", " ");
        // System.out.println(s.trim().replaceAll("\\s+", " "));
        StringBuilder str = new StringBuilder(s);
        StringBuilder rev = new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)+"").equals(" ")){
                rev = new StringBuilder(str.substring(j,i));

                rev=rev.reverse();
                System.out.println(rev);
                str.replace(j,i,rev.toString());
                j=i+1;
            }
        }
        rev = new StringBuilder(str.substring(j,s.length()));
        rev=rev.reverse();
        System.out.println(rev);
        str.replace(j,s.length(),rev.toString());
        
        return str.reverse().toString();
    }
}