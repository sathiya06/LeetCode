class Solution(object):
    def maxSubarrayLength(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        ans = 0
        curMax = 0
        start = 0
        freMap = {}
        for i in range(0, len(nums)):
            if not nums[i] in freMap:
                freMap[nums[i]] = 1
            elif freMap[nums[i]] < k:
                freMap[nums[i]] += 1
            else:
                while nums[start] != nums[i]:
                    freMap[nums[start]] -= 1
                    start += 1
                start += 1
            curMax = i - start + 1
            ans = max(ans, curMax)
        return ans