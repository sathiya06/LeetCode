class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        max1 = 0
        max2 = 0
        for i in nums:
            if max1 < i:
                max2 = max1
                max1 = i
            elif max2 < i:
                max2 = i
        return (max1 - 1) * (max2 - 1)