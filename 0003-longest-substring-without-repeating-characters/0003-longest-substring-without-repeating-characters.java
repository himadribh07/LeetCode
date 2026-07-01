class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int count =0;
            Set<Character> set = new HashSet<>();
            int j=i;

            while(j<s.length() && !set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                count ++;
                ans = Math.max(ans,count);
                j++;
            }
        }

        return ans;
    }
}
