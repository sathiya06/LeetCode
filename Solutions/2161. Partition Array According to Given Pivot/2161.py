class Solution:
    def pivotArray(self, nums: List[int], pivot: int) -> List[int]:
        less = []
        great = []
        equal = 0
        for i in nums :
            if i < pivot:
                less.append(i)
            elif i == pivot:
                equal += 1
            else:
                great.append(i)
        for i in range(equal):
            less.append(pivot)
        for i in great:
            less.append(i)
        return less