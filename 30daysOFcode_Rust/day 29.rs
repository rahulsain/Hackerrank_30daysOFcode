use std::io;

fn main() {
    let n = read_i32();
    
    for _ in 0..n {
        let t = read_vec_i32();
        let mut highest = 0;
        
        for a in 1..t[0] {
            for b in a+1..t[0]+1 {
                if a&b < t[1] && a&b > highest {
                    highest = a&b;
                }
            }
        }
        println!("{}", highest);
    }
}

fn read_i32() -> i32 {
    let mut input = String::new();
    let mut ret_i32: i32 = -1;
        
    io::stdin().read_line(&mut input).expect("Failed to read line.");
        
    match input.trim().parse() {
        Ok(n) => ret_i32 = n,
        Err(_) => println!("Bad input data."),
    };
    
    return ret_i32;
}

fn read_vec_i32() -> Vec<i32> {
    let mut line = String::new();
    let mut vec_i32: Vec<i32> = Vec::new();;
    
    io::stdin().read_line(&mut line).expect("Failed to read line.");
    let vec_str = line.split(" ");
    
    for x in vec_str {
        match x.trim().parse() {
            Ok(n) => vec_i32.push(n),
            Err(_) => println!("Bad input data."),
        };
    }
    
    return vec_i32;
}
