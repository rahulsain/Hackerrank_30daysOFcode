function processData(input) {
    //Enter your code here
    var inputArr = input.split('\n'),
        actual = inputArr[0].split(' '),
        expected = inputArr[1].split(' '),
        month = 1,
        day = 0,
        year = 2,
        fine = 0;

    if (actual[year] > expected[year]) {
        fine = 10000;
    } else if (actual[month] > expected[month]) {
        fine = 500 * (actual[month] - expected[month]);
    } else if (actual[day] > expected[day]) {
        fine = 15 * (actual[day] - expected[day]);
    }

    console.log(fine);
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function(input) {
    _input += input;
});

process.stdin.on("end", function() {
    processData(_input);
});