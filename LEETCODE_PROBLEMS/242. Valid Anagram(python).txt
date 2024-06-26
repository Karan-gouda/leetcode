class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)==len(t):
            for a in s:

                if s.count(a)!=t.count(a):
                  return False
            return True
        else:
            return False
        