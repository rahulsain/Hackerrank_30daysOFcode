function main() {
  var n = parseInt(readLine());
  var binary = [];

  while (n > 0) {
    binary.push(n % 2)
    n = Math.floor(n / 2)
  }

  binary = binary.reverse()

  var ones = 0;;
  var max = 0;

  for (i = 0; i < binary.length; i++) {
    if (binary[i] === 1) {
      ones += 1;
    } else if (binary[i] === 0) {
      if (ones > max) max = ones;
      ones = 0;
    }
  }

  if (ones > max) max = ones

  console.log(max)
}
