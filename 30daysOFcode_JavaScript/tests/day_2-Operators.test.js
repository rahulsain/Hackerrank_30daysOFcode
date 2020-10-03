const operators = require('../day_2-Operators');

describe('Operators - calculate meal cost', () => {

    // 1
    test('Truthy Case', () => {

        let outputData = "";
        const storeLog = inputs => (outputData += ((inputs != null || inputs != undefined) ? inputs : ""));
        console["log"] = jest.fn(storeLog);

        operators({
            mealCost: 10,
            tipPercent: 1,
            taxPercent: 10
        });

        expect(outputData).toBe('The total meal cost is ' + 11 + ' dollars.')
    });

    // 2
    test('default value', () => {

        let outputData = "";
        const storeLog = inputs => (outputData += ((inputs != null || inputs != undefined) ? inputs : ""));
        console["log"] = jest.fn(storeLog);

        operators({});

        expect(outputData).toBe('The total meal cost is ' + 0 + ' dollars.')
    });

});
