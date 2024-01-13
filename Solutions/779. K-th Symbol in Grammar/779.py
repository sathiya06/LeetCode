class Solution:
    def kthGrammar(self, n: int, k: int) -> int:
        isinverted = False
        n = 2**(n-1)
        while n != 1:
            n /= 2
            if k>n :
                k -= n
                isinverted = not isinverted
        return 1 if isinverted else 0