// N is the input
function main(N) {
    // Run this function
    try {
        // !N means not true, it means if N is false
        if (!N) throw new TypeError("N cannot be undefined");
        
        // If N is not equal to Number
        if (typeof N !== "number")
            // Return TypeError
            throw new TypeError("N is expected to be of type: Number");
        
        // Declare n to N (Parse N to int value)
        // Pay attention! n is not equal to N (because it's sensitive case)
        const n = parseInt(N);

        // If N is even or n is between 6 and 20
        if (n % 2 !== 0 || (n >= 6 && n <= 20)) {
            // Print Weird
            console.log("Weird");
        } else {
            // Print not weird
            console.log("Not Weird");
        }
    
    // If there's something wrong with the code
    } catch (e) {
        // Throw an error
        throw e;
    }
}

module.exports = main;
