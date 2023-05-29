class Solution {
    public boolean wordPattern(String pattern, String s) {
        List<String> al = Arrays.asList(s.split(" "));
        HashMap<Character,String> hm = new HashMap<>();
        HashSet<String> hs = new HashSet<>();
        if(pattern.length()!=al.size()){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            if(hm.containsKey(pattern.charAt(i))){
                System.out.println(hm.get(i)+" "+al.get(i));
                if(!hm.get(pattern.charAt(i)).equals(al.get(i))){
                    return false;
                }
            }
            else{
                hs.add(al.get(i));
               hm.put(pattern.charAt(i),al.get(i)); 
            }
        }
        return (hm.keySet().size()==hs.size());
    }
}