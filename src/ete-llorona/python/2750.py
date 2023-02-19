n = int(input())
nums = [int(input()) for _ in range(n)]
# nums.sort()

for i in range(n):
    for j in range(n-1):
        if nums[j] > nums[j+1]:
            nums[j], nums[j+1] = nums[j+1], nums[j]

for num in nums:
    print(num)
