interface E {
  key: any;
}

interface T {}

class Printer<T> {
  printArray(a: Array<E>): void {
    for (let element of a) {
      console.log(element);
    }
  }
}

let arr1 = new Printer<T>();
arr1.printArray([{ key: 1 }, { key: "a" }]);

