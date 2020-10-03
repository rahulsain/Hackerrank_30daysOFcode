class Person {
    private age: number;

    constructor(initialAge: number) {
        if (initialAge >= 0) {
            this.age = initialAge;
        }
        else {
            this.age = 0;
            console.log('Age is not valid, setting age to 0.');
        }
    }

    yearPasses(): void {
        this.age = this.age + 1;
    }

    amIOld(): void {
        if (this.age < 13) {
            console.log('You are young.');
        }
        else if (this.age >= 13 && this.age <18) {
            console.log('You are a teenager');
        }
        else {
            console.log('You are old');
        }
    }
}