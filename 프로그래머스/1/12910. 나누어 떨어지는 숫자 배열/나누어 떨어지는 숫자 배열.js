function solution(arr, divisor) {
    const list = arr.reduce((acc, curr) => {
        if(curr % divisor === 0) {
            acc.push(curr);
        }
    return acc;
    }, []);

    if(list.length === 0) {
        return [-1];
    }

    console.log(list);
    list.sort((a,b) => a - b);
    return list;
}