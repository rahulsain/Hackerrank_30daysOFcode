/**
 * Let and Const
 */
const PI = Math.PI;


// ES5 syntax
function getAreaES5(r) {
    let area;
    area = PI * Math.pow(r, 2);
    return area;
}

function getPerimeterES5(r) {
    let perimeter;
    perimeter = 2 * PI * r;
    return perimeter;
}


// ES6 syntax
const getAreaES6 = (r) => PI * Math.pow(r, 2);
const getPerimeterES6 = (r) => 2 * PI * r;


// console.log(getAreaES5(2.6)); // Output should be 21.237166338267002
// console.log(getPerimeterES5(2.6)); //Output should be 16.336281798666924
//
// console.log(getAreaES6(2.6)); // Output should be 21.237166338267002
// console.log(getPerimeterES6(2.6)); //Output should be 16.336281798666924


module.exports = {
    getAreaES5,
    getAreaES6,
    getPerimeterES5,
    getPerimeterES6
}