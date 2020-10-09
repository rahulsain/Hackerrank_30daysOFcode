function processData(input): void {
  const inputArr: string[] = input.split("\n");
  const [returnedDay, returnedMonth, returnedYear]: number[] = inputArr[0].split(" ").map(val => parseInt(val))
  const [expectedDay, expectedMonth, expectedYear]: number[] = inputArr[1].split(" ").map(val => parseInt(val))
  const fine: number = returnedYear > expectedYear ? 10000 :
    returnedYear === expectedYear ?
      returnedMonth > expectedMonth ? 500 * (returnedMonth - expectedMonth) :
        returnedMonth === expectedMonth ?
          returnedDay > expectedDay ? 15 * (returnedDay - expectedDay) : 0
          : 0
      : 0
  console.log(fine);
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
  _input += input;
});

process.stdin.on("end", function () {
  processData(_input);
});