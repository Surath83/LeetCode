class Solution:
    def minimumPrefixLength(self, nums: List[int]) -> int:
        l = len(nums)
        violation=0
        for i in range(l-2,-1,-1):
            if(nums[i]<nums[i+1]):
                continue
            elif(nums[i]>=nums[i+1]):
                violation=i+1
                break            
        return violation