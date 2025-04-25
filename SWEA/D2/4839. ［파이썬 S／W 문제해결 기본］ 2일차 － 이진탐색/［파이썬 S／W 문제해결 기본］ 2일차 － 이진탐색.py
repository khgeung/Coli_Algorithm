
T = int(input())
countTest= 0
count = 0
#이진 탐색 : 왼쪽, 오른쪽, 내가 찾아야 하는 페이지 입력받기
def binary_search(left, right, page, count) :
    
    c = int((left+right)/2)
    #c는 중간 값, 중간 값이 내가 찾는 페이지보다 큰 경우 왼쪽 탐색
    #왼쪽,중간값, 페이지 로 변수를 전달한다
    if c > page : 
        count += 1
        return binary_search(left, c, page, count)
    # c는 중간 값, 중간 값이 내가 찾는 페이지보다 작은 경우 오른쪽 탐색
    elif c < page :
        count += 1
        return binary_search(c, right, page, count)
    #c=page, 즉 중간 값이 내가 찾는 페이지와 같은 경우 => 그대로 답 출력
    else :
        count += 1
    return count

# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    r, pa, pb = map(int, input().split())
    count += 1
    counta = 0
    countb = 0
    countResultA = binary_search(1, r, pa, counta)
    countResultB = binary_search(1, r, pb, countb)

    if countResultA < countResultB :
        print("#"+str(count)+" A")
    elif countResultA > countResultB :
        print("#" +str(count)+ " B")
    else :
        print("#" +str(count)+ " 0")
    
    
            