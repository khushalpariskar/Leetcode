class Solution {
    public List<Character> getList(String s){   
        char[] charArray = s.toCharArray();
        List<Character> charList = new ArrayList<>();
        for (char c : charArray) {
            charList.add(c);
        }
        Collections.sort(charList);
        return charList;
    }
    public boolean isAnagram(String s, String t) {

        List<Character> l1 = getList(s);
        List<Character> l2 = getList(t);
        
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<l1.size();i++){
            if((i<l1.size() && i<l2.size()) && (l1.get(i)!=l2.get(i))){
                return false;
            }
        }
        return true;
    }
}