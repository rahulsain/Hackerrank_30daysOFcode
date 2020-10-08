function solution(inputArr: Array<number>): string {
    
    let output: string = '';
    for (let i:number = inputArr.length - 1; i >= 0; i--) {
        output = output + inputArr[i] + ' ';
    }
    return output;
}