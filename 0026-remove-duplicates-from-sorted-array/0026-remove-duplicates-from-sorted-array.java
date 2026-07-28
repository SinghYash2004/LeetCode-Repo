class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
            if(list.contains(nums[i])){
                i++;
            }else{
                list.add(nums[i]);
                i++;
            }
        }
        for(int j = 0; j<list.size();j++){
            nums[j] = list.get(j);
        }
        return list.size();
    }
}