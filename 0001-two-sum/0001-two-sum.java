class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         ArrayList<Integer> list = new ArrayList<Integer>();
//         for(int i:nums){
//             list.add(i);
//         }
//         Arrays.sort(nums);
//         int i = 0;
//         int j = nums.length-1;
//         int[] arr = new int[2];
//         while(i<j){
//             int sum = nums[i] + nums[j];
//             if(sum == target){
//                 int k = list.indexOf(nums[i]);
//                 int l = list.lastIndexOf(nums[j]);
//                 arr[0] = k;
//                 arr[1] = l;
//                 return arr;
//             }else if(sum<target){
//                 i++;
//             }else{
//                 j--;
//             }
//         }return arr;
//     }
// }