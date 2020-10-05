const {getPerimeterES6, getPerimeterES5, getAreaES6, getAreaES5} = require('../day_14-Let_and_Const');

describe('Let And Const', () => {
    // 1
    test('Correct Case - getArea es5', () => {
        expect(getAreaES5(2.6)).toBe(21.237166338267002);
    });

    // 2
    test('Correct Case - getArea es6', () => {
        expect(getAreaES6(2.6)).toBe(21.237166338267002);
    });

    // 3
    test('Correct Case - getPerimeter es5', () => {
        expect(getPerimeterES5(2.6)).toBe(16.336281798666924);
    });

    // 4
    test('Correct Case - getPerimeter es6', () => {
        expect(getPerimeterES6(2.6)).toBe(16.336281798666924);
    });


});
