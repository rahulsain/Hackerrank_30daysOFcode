class Person {
    firstName: string;
    lastName: string;
    idNumber: number;

    constructor(firstName: string, lastName: string, identification: number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    printPerson(): void {
        console.log('Name: ' + this.lastName + ', ' + this.lastName + '\nID: ' + this.idNumber);
    }
}

class Student extends Person {
    scores: Array<number>;

    constructor(firstName: string, lastName: string, id: number, scores: Array<number>) {
        super(firstName, lastName, id);
        this.scores = scores;
    }

    calculate(): string {
        let sum: number = 0;
        for (let i: number = 0; i < this.scores.length; i++) {
            sum += this.scores[i];
        }

        let avg: number = Math.floor(sum / this.scores.length);

        if (avg >= 90 && avg <= 100) {
            return 'O';
        }
        else if (avg >= 80 && avg < 90) {
            return 'E';
        }
        else if (avg >= 70 && avg < 80) {
            return 'A';
        }
        else if (avg >= 55 && avg < 70) {
            return 'P';
        }
        else if (avg >= 40 && avg < 55) {
            return 'D';
        }
        else {
            return 'T';
        }
    }
}