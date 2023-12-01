#import sys
#input = sys.stdin.readline
n = int(input())
p = []
for i in range(n):
    name = input() #이름 입력받기
    nombre = str(name) #문자열로 변환
    if len(nombre) == 3: #이름이 3글자인 경우
        p.append(name) # 배열 p에 저장
print(min(p)) #p에서 젤 작은 값 출력
