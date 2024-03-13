class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        hash = set(nums)
        for i in range(0, len(nums)+1):
            if i not in hash:
                return i
        return -1