class Solution:
    def subarraysDivByK(self, nums: List[int], k: int) -> int:
        ans = 0
        hm = {0: 1}
        sum = 0
        for i in nums:
            sum += i
            rem = sum % k
            if rem in hm:
                ans += hm[rem]
            hm[rem] = hm.get(rem, 0) + 1
        return ans
        