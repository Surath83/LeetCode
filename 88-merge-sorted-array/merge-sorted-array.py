class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        # """
        # Do not return anything, modify nums1 in-place instead.
        # """
        arr = nums1[:m]+nums2[:n]
        arr.sort()
        nums1[:] = arr      