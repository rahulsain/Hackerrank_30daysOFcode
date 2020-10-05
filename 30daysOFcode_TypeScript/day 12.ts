class Person {
    private firstName: string;
    private lastName: string;
    private id: number;

    constructor(firstName: string, lastName: string, id: number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    printPerson() {
        console.log(`Name: ${this.lastName}, ${this.firstName}\nID: ${this.id}`);
    }
}

class Student extends Person {
    private scores: Array<number>;

    constructor(firstName: string, lastName: string, id: number, scores: Array<number>) {
        super(firstName, lastName, id);
        this.scores = scores;
    }

    calculate(): string {
        const GRADING_SCALE: Record<string, number> = {
            T: 40,
            D: 55,
            P: 70,
            A: 80,
            E: 90,
        };
        const grade = this.scores.reduce((a, b) => a + b) / this.scores.length;
        for (const key of Object.keys(GRADING_SCALE)) {
            if (grade < GRADING_SCALE[key]) {
                return key;
            }
        }
        return `O`;
    }
}