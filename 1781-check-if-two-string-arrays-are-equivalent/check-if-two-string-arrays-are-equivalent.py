class Solution:
    def arrayStringsAreEqual(self, word1: list[str], word2: list[str]) -> bool:
        a = ""
        b = ""
         
        for i in range(len(word1)):
            a += str(word1[i])
        for j in range(len(word2)):
            b += str(word2[j])
        if( a == b):
            return True
        else :
            return False

        