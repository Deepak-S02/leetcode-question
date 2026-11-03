class Solution:
    def minMoves(self, nums: List[int]) -> int:
        nums.sort()
        a = len(nums)
        s = nums[a-1]
        ans = 0
        for i in range(len(nums)-1):
            while(nums[i] != nums[a-1]):
                nums[i] += 1 
                ans +=1
        return ans

        