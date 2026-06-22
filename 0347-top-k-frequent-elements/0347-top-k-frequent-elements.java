class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                int value = map.get(i);
                map.put(i, value+1);
            }else{
                map.put(i, 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(
    (a, b) -> Integer.compare(
        b.getValue(),
        a.getValue()
    )
);
        int[] arr = new int[k];
        int i = 0;
        while(i<k){
            arr[i] = list.get(i).getKey();
            i++;
        }
        return arr;


    }
}