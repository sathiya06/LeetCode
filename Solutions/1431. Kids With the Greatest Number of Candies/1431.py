class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        maxIndex = 0
        for i in range(1, len(candies)):
            if(candies[maxIndex] < candies[i]):
                maxIndex = i
        ans = []
        for i in range(len(candies)):
            if candies[i]+extraCandies >= candies[maxIndex]:
                ans.append(True)
            else:
                ans.append(False)
        return ans
        