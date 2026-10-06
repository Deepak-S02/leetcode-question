class Solution:
    def getConcatenation(self, nums: list[int]) -> list[int]:
        
        n  = len(nums)
        c = [0]*(2*n)
        for i in range(n):
            c[i] = nums[i]
            c[i+n] = nums[i]
        return c
        