class Solution {
    public int findGCD(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        return gcd(max,min);
    }

    int gcd(int a, int b){

        if(b == 0)
            return a;
        
        return gcd(b,a%b);
    }
}