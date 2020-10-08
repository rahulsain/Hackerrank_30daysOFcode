function checkPrime(n) {
    for (var i = 2; i <= n / 2; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
function processData(input) {
    var n = parseInt(input[0]);
    var arr = input.split('\n');
    for (var i = 1; i <= n; i++) {
        if (checkPrime(parseInt(arr[i]))) {
            console.log('Prime');
        }
        else {
            console.log('Not prime');
        }
    }
}
processData('3\n12\n5\n23');
