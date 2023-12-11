class Solution:
    def findSpecialInteger(self, arr: List[int]) -> int:
        maxFre = 0
        maxVal = 0
        curVal = None
        curFre = 0
        for i in arr:
            if curVal is None:
                curVal = i
                curFre += 1
            elif curVal == i:
                curFre += 1
            else:
                curVal = i
                curFre = 1
            if curFre > maxFre:
                maxFre = curFre
                maxVal = curVal

        return maxVal