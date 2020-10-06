interface AdvancedArithmetic {
    divisorSum(n: number): number;
}

class Calculator implements AdvancedArithmetic {

    divisorSum(n: number): number {
        let sum: number = 0;

        for (let i: number = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}