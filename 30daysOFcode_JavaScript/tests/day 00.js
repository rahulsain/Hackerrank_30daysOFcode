const processData = require('../day_0-Hello_World');

describe('Process Input and print on console', () => {

    // 1
    test('check for hello world with no parameter passed', () => {

        let outputData = "";
        const storeLog = inputs => (outputData += ((inputs != null || inputs != undefined) ? inputs : ""));
        console["log"] = jest.fn(storeLog);

        processData();

        expect(outputData).toBe('Hello, World.')
    });

    // 2
    test('check for hello world and input param', () => {
        let outputData = "";
        const storeLog = inputs => (outputData += ((inputs != null || inputs != undefined) ? inputs : ""));
        console["log"] = jest.fn(storeLog);

        const inputValue = "Testing first question";
        processData(inputValue);

        expect(outputData).toBe('Hello, World.Testing first question')
    });

    // 3
    test('check for hello world with paramter of type boolean', () => {

        let outputData = "";
        const storeLog = inputs => (outputData += ((inputs != null || inputs != undefined) ? inputs : ""));
        console["log"] = jest.fn(storeLog);

        const inputValue = false;
        processData(inputValue);

        expect(outputData).toBe('Hello, World.false')
    });
});
