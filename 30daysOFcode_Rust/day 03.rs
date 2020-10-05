pub fn solution() {
    // Some already declared and initialized variables (Task's specific)
    // Constraints: 1 <= n <= 100
    let n : i32 = 24;

    if n % 2 != 0 || (6 <= n && n <= 20) {
        println!("Weird");
    } else if (2 <= n && n <= 5) || n > 20 {
        println!("Not Weird");
    }
}
