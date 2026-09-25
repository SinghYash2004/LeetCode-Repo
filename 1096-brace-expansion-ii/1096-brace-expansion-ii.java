class Solution {
    // Saare possible unique answers ko sorted order mein store karega
    TreeSet<String> ans = new TreeSet<>();

    void dfs(String s) {
        // Pehla closing brace '}' find karo
        int r = s.indexOf('}');

        // Agar koi closing brace nahi hai,
        // iska matlab expression completely expand ho chuka hai
        if (r == -1) {
            ans.add(s);
            return;
        }

        // Closing brace ke corresponding opening brace '{' ko find karo
        // Yaha lastIndexOf use kar rahe hain taaki nearest matching '{' mile
        int l = s.lastIndexOf('{', r);

        // Opening brace se pehle ka part
        String left = s.substring(0, l);

        // Closing brace ke baad ka part
        String right = s.substring(r + 1);

        // { } ke andar jo content hai usko extract karo
        // Example: "{a,b,c}" -> "a,b,c"
        String inside = s.substring(l + 1, r);

        // Braces ke andar multiple options comma se separated hain
        // Har option ko ek-ek karke choose karke DFS karo
        for (String part : inside.split(",")) {
            // Current brace ko selected option se replace karo
            // Aur naye expression par recursively DFS chalao
            dfs(left + part + right);
        }
    }

    public List<String> braceExpansionII(String expression) {
        // Original expression se DFS start karo
        dfs(expression);

        // TreeSet ko ArrayList mein convert karke return karo
        return new ArrayList<>(ans);
    }
}