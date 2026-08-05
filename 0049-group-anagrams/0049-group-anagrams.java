class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String str:strs){
            String s = order(str);
            if(!map.containsKey(s)){
                map.put(s, new ArrayList<String>());
            }
            map.get(s).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public String order(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}