const main = require('../day_10-Binary_Number');


describe('Binary Numbers - Error Conditions - should throw error', () => {

    // 1
    test('not passing a parameter', () => expect(main).toThrowError(TypeError))

    // 2
    test('Passing in an integer as a type string', () => expect(main.bind(null, "10")).toThrowError(TypeError));

    // 3
    test('Passing a negative integer', () => expect(main.bind(null, -10)).toThrowError(TypeError));

    // 4
    test('Passing a float value', () => expect(main.bind(null, 10.5)).toThrowError(TypeError));

});
describe('Binary Numbers- True Conditions', () => {
    // 1
    test('Correct Case', () => {
        expect(main(13)).toBe(2);
    });

    // 2
    test('Correct Case 2', () => {
        expect(main(5)).toBe(1);
    });
});
