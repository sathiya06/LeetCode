class Solution:
    def findSpecialInteger(self, arr: List[int]) -> int:
        if len(arr) < 2:
            return arr[0]
        ans = 0
        percent = int(len(arr) * 0.25)
        count_dict = {}

        for i in arr:
            count_dict[i] = count_dict.get(i, 0) + 1

        for key, count in count_dict.items():
            if count > percent:
                ans = key

        return ans