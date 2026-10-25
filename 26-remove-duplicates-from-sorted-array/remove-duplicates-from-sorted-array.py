class Solution:
    def removeDuplicates(self, nums: list[int]) -> int:
        count = 0
        prev = float('-inf')
        for i in nums:
            if(i != prev):
                nums[count] = i
                count +=1
            prev = i
        
        return count
        