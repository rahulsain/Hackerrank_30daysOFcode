class Calculator {
    power(n: number, p: number): number {
        if (n < 0 || p < 0) {
            throw new Error('n and p should be non-negative');
        }

        return Math.pow(n, p);
    }
}
