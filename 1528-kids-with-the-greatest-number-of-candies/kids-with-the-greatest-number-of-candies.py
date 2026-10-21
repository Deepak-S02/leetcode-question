class Solution:
    def kidsWithCandies(self, candies: list[int], extraCandies: int) -> list[bool]:
        a = []
        c = candies.copy()
        c.sort()
        s = len(candies)
        b = c[s-1]
        
        for i in range(len(candies)):
            if(candies[i]+extraCandies >= b):
                a.append(True)
            else :
                a.append(False)

        return a
        