function operators({mealCost = 0, tipPercent = 0, taxPercent = 0}) {
    // Write your code here
    mealCost = Math.round(mealCost + (mealCost * tipPercent / 100) + (mealCost * taxPercent / 100));

    // Use console.log() to print to stdout
    console.log('The total meal cost is ' + mealCost + ' dollars.');
}

module.exports = operators;