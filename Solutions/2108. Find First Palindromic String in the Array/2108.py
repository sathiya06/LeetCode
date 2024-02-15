class Solution:
    def firstPalindrome(self, words: List[str]) -> str:
        def checkPalindrome(word):
            start, end = 0, len(word) - 1
            while start < end:
                if word[start] != word[end]:
                    return False
                start += 1
                end -= 1
            return True
        for word in words:
            if checkPalindrome(word):
                return word
        return ""