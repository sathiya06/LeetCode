class Solution:
    def largestPerimeter(self, nums: List[int]) -> int:
        nums.sort()
        total = 0
        ans = -1
        print(nums)
        for i in nums:
            if total > i:
                print(i)
                ans = total + i
            total += i
        return ans