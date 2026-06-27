class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase().replaceAll("[^A-Z0-9a-z]","");
        int i=0,j=s.length()-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }
}