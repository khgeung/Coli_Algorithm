
T = int(input())
count = 0
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    count += 1
    n = int(input())
    numlist=[]
    numlist = list(map(int, input().split()))
    max = numlist[0]
    min = numlist[0]
    for i in range(n) :
        if max <= numlist[i] :
            max = numlist[i]
        else : 
            continue
    for j in range(n) :
        if min >= numlist[j] :
            min = numlist[j]
        else :
            continue
    print('#'+str(count)+' ' + str(max-min))
            