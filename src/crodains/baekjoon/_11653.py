def soinsu(Num):

    nanum = 2
    while True:
        if Num == 1:
            break
        
        if Num % nanum == 0:
            Num = Num / nanum
            print(nanum)
            print(Num)

        elif Num / nanum != 0:
            nanum += 1
            print(nanum)


soinsu(int(input()))
