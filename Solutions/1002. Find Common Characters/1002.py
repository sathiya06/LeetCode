class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        def getFre(word):
            hm = {}
            for c in word:
                hm[c] = hm.get(c, 0) + 1
            return hm
        ansFre = getFre(words[0])
        for i in range(1, len(words)):
            curFre = getFre(words[i])
            for key, value in ansFre.items():
                if key in curFre:
                    ansFre[key] = min(ansFre[key], curFre[key])
                else:
                    ansFre[key] = 0
        ans = []
        for key, value in ansFre.items():
            for i in range(value):
                ans.append(key)
        return ans