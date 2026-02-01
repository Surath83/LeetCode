class Solution:
    def isPalindrome(self, s: str) -> bool:
        if(s==None):
            return True
        s=re.sub(r'[^a-zA-Z0-9]', '', s).lower()
        i=0
        j=len(s)-1
        while(i<=j):
            if (s[i]==s[j]):
                i+=1
                j-=1
                continue
            return False
        return True
