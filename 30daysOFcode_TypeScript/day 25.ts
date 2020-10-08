function checkPrime(n: number): boolean {
    for (let i: number = 2; i <= n / 2; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

function processData(input: string): void {
    let n: number = parseInt(input[0]);
    let arr: Array<string> = input.split('\n');

    for (let i: number = 1; i <= n; i++) {
        if (checkPrime(parseInt(arr[i]))) {
            console.log('Prime');
        }
        else {
            console.log('Not prime');
        }
    }
}