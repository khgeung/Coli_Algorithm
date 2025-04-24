T = int(input())
count = 0
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    n, m = map(int, input().split(' '))
    listK = list(map(int, input().split()))
    big = 0
    a=0
    s = 0
    #합이 가장 큰 경우의 구간 합 
    #반복 횟수 : n-m+1회 
    for i in range(0, n-m+1) :
        #구간 합 변수 초기화
        sum1 = 0
        #구간 더하기
        #요소 m개를 더하는 것
        for j in range(a, a+m) :       
            sum1 = sum1+listK[j]
        #더한 구간 합과 최댓값 비교
        if big < sum1 :
            big = sum1
        a += 1
       
    b=0
    # 최솟값은 초기값을 최댓값으로 정해준다. (0으로 초기화하면 항상 최솟값이 0이 됨)
    small = big
    #합이 가장 작은 경우의 구간 합
    for i in range(0, n-m+1) :
        #구간 합 변수 초기화
        sum2 = 0
        #구간 더하기
        #요소 m개를 더하는 것
        for j in range(b, b+m) :
            sum2 = sum2+listK[j]
        #더한 구간 합과 최솟값 비교
        if small > sum2 :
            small = sum2
        b += 1
      
    s = big - small
    count += 1
    print('#' + str(count) + ' ' +str(s)) 
