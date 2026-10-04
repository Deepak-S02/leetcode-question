class Solution:
    def nearestValidPoint(self, x: int, y: int, points: list[list[int]]) -> int:
        ans = -1
        smal = 100000

        for i in range(len(points)):
            a,b = points[i]

            if( a==x or b==y):
                distance = abs(x-a) + abs(y-b)

                if(distance < smal):
                    smal = distance
                    ans = i
        return ans

        
        