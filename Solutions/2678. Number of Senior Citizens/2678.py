class Solution:
    def countSeniors(self, details: List[str]) -> int:
        ans = 0
        for each in details:
            age = int(each[11:13])
            if age > 60:
                ans += 1
        return ans
