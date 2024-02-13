class Solution:
    def countCharacters(self, words: List[str], chars: str) -> int:
        fre1 = defaultdict(int)

        for c in chars:
            fre1[c] += 1
        
        ans = 0
        for word in words:
            fre2 = defaultdict(int)
            for c in word:
                fre2[c] += 1
            check = True
            for c,f in fre2.items():
                if  fre1[c] < f:
                    check = False
                    break
            if check:
                ans += len(word)
        return ans
