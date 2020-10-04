function main(): void {
    let decimal: number = parseInt(readLine());
    let binary: Array<number> = [];

    while (decimal > 0) {
        let rem: number = decimal % 2;
        binary.push(rem);
        decimal = Math.floor(decimal/ 2);
    }

    binary = binary.reverse();

    let ones = 0;
    let max = 0;

    for (let i: number = 0; i < binary.length; i++) {
        if (binary[i] == 1) {
            ones += 1;
        }
        else {
            if (ones > max) {
                max = ones;
            }
            ones = 0;
        }
    }

    if (ones > max) {
        max = ones;
    }

    console.log(max);
}