def solution(arr, k):
    answer = []
    for i in range(len(arr)):
        if k % 2 == 0:
            arr[i] = arr[i] + k
            answer = arr
        else:
            arr[i] = arr[i] * k
            answer = arr
    return answer
