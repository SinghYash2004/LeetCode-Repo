class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        int row = 0;
        while(row<numRows){
            if(row == 0){
                list.add(List.of(1));
                row++;
            }else if(row == 1){
                list.add(List.of(1, 1));
                row++;
            }else{
                List<Integer> inlist = new ArrayList<>();
                int len = 0;
                while(len<=row){
                    if(len == 0){
                        inlist.add(1);
                        len++;
                    }else if(len == row){
                        inlist.add(1);
                        len++;
                    }else{
                        inlist.add(list.get(row-1).get(len-1) + list.get(row-1).get(len));
                        len++;
                    }
                }
                list.add(inlist);
                row++;
            }
        }
        return list;
    }
}