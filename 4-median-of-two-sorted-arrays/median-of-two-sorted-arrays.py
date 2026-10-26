class Solution:
    def findMedianSortedArrays(self, nums1: list[int], nums2: list[int]) -> float:
        ans = 0
        a = nums1+nums2
        a.sort()
        n = len(a)
        if(n%2 != 0):
            ans = a[n//2]
        else : 
            ans = (a[n//2]+a[n//2-1])/2
        return ans
        