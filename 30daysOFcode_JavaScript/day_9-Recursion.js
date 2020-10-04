function factorial(n) {
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

    return n * factorial(n - 1);
}

module.exports = factorial;
