function main(inputArr) {

    if (!inputArr || !Array.isArray(inputArr))
        throw new TypeError('Invalid Type - Array expected');

    const outputString = inputArr.reverse().join(' ');
    console.log(outputString);
}

module.exports = main;
