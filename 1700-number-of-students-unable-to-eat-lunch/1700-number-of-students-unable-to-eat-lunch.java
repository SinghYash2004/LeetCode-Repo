class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        int n = students.length;

        for(int i = 0; i<n; i++){
            queue.add(students[i]);
        }

        int i = 0;
        int rejectionCounter = 0;
        while(rejectionCounter != queue.size()){
            int num = queue.poll();
            if(num == sandwiches[i]){
                rejectionCounter = 0;
                i++;
            }else{
                rejectionCounter++;
                queue.add(num);
            }
        }

        return queue.size();
    }
}