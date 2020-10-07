function main(): void {
    let n: number = parseInt(readLine());
    let a: Array<number> = readLine().split(' ');
    a = a.map(Number);

    let noOfSwaps: number = 0;

    for (let i: number = 0; i < n - 1; i++) {
        for (let j: number = i + 1; j < n; j++) {
            if (a[i] > a[j]) {
                let temp: number = a[i];
                a[i] = a[j];
                a[j] = temp;
                noOfSwaps++;
            }
        }
    }

    console.log('Array is sorted in ' + noOfSwaps + ' swaps.');
    console.log('First Element: ' + a[0]);
    console.log('Last Element: ' + a[n - 1]);
}
