class Solution:
    def maximumTripletValue(self, nums: List[int]) -> int:
        max_suffix = [0] * (len(nums) + 1)
        for i in range(len(nums)-1, 1, -1):
            max_suffix[i] = max(max_suffix[i+1], nums[i])
        i = nums[0]
        ans = 0
        for l in range(1, len(nums)-1):
            i = max(i, nums[l-1])
            k = max_suffix[l+1]
            j = nums[l]
            ans = max(ans, (i-j)*k)
        return ans