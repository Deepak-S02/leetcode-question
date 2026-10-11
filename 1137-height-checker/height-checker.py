class Solution:
    def heightChecker(self, heights: list[int]) -> int:
        n = heights.copy()
        n.sort()
        count = 0
        for i in range(len(n)):
            if( n[i] != heights[i]):
                count += 1
        return count
        