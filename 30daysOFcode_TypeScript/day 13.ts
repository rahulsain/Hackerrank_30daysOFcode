class Book {
    title: string;
    author: string;
    
    constructor(title: string, author: string) {
        if (this.constructor === Book) {
            throw new TypeError('Do not attempt to directly instantiate an abstract class.');
        }
        else {
            this.title = title;
            this.author = author;
        }
    }

    display(): void {
        console.log('Implement the \'display\' method!');
    }
}

class MyBook extends Book {
    price: number;

    constructor(title: string, author: string, price: number) {
        super(title, author);
        this.price = price;
    }

    display(): void {
        console.log('Title: ' + this.title);
        console.log('Author: ' + this.author);
        console.log('Price: ' + this.price);
    }
}