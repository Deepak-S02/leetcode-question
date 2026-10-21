class Solution:
    def truncateSentence(self, s: str, k: int) -> str:
        a = []
        b = []
        a = s.split()
        for i in range(k):
            b.append(a[i])
        return " ".join(b)

        