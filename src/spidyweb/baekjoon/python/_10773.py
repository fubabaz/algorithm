def main():
    stack_sum(int(input()))

def stack_sum(K):
    stack_list = []
    for i in range(K):
        num = int(input())
        if num == 0:
            if len(stack_list) == 0:
                pass
            else:
                del stack_list[len(stack_list)-1]
        else:
            stack_list.append(num)

    result = 0
    for j in stack_list:
        result += j
    print(result)
    return


if __name__=="__main__":
    main()