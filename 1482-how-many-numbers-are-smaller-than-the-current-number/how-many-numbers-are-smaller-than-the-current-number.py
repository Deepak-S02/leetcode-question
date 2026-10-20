class Solution:
    def smallerNumbersThanCurrent(self, nums: list[int]) -> list[int]:
        a = []
        for i in range(len(nums)):
            b = nums[i]
            count = 0
            for j in range(len(nums)):
                if( b >nums[j]):
                    count += 1
            a.append(count) 
        return a    
        