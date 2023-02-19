def get_twodim():
    two_dim_list = []
    for i in range(1,10):
         two_dim_list.append(list(map(int,input().split())))
    return two_dim_list

def get_maxval(two_dim_list):
    one_dim_list = []
    for i in range(len(two_dim_list)):
        for j in two_dim_list[i]:
            one_dim_list.append(j)
    maxval = max(one_dim_list)
    return maxval

def get_twodim_maxval(two_dim_list):
    maxval = get_maxval(two_dim_list)
    for i in range(len(two_dim_list)):
        for j in range(len(two_dim_list[i])):
            if two_dim_list[i][j] == maxval:
                print(maxval)
                print(i+1,j+1,end=" ")
    return

if __name__=="__main__":
    get_twodim_maxval(get_twodim())
