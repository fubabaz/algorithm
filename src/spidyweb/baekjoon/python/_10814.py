N = int(input())

member_list = []
for i in range(N):
    age, name = map(str, input().split())
    age = int(age)
    member_list.append((age, name))

member_list.sort(key=lambda member: member[0])

for member in member_list:
    print(member[0], member[1])