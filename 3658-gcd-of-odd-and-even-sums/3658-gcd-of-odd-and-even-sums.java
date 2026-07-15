class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOfEven =0;
        int sumOfOdd = 0;
        int count=1;
        for(int i = 1;count<=n;i+=2){
            sumOfOdd += i;
            count++;
        }

        count = 1;
        for(int i=2;count<=n;i+=2){
            sumOfEven+= i;
            count++;
        }

        return helper(sumOfOdd,sumOfEven);
    }

    static int helper(int a, int b){
        if(b == 0){
            return a;
        }

        return helper(b,a%b);
    }
}