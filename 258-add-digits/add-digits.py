class Solution:
    def addDigits(self, num: int) -> int:
        a = str(num)
        a.split()
        while(int(a) > 9):
            s=0
            for i in a:
                s = s+int(i)
            a = str(s)
        return int(a)


        