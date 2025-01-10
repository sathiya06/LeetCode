class Solution:
    def wordSubsets(self, words1: List[str], words2: List[str]) -> List[str]:
        fre = {}
        for word in words2:
            cur_fre = Counter(word)
            for k, v in cur_fre.items():
                if k in fre:
                    fre[k] = max(fre[k], v)
                else:
                    fre[k] = v
        ans = []
        for word in words1:
            cur_fre = Counter(word)
            is_universal = True
            for k, v in fre.items():
                if v > cur_fre[k]:
                    is_universal = False
            if is_universal:
                ans.append(word)
        return ans


        