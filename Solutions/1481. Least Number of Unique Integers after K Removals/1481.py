class Solution:
    def findLeastNumOfUniqueInts(self, arr: List[int], k: int) -> int:
        fre = Counter(arr)
        heap = list(fre.values())
        heapq.heapify(heap)
        ans = len(heap)
        while k > 0 and heap:
            f = heapq.heappop(heap)
            if k >= f:
                k -= f
                ans -= 1
        return ans
