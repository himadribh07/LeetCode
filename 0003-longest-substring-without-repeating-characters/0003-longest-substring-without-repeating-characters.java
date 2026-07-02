class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i=0,j=0,maxi=0;
        while(j<s.length()){
            if(!set.contains(s.charAt(j)))
                maxi = Math.max(maxi,j-i+1);
            else{

                while(set.contains(s.charAt(j))){
                    set.remove(s.charAt(i));
                    i++;
                }
            }
            set.add(s.charAt(j));
            j++;
        }
        return maxi;
    }
}