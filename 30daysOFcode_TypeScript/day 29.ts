'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString: string[] | string = '';
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
  const t: number = parseInt(readLine(), 10);

  for (let tItr = 0; tItr < t; tItr++) {
    const nk: string[] = readLine().split(' ');

    const n: number = parseInt(nk[0], 10);

    const k: number = parseInt(nk[1], 10);

    const a: number = k - 1;
    const b: number = (~a) & -(~a)

    console.log((a | b) > n ? a - 1 : a)
  }
}