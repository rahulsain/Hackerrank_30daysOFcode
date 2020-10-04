function solve(meal_cost: number, tip_percent: number, tax_percent: number): void {
    let TotalCost: number = meal_cost + (meal_cost * tip_percent/100) + (meal_cost * tax_percent/100);

    // console.log() to print to stdout
    console.log('The total meal cost is ' + TotalCost + ' dollars.');
}