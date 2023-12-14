class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        cur = 0
        ans = 0
        vowels = {'a', 'e', 'i', 'o', 'u'}
        for i, c in enumerate(s):
            if c in vowels:
                cur += 1
            if i>=k and s[i-k] in vowels:
                cur -= 1
            ans = max(cur, ans)
        return ans 