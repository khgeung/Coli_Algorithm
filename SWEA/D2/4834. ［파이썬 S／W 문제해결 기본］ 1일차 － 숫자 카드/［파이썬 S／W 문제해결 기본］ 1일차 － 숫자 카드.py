
T = int(input())
count = 0
card = [0,1,2,3,4,5,6,7,8,9]

# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    counting = [0,0,0,0,0,0,0,0,0,0]
    n = int(input())
    m = input()
    count += 1
    max = counting[0]
    maxc = 0
    for i in range(n) :
        if int(m[i]) in card :
            counting[int(m[i])] += 1
        else :
            continue
    for j in range(10) :
        if max <= counting[j] :
            #최댓값을 바꿔주고 maxc에는 인덱스(=해당 카드)를 저장 (이렇게 해야 최댓값이 같아도 가장 숫자가 큰 카드를 출력할 수 있음)
            max = counting[j]
            maxc = j
        else :
            continue
    #해당 카드, 해당 카드가 나타난 횟수 출력
    print('#'+ str(count) + ' ' + str(maxc) + ' '+ str(max))