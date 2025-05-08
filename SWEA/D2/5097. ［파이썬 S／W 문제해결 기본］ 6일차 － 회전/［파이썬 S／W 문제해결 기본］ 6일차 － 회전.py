from collections import deque

T = int(input())
count = 0
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    n, m = map(int, input().split(" "))
    count+= 1
    listK = input().split(" ")
    listK.remove(listK[-1])
    queue = deque()
    for i in range(len(listK)) :
        queue.append(listK[i])
    #맨 앞 요소를 맨뒤로 가져오는 연산
    for j in range(m):
        a = queue.popleft()
        queue.append(a)
    print('#' + str(count)+" "+queue[0])