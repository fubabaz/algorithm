def apart(T = int(input())):
    arr = [[0 for col in range(15)] for row in range(15)]
    for i in range(T):
        k = int(input())
        n = int(input())

        for j in range(1, n+1):
            arr[0][j-1] = j

        for floor in range(1, k+1):
            for room in range(n):
                if room == 0:
                    arr[floor][room] = 1
                else:
                    arr[floor][room] = arr[floor][room-1] + arr[floor-1][room]

        print(arr[k][n-1])

if __name__ == '__main__':
    apart()