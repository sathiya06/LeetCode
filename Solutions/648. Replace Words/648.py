class Solution:
    def replaceWords(self, dictionary: List[str], sentence: str) -> str:
        sorted(dictionary, key=len)
        ans = sentence.split()
        for i in range(len(ans)):
            for root in dictionary:
                if ans[i].startswith(root):
                    ans [i] = root
        return ' '.join(ans)   