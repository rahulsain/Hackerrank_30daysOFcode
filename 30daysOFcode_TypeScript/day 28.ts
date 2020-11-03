'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString: string = '';
let currentLine: number = 0;

process.stdin.on('data', inputStdin => {
  inputString += inputStdin;
});

process.stdin.on('end', _ => {
  inputString = inputString.replace(/\s*$/, '')
    .split('\n')
    .map(str => str.replace(/\s*$/, ''));

  main();
});

function readLine() {
  return inputString[currentLine++];
}



function main() {
  const N = parseInt(readLine(), 10);

  const nameArr: string[] = [];
  for (let NItr = 0; NItr < N; NItr++) {
    const firstNameEmailID: string[] = readLine().split(' ');

    const firstName: string = firstNameEmailID[0];

    const emailID: string = firstNameEmailID[1];

    const gmailRegex: RegExp = new RegExp('^[a-zA-Z0-9_.+-]+@gmail.[a-zA-Z0-9-.]+$')

    if (emailID.match(gmailRegex)) {
      nameArr.push(firstName)
    }
  }

  nameArr.sort();

  for (const name of nameArr) {
    console.log(name);
  }

}