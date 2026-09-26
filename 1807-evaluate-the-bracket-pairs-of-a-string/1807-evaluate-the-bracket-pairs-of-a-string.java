class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();
        for(List<String> list:knowledge){
            map.put(list.get(0), list.get(1));
        }

        StringBuilder sb = new StringBuilder();

        int i = 0;
        while(i<s.length()){
            while(i < s.length() && s.charAt(i) != '('){
                sb.append(s.charAt(i++));
            }
            if(i < s.length() && s.charAt(i)=='('){
                i++;
                StringBuilder str = new StringBuilder();
                while(s.charAt(i)!=')'){
                    str.append(s.charAt(i++));
                }
                String string = str.toString();
                if(map.containsKey(string)){
                    sb.append(map.get(string));
                }else{
                    sb.append('?');
                }
                i++;
            }
        }
        return sb.toString();
    }
}