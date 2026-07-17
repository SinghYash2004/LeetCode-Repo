class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outlist = new ArrayList<List<Integer>>();
        int i = 0;
        while(i<=arr.length-3){
            if(i>0 && arr[i]==arr[i-1]){
                i++;
                continue;
            }
            int j = i+1;
            int k = arr.length-1;
            int target = 0-arr[i];
            while(j<k){
                if(arr[j] + arr[k] == target){
                    outlist.add(List.of(arr[i], arr[j], arr[k]));
                    j++;
                    k--;

                    while(j<k && arr[j]== arr[j-1]){
                        j++;
                    }
                    while(j<k && arr[k] == arr[k+1]){
                        k--;
                    }
                }else{
                    if(arr[j] + arr[k] > target){
                        k--;
                    }else{
                        j++;
                    }
                }
            }
            i++;
        }
        return outlist;
    }
}