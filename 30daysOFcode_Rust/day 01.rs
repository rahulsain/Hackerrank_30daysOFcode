use std::io;

pub fn solution() {
    // Some already declared and initialized variables (Task's specific)
    let i : i32 = 5;
    let d : f32 = 2.5;
    let s : String = String::from(", World!");

    let mut res: Vec<String> = Vec::new();
    for idx in 0..3 {
        let mut input : String = String::new();
        io::stdin().read_line(&mut input)
            .expect("Failed to read line");

        if idx == 0 {
            let val: i32 = input.trim().parse().expect("Please type an integer!");
            res.push(format!("{}", val + i));
        } else if idx == 1 {
            let val: f32 = input.trim().parse().expect("Please type a double!");
            let fmt_sum = format!("{:.*}", 1, val + d);
            res.push(format!("{}", fmt_sum));
        } else {
            let val: String = input.trim().to_string();
            res.push(format!("{}", val + &s));
        }
    }

    for e in &res {
        println!("{}", e);
    }
}