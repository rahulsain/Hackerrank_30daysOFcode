function loops(n: number): void {
    if (n < 2 || n > 20) {
        return;
    } else {
        for (var i = 1; i <= 10; i++) {
            console.log(n, "x", i, "=", n * i);
        }
    }
}
