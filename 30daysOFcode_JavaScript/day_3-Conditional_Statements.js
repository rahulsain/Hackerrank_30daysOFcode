function main(N) {
    try {
        if (!N)
            throw new TypeError("N cannot be undefined");
        if (typeof N !== 'number')
            throw new TypeError("N is expected to be of type: Number");
        const n = parseInt(N);
        if ((n % 2 !== 0) || (n >= 6 && n <= 20)) {
            console.log('Weird');
        } else {
            console.log('Not Weird')
        }
    } catch (e) {
        throw e;
    }

}

module.exports = main;