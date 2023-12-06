class Solution(object):
    def minRemoveToMakeValid(self, s):
        """
        :type s: str
        :rtype: str
        """
        stack = []
        ans = list(s)
        for i in range(len(ans)):
            if s[i] == '(':
                stack.append(i)
            elif s[i] == ')':
                if len(stack) == 0:
                    ans[i] = ""
                else:
                    stack.pop()
        
        for i in stack:
            ans[i] = ""

        return ''.join(ans)

      