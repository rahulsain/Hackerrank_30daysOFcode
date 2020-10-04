function processData(input) {
    //Enter your code here
    if (typeof input !== 'string')
        throw new TypeError('Invalid Type - String expected');
    if (input.trim().length === 0)
        throw new TypeError('input cannot be empty');

    input = input.split('\n');

    for (i = 0; i < input.length; i++) {
        var splitWord = input[i].split('');

        var even = '';
        var odd = '';

        for (x = 0; x < splitWord.length; x++) {
            if (x % 2 === 0) {
                even = even + splitWord[x];
            } else {
                odd = odd + splitWord[x];
            }
        }
        console.log(even + ' ' + odd);
    }
}

module.exports = processData;