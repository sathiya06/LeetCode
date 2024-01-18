class Solution:
    def isValid(self, s: str) -> bool:
        st = []
        for c in s:
            if c == '(':
                st.append(')')
            elif c == '{':
                st.append('}')
            elif c == '[':
                st.append(']')
            elif len(st) == 0 or st.pop() != c:
                return False
        return len(st) == 0