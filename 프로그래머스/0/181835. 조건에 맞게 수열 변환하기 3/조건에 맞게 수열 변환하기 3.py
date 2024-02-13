def solution(arr, k):
    answer = []
    for i in range(len(arr)):    #반복문으로 리스트 각각의값 계산
        if k % 2 == 0:    
            arr[i] = arr[i] + k     
            answer = arr
        else:
            arr[i] = arr[i] * k
            answer = arr
    return answer
