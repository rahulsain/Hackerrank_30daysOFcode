use math::round;

pub fn solution() {
    // Some already declared and initialized variables (Task's specific)
    let meal_cost : f64 = 15.50;
    let tip_percent : i32 = 15;
    let tax_percent : i32 = 10;

    let tip: f64 = meal_cost * tip_percent as f64 / 100.0;
    let tax: f64 = meal_cost * tax_percent as f64 / 100.0;
    let total_cost: f64 = meal_cost + tip + tax;
    let total_cost_rounded = round::floor(total_cost, 0);
    println!("{}", total_cost_rounded);
}
