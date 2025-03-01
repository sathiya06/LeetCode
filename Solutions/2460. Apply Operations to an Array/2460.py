class Solution:
    def applyOperations(self, nums: List[int]) -> List[int]:
        for i in range(len(nums)-1):
            if nums[i] == nums[i+1]:
                nums[i] *= 2
                nums[i+1] = 0
        ans = [0] * len(nums)
        i = 0
        for num in nums:
            if num != 0:
                ans[i] = num
                i += 1
        return ans
            