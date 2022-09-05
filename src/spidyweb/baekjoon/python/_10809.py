S = str(input())
s_list = list(S)
alpha = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"]

for i in range(len(alpha)):
    if alpha[i] in s_list:
        print(s_list.index(alpha[i]), end=' ')
    else:
        print(-1, end=' ')