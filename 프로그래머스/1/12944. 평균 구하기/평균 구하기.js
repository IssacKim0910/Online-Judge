function solution(arr) {
    var answer = 0;

    let sum = 0;

    for (let index = 0; index < arr.length; index++) {
        sum += arr[index];

    }
    answer = sum / arr.length;

    console.log(answer);
    return answer;
    
}
solution([1, 2, 3, 4]);