function solution(a, b) {
    let answer = 0;
    const arr = [a, b];

    if(a > b) {
        for (let i = a; i >= b; i--) {
            answer += i;   
        }
    }
    else if(a < b) {
        for (let i = a; i <= b; i++) {
            answer += i;

        }
    }
    else {
        answer = a;

    }
    return answer;
}
