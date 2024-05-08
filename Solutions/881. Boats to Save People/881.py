class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        people.sort()
        ans = 0
        start = 0
        end = len(people) - 1
        while start <= end:
            if people[start] + people[end] <= limit:
                start += 1
                end -= 1
                ans += 1
            else:
                if people[end] <= limit:
                    end -= 1
                    ans += 1
                elif people[start] <= limit:
                    start += 1
                    ans += 1
        return ans