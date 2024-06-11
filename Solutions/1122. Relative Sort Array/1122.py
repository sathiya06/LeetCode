class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        fre = [ 0 for _ in range(1001)]
        for i in arr1:
            fre[i] += 1
        k = 0
        for i in arr2:
            for j in range(fre[i]):
                arr1[k] = i
                k += 1
                fre[i] -= 1
        for i in range(1001):
            while fre[i] != 0:
                arr1[k] = i
                k += 1
                fre[i] -= 1
        return arr1 