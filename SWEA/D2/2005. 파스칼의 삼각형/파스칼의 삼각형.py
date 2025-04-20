
T = int(input())
count = 0
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    n = int(input())
    listK = []
    count+= 1
    print('#' + str(count))
    for i in range(1, n+1) :

        if i == 1 :
            listK.append([1])
        elif i == 2 :
            listK.append([1,1])
        else :
            listJ = []
            listJ.append(1)
            #i가 3 이상일 경우
            # i = 3 => b = 0
            # i = 4 => b = 0, 1
            for b in range(0, i-2) : 
                listJ.append(listK[i-2][b] + listK[i-2][b+1])
            listJ.append(1)
            listK.append(listJ)

    for s in range(len(listK)) :
        for f in range(len(listK[s])) :
            print(listK[s][f], end=' ')
        print()

        
        