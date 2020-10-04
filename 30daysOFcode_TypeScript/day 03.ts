function main(): void {
    let N = parseInt(readLine());
    if ((N % 2 !== 0) || (N >= 6 && N <= 20)) {
        console.log('Weird');
    }
    else {
        console.log('Not Weird');
    }
}