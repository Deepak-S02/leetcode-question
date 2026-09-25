class Solution:
    def maximumWealth(self, accounts: list[list[int]]) -> int:
        m = len(accounts)
        b =0
        for i in range(m):
            n = len(accounts[i])
            sum = 0
            for j in range(n):
                sum += accounts[i][j]
            if(sum > b):
                b =sum
        return b