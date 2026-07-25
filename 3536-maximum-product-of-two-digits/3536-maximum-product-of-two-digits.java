class Solution {
    public int maxProduct(int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
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

        return max;
    }
}