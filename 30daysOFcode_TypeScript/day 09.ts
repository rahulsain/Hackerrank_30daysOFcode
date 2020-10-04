function factorial(n: number): number {
    if (n == 0 || n == 1) {
        return 1;
    }
    return factorial(n - 1) * n;
}