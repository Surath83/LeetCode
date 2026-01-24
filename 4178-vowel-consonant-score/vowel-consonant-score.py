class Solution:
    def vowelConsonantScore(self, s: str) -> int:
        v=0
        c=0
        for char in s:
            if char.lower() in ('a','e','i','o','u'):
                v+=1
            elif char.isalpha():
                c+=1
                
        if (c==0):
            return 0
        else:
            return v//c
        