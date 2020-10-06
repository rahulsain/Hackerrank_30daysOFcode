class Printer<T> {
    
    printArray(arr: Array<T>): void {
        for (let i: number = 0; i < arr.length; i++) {
            console.log(arr[i]);
        }
    }
}