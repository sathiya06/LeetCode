class Solution {
    public int kthGrammar(int n, int k) {
        boolean isinverted = false;
        n = (int) Math.pow(2, n-1);
        while(n != 1){
            n /= 2;
            if (k > n){
                k -= n;
                isinverted = !isinverted;
            }
        }
        return isinverted ? 1 : 0;
    }
}