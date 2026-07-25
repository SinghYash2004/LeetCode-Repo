class Solution {
    public int maxProduct(int n) {
        int max = 0, secmax = 0;
        while(n>0){
            int digit = n%10;
            if(digit>max){
                secmax = max; 
                max = digit;
            }else if(digit>secmax){
                secmax = digit;
            }
            n/=10;
        }
        return max * secmax;
    }
}

/*PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        while(n>0){
            int digit = n%10;
            pq.add(digit);
            n=n/10;
        }

        int max = 1;
        int i = 0;
        while(!pq.isEmpty() && i<2){
            int num = pq.poll();
            max *= num;
            i++;
        }

        return max; */