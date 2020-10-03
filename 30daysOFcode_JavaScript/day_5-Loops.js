function main(n) {
    try {
        if (!n)
            throw new TypeError("n cannot be undefined");
        if (typeof n !== 'number')
            throw new TypeError("n is expected to be of type: number");

        for (i = 1; i <= 10; i++) {
            console.log(n + ' x ' + i + ' = ' + (n * i))
        }
    } catch (e) {
        throw e;
    }
}

module.exports = main;