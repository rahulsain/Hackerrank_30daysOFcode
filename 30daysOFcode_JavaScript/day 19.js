class AdvancedArithmetic {
  divisor(n) {
    return n || 0;
  };
}

class Calculator extends AdvancedArithmetic {
  constructor(props) {
    super(props);

    this.divisor = this.divisorSum.bind(this);
  }

  divisorSum(n) {
    return Array(n).fill(0).reduce((target, item, index) => {
      !(n % (index + 1)) && (target += (index + 1)) ;

      return target;
    }, 0);
  }
}

function Solution () {
  const n = 6;

  const myCalculator = new Calculator();

  let sum = myCalculator.divisor(n);

  console.log("I implemented: AdvancedArithmetic\n" + sum); 
}

Solution();