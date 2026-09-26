class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num:answers){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int total = 0;
        for(Map.Entry<Integer, Integer> data : map.entrySet()){
            double count = Math.ceil((double) data.getValue() / (data.getKey()+1));
            total += count*(data.getKey()+1);
        }
        return total;
    }
}