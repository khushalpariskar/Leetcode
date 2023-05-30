class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String,List<String>> hm = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char arr[]=strs[i].toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            List<String> value = new ArrayList<>();
            if(hm.containsKey(s)){
                value = hm.get(s);
            }
            value.add(strs[i]);
            hm.put(s,value);
        }
        return List.copyOf(hm.values());
    }
}