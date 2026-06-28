class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outlist = new ArrayList<List<Integer>>();
        int i = 0;
        while (i <= arr.length - 3) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                i++;
                continue;
            }
            int target = 0 - arr[i];
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                if (arr[j] + arr[k] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);
                    outlist.add(list);
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }

                    
                } else if (arr[j] + arr[k] > target) {
                    k--;
                } else {
                    j++;
                }
            }

            i++;
        }
        return outlist;
    }
}