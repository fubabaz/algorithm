class Solution:
    def isPalindrome(self, s: str):
        str =[]

        for char in s:
            if char.isalnum():
                str.append(char.lower())

        # 팰린드롬 여부 판별
        while len(str) > 1:
            if str.pop(0) != str.pop():
                return False

        return True
    

# s=Solution()
# # 함수 호출 True 값 확인
# print(s.isPalindrome("A man, a plan, a canal: Panama"))