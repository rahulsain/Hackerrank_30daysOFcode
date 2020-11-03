const main = require('../day_5-Loops');


describe('Loops - Error Conditions - should throw error', () => {

    // 1
    test('not passing a parameter', () => {
        expect(main).toThrowError();
    });

    // 1
    test('Passing in an integer as a type string', () => {
        expect(main.bind(null, "10")).toThrowError();
    });

});
describe('Loops - True Conditions', () => {

    // 1
    test('correct Case - N as 2', () => {

        // expected output of this test case: table of 2 :D
        const outputExpected = `2 x 1 = 22 x 2 = 42 x 3 = 62 x 4 = 82 x 5 = 102 x 6 = 122 x 7 = 142 x 8 = 162 x 9 = 182 x 10 = 20`;

        // to get output of console.log
        let outputData = "";
        const storeLog = inputs => (outputData += ((inputs != null || inputs != undefined) ? inputs : ""));
        console["log"] = jest.fn(storeLog);

        main(2);

        expect(outputData).toBe(outputExpected);
    });

});
