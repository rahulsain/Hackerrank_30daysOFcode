const main = require('../day_7-Arrays');


describe('Arrays - Error Conditions - should throw error', () => {

    // 1
    test('not passing a parameter', () => expect(main).toThrowError(TypeError));

    // 2
    test('Passing an empty string', () => expect(main.bind(null, "")).toThrowError(TypeError));

    // 3
    test('Passing a boolean type', () => expect(main.bind(null, true)).toThrowError(TypeError));
});

describe('Arrays  - True Conditions', () => {

    // 1
    test('Correct Case', () => {

        // expected output of this test case: table of 2 :D
        const outputExpected = '4 3 2 1';

        // to get output of console.log
        let outputData = "";
        const storeLog = inputs => (outputData += ((inputs != null || inputs != undefined) ? inputs : ""));
        console["log"] = jest.fn(storeLog);

        main([1, 2, 3, 4]);

        expect(outputData).toBe(outputExpected);
    });

});
