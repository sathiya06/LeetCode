class Solution:
    def pivotInteger(self, n: int) -> int:
        sum = 0 
        for i in range(1, n+1):
            sum += i
        temp = 0
        for i in range(1, n+1):
            temp += i
            if (sum + i) - temp == temp:
                return i
        return -1
     