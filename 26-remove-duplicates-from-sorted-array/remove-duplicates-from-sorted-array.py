class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        dub=["_"]*len(nums)
        dub[0]=nums[0]
        k=int(0)
        i=int(1)
        while(i<len(nums)):
            if(nums[i]==dub[k]):
                i+=1
                continue
            else:
                dub[k+1]=int(nums[i])
                i+=1
                k+=1
        for j in range(len(dub)):
            if(dub[j]=="_"):
                del nums[j:len(nums)]
                break
            else:
                nums[j]=dub[j]

        return len(nums)        