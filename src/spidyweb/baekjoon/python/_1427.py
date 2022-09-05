N = str(input())

n_list = []
for i in range(len(N)):
    n_list.append(N[i])

result = ""
for i in sorted(n_list, reverse=True):
    result += i

"""
for i in sorted(n_list, reverse=True):
    print(i, end='')
"""

print(result)