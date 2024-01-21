class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        map = {}
        for i in arr:
            if i in map:
                map[i] += 1
            else:
                map[i] = 1
        s = set()
        for i,j in map.items():
            if j in s:
                return False
            s.add(j)
        return True
        