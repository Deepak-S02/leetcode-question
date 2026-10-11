class Solution:
    def largestAltitude(self, gain: list[int]) -> int:
        ans = 0 
        peak =0
        for i in range(len(gain)):
            peak += gain[i]
            if(peak > ans):
                ans = peak
        return ans

        