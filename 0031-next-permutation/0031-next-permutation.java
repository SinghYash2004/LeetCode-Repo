class Solution {
    public void nextPermutation(int[] arr) {
        int index1 = -1;
        int index2 = -1;

        for(int i = arr.length-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                index1 = i;
                break;
            }
        }

        if(index1 == -1){
            reverse(arr, 0);
            return;
        }
        else{
            for(int i = arr.length-1; i>=0; i--){
                if(arr[i]>arr[index1]){
                    index2=i;
                    break;
                }
            }

            swap(arr, index1, index2);
            reverse(arr, index1+1);
        }
    }

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void reverse(int[] arr, int start){
        int i = arr.length-1;
        int j = start;
        while(j<=i){
            swap(arr, j, i);
            j++;
            i--;
        }
    }
}