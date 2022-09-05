word = input()

alpabet_list = ['ABC','DEF','GHI','JKL','MNO','PQRS','TUV','WXYZ']
time = 0

for one in alpabet_list:
    for i in one:
        for j in word:
            if i == j:
                time += alpabet_list.index(one) +3
print(time)