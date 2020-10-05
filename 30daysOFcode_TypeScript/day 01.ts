let i: number = 4;
let d: number = 4.0;
let s: string = "HackerRank ";


// Declare second integer, double and string variables
let myInt: number;
let myFloat: number;
let myString: string;

myInt = parseInt(readLine());
myFloat = parseFloat(readLine());
myString = readLine();

// Prints the sum of both integers on a new line.
console.log(i + myInt);

// Prints the sum of both floats on a new line.
console.log((d + myFloat).toFixed(1));

// Concatenate and print the String variables on a new line
console.log(s + myString);
