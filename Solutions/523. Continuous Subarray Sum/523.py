class Solution:
    def checkSubarraySum(self, nums: List[int], k: int) -> bool:
        hm = { 0: -1}
        sum = 0
        for i in range(len(nums)):
            sum += nums[i]
            rem = sum % k
            if rem not in hm :
                hm[rem] = i
            elif i - hm[rem] > 1:
                return True
        return False