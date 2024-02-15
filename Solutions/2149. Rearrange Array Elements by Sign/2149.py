class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:

        pos_index = -1
        neg_index = -1

        def findNextPos(index):
            for i in range(index, len(nums)):
                if nums[i] > 0:
                    return i
            return -1

        def findNextNeg(index):
            for i in range(index, len(nums)):
                if nums[i] < 0:
                    return i
            return -1

        pos_index, neg_index = findNextPos(0), findNextNeg(0)

        ans = []

        while pos_index != -1 and neg_index != -1:
            ans.append(nums[pos_index])
            pos_index = findNextPos( pos_index + 1 )
            ans.append(nums[neg_index])
            neg_index = findNextNeg( neg_index + 1 )

        return ans

