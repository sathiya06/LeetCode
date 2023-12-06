class Solution {
    public String minRemoveToMakeValid(String st) {
        Stack<Integer> s = new Stack<>();
        char[] str = st.toCharArray();
        int n = str.length;
        for (int i=0;i<n;i++){
            if(str[i] == '('){
                s.push(i);
            }
            else if (str[i] == ')'){
                if(s.isEmpty()){
                    str[i]=' ';
                } else{
                    s.pop();
                }
            }
        }
        while(!s.isEmpty()){
            str[s.pop()] = ' ';
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++){
            if(str[i] != ' '){
                ans.append(str[i]);
            }
        }
        return new String(ans);
    }
}