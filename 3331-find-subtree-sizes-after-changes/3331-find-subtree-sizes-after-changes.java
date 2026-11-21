class Solution {
    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;

        List<Integer>[] children = new ArrayList[n];

        for(int i = 0; i < n; i++){
            children[i] = new ArrayList<>();
        }

        for(int i = 1; i < n; i++){
            children[parent[i]].add(i);
        }

        int[] newParent = parent.clone();
        int[] last = new int[26];
        int[] prev = new int[n];

        Arrays.fill(last, -1);

        int[] stack = new int[2 * n];
        int top = 0;
        stack[top++] = 0;

        while(top > 0){
            int node = stack[--top];

            if(node < 0){
                node = ~node;
                last[s.charAt(node) - 'a'] = prev[node];
                continue;
            }

            int ch = s.charAt(node) - 'a';

            prev[node] = last[ch];

            if(last[ch] != -1){
                newParent[node] = last[ch];
            }

            last[ch] = node;

            stack[top++] = ~node;

            for(int child : children[node]){
                stack[top++] = child;
            }
        }

        List<Integer>[] modified = new ArrayList[n];

        for(int i = 0; i < n; i++){
            modified[i] = new ArrayList<>();
        }

        for(int i = 1; i < n; i++){
            modified[newParent[i]].add(i);
        }

        int[] order = new int[n];
        int idx = 0;
        top = 0;
        stack[top++] = 0;

        while(top > 0){
            int node = stack[--top];
            order[idx++] = node;

            for(int child : modified[node]){
                stack[top++] = child;
            }
        }

        int[] ans = new int[n];
        Arrays.fill(ans, 1);

        for(int i = n - 1; i > 0; i--){
            int node = order[i];
            ans[newParent[node]] += ans[node];
        }

        return ans;
    }
}