class Solution:
    def diagonalSum(self, mat: list[list[int]]) -> int:
        start = 0 
        end = len(mat) -1
        sum = 0
        for i in range(len(mat)):
            if(end == start):
                sum -=mat[i][start]
            sum += mat[i][start]
            sum += mat[i][end]
            start +=1
            end   -=1
        return sum
        
        