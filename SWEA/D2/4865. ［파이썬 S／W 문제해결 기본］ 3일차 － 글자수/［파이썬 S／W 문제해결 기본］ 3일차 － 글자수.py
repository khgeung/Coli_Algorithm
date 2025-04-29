T = int(input())
count = 0
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    count += 1
    listK = list(input())
    listJ = list(input()) 
    listCount = []
    #str1의 글자 항목들의 수를 저장할 listCount 초기화
    for i in range(len(listK)):
           listCount.append(0)
    #str2와 str1의 문자 비교 후 숫자 카운트
    for j in range(len(listK)) :
        for i in range(len(listJ)) :
            if listJ[i] == listK[j] :
                listCount[j] += 1
    #가장 많은 문자의 count 값 출력
    listCount.sort()
    print('#' + str(count)+' '+ str(listCount[-1]))
                   