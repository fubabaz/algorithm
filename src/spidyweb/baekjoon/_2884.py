H,M = map(int, input().split())

if (H == 0) & (0 <= M < 45):
    print(f'23 {M+15}')
elif (H == 0) & (45 <= M <= 60):
    print(f'{H} {M-45}')
elif (1 <= H <= 23) & (0 <= M < 45):
    print(f'{H-1} {M+15}')
elif (1 <= H <= 23) & (45 <= M <= 60):
    print(f'{H} {M-45}')
else:
    print("error! out of input scale")
