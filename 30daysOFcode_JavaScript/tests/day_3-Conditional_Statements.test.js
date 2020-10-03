const main = require('../day_3-Conditional_Statements');


describe('Conditional Statements - Error Conditions - should throw error', () => {

    // 1
    test('not passing a parameter', () => {
        expect(main).toThrowError();
    });

    // 1
    test('Passing in an integer as a type string', () => {
        expect(main.bind(null, "10")).toThrowError();
    });

});
describe('Conditional Statements - Weird Or Not - True Conditions', () => {

    // 1
    test('Weird Case', () => {

        let outputData = "";
        const storeLog = inputs => (outputData += ((inputs != null || inputs != undefined) ? inputs : ""));
        console["log"] = jest.fn(storeLog);

        main(10)

        expect(outputData).toBe('Weird');
    });

    // 2
    test('Not Weird Case', () => {

        let outputData = "";
        const storeLog = inputs => (outputData += ((inputs != null || inputs != undefined) ? inputs : ""));
        console["log"] = jest.fn(storeLog);

        main(22)

        expect(outputData).toBe('Not Weird');
    });

});
