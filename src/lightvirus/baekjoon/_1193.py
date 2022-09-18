def find():
    x = int(input())
    line = 1
    sum = 0

    while (1==1):
        if (x <= sum + line):
            if (line % 2 == 1):
                print((line - (x - sum - 1)), '/', (x - sum), sep='')
                break
            else:
                print((x - sum), '/', (line - (x - sum - 1)), sep='')
                break
        else:
            sum += line;
            line += 1

if __name__ == '__main__':
    find()