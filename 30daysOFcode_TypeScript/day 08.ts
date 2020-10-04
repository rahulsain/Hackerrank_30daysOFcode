function processData(input: string) {
    let inputArr: Array<string> = input.split('\n');

    let phoneBook = {};
    
    for (let i: number = 1; i <= parseInt(inputArr[0]); i++) {
        let contact: Array<string> = inputArr[i].split(' ');
        phoneBook[contact[0]] = parseInt(contact[1]);
    }

    for (let i: number = parseInt(inputArr[0]) + 1; i < inputArr.length; i++) {
        if (phoneBook[inputArr[i]]) {
            console.log(inputArr[i] + '=' + phoneBook[inputArr[i]]);
        }
        else {
            console.log('Not found');
        }
    }

}