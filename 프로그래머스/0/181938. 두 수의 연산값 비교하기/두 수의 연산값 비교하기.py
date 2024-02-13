def solution(a, b):
    answer = 0
    #문자형으로 바꾸면 숫자그대로 더해지기때문에 str로 변환
    if int(str(a)+str(b)) > 2*a*b : 
        answer = int(str(a)+str(b)) 
    else:
        answer = 2*a*b
    return answer


#다른 풀이
def solution(a, b):
    return max(int(str(a) + str(b)), 2 * a * b)
