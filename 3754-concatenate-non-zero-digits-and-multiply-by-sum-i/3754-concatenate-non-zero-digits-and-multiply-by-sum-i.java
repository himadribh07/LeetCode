class Solution {
    public long sumAndMultiply(int n) {
        String newString = Integer.toString(n);

        long sum=0;
        String ans = "";
        for(char ch : newString.toCharArray()){
            if(ch!='0'){
                ans+=ch;
                sum+= (ch -'0');
            } 
        }
        if(ans.length()==0)
            return 0;
            
        long x = Long.parseLong(ans);
        return x*sum;
    }
}