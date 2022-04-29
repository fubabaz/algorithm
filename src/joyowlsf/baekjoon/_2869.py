import sys
import math

a,b,v = map(int,sys.stdin.readline().split())
i = (v-b)/(a-b)
# 올림처리
print(math.ceil(i))




