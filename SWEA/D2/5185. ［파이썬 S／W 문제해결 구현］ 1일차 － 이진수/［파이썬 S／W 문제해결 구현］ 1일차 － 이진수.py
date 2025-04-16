
T = int(input())
count = 0
listK = ['0000' , '0001' , '0010', '0011', '0100', '0101', '0110', '0111', '1000', '1001']
listN = ['A', 'B', 'C', 'D', 'E', 'F']
listA = ['1010', '1011', '1100', '1101', '1110', '1111']
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    n, m = map(str, input().split())
    count += 1
    result = ''
    for i in range(int(n)) :
        if m[i] in listN :
            result += listA[listN.index(m[i])]
        else :
            result += listK[int(m[i])]
    print('#'+str(count)+' '+result)