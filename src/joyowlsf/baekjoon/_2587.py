import statistics

list = []
for i in range(5):
    list.append(int(input()))

list.sort()

print(statistics.mean(list))
print(list[2])
