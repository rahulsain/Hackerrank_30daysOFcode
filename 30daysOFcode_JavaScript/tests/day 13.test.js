const MyBook = require('../day_13-Abstract_Classes');

describe('Let And Const', () => {

    // 1
    test('Correct Case - Case 1', () => {
        const myBook = new MyBook('Harry Potter', 'J K Rowling', 550);

        let outputData = "";
        const storeLog = inputs => (outputData += ((inputs != null || inputs != undefined) ? inputs : ""));
        console["log"] = jest.fn(storeLog);

        myBook.display()
        expect(outputData).toBe('Title: ' + 'Harry Potter' + '\n' + 'Author: ' + 'J K Rowling' + '\n' + 'Price: ' + 550);
    });

    // 2
    test('Correct Case - Case 2', () => {
        const myBook = new MyBook();

        let outputData = "";
        const storeLog = inputs => (outputData += ((inputs != null || inputs != undefined) ? inputs : ""));
        console["log"] = jest.fn(storeLog);

        myBook.display();
        expect(outputData).toBe('Title: ' + 'undefined' + '\n' + 'Author: ' + 'undefined' + '\n' + 'Price: undefined');
    });
});
