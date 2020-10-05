function main(n) {
    if (n == null || n == undefined)
        throw new TypeError("Required params missing");
    if (typeof n !== 'number')
        throw new TypeError("n is expected to be of type: number");
    if (!Number.isInteger(n))
        throw new TypeError("n is expected to be an Integer");
    if (n < 0)
        throw new TypeError("n cannot be negative");
    if (n <= 2)
        return n;

    var binary = [];
    while (n > 0) {
        binary.push(n % 2)
        n = Math.floor(n / 2)
    }

    binary = binary.reverse()

    var ones = 0;
    ;
    var max = 0;

    for (i = 0; i < binary.length; i++) {
        if (binary[i] === 1) {
            ones += 1;
        } else if (binary[i] === 0) {
            if (ones > max) max = ones;
            ones = 0;
        }
    }

    if (ones > max) max = ones

    // console.log(max)
    return max;
}

module.exports = main;


