T = int(input())
count = 0
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    n = int(input())
    listX = []
    count += 1
    for i in range(n) :
        listX.append( list(map(int, input().split(' '))))
    
    x = 0
    y = n-1
    z = n-1
    
    print('#'+str(count))
    for c in range(n) : 
        listF = []
        for k in range(n-1, -1, -1) :
    	    #90도 회전
            listF.append(listX[k][x])
        listF.append(' ')
        for a in range(n-1, -1, -1) :
            #180도 회전
            listF.append(listX[y][a])
        listF.append(' ')
        for f in range(n) :       
            #270도 회전 
            listF.append(listX[f][z])
    	#x는 증가, y는 감소, z는 감소
        x += 1
        y -= 1
        z -= 1

        for b in range(len(listF)) :
            print(listF[b], end='')
        print('')
    