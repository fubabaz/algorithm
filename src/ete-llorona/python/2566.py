max_value, row, col = 0, 0, 0
for i in range(9):
  numbers = list(map(int, input().split()))
  for j in range(9):
    if numbers[j] > max_value:
      max_value, row, col = numbers[j], i, j

print(max_value)
print(row+1, col+1)