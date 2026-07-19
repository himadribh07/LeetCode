class Solution {
    public String smallestSubsequence(String s) {
       int arr[] = new int[26];
       Stack<Integer> st = new Stack<>();
       HashSet<Character> set = new HashSet<>();


       for(int i=0;i<s.length();i++){ //last index to store in stack
        char ch = s.charAt(i);
        arr[ch - 'a'] = i;
       }

       for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(set.contains(ch))
                continue;
            
            while(!st.isEmpty()){
                char prev = s.charAt(st.peek());
                if(prev > ch && arr[prev-'a']>i){
                    st.pop();
                    set.remove(prev);
                }
                else
                    break;
            }
            st.push(i);
            set.add(ch);
       }

       StringBuilder sb = new StringBuilder();
       
       while(!st.isEmpty()){
            sb.append(s.charAt(st.pop()));
       }

       return sb.reverse().toString();



    }
}