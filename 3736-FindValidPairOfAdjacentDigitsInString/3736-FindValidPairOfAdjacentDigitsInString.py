# Last updated: 12/09/2025, 19:18:16
class Solution(object):
    def findValidPair(self, s):
        """
        :type s: str
        :rtype: str
        """
        count = Counter(s)
        for i in range(len(s) - 1):
            if s[i] != s[i+1]:
                if count[s[i]] == int(s[i]) and count[s[i+1]] == int(s[i+1]):
                    return s[i:i+2]
        return ""
sol = Solution()
print(sol.findValidPair("2523533"))  # Output: "23"
print(sol.findValidPair("221"))      # Output: "21"
print(sol.findValidPair("22"))
        