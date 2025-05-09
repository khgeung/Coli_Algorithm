T = int(input())
count = 0
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    str1 = input()
    str2 = input()
    count += 1
    # str2.rfind(str1) : str2 문자열 안에 str1이 있는지 확인하고, 있다면 인덱스 반환 / 없다면 -1을 반환한다.
    if(str2.rfind(str1) == -1 ):
        print("#"+str(count)+" "+str(0))
    else :
        print("#"+str(count)+" "+str(1))