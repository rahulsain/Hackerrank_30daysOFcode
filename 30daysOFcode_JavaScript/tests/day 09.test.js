const main = require('../day_9-Recursion');


describe('Recursion - Error Conditions - should throw error', () => {

    // 1
    test('not passing a parameter', () => expect(main).toThrowError(TypeError))

    // 2
    test('Passing in an integer as a type string', () => expect(main.bind(null, "10")).toThrowError(TypeError));

    // 3
    test('Passing a negative integer', () => expect(main.bind(null, -10)).toThrowError(TypeError));

    // 4
    test('Passing a float value', () => expect(main.bind(null, 10.5)).toThrowError(TypeError));

});
describe('Recursion- True Conditions', () => {
    // 1
    test('Correct Case', () => {

        expect(main(5)).toBe(120);
    });
});
