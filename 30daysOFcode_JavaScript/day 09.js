// Factorial use recursive solving problem method
// Ex of factorial. 5! = 5 * 4 * 3 * 2 * 1
function factorial(n) {
    // if n is null, or n is undefined
    if (n == null || n == undefined)
        // throw error
        throw new TypeError("Required params missing");

    // if n is not equal to 'number'
    if (typeof n !== 'number')
        // throw error
        throw new TypeError("n is expected to be of type: number");

    // explanation. Number.isInteger checks if the target value is an integer, return true, otherwise return false.
    // By using !(not) operator then, if the value is not an integer, return true, otherwise return false.
    if (!Number.isInteger(n))
        // throw error
        throw new TypeError("n is expected to be an Integer");

    // if n is smaller than 0 (negative)
    if (n < 0)
         // throw error
        throw new TypeError("n cannot be negative");

    // if n is less than equal to 2 return n
    // because 2! is 2 * 1
    // 1! is 1
    if (n <= 2)
        return n;

    // using recursive method
    // ex. n = 5 then 5 * 4 * 3 * 2 * 1
    return n * factorial(n - 1);
}

module.exports = factorial;
