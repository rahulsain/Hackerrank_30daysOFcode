#![allow(non_snake_case)]

struct Person {
    age: i32
}

impl Person {
    fn new(initialAge: i32) -> Person {
        let initial_Age = std::cmp::max(initialAge, 0);
        if initialAge < 0 {
            println!("Age is not valid, setting age to 0.");
        }

        return Person { age: initial_Age };
    }

    fn amIOld(&self) {
        match self.age {
            0..=12 => println!("You are young."),
            13..=17 => println!("You are a teenager."),
            _ => println!("You are old."),
        }
    }

    fn yearPasses(&mut self) {
        self.age += 1;
    }
}

fn main() {
    let T: i32 = read_line().trim().parse().unwrap();
 
    for _ in 0..T {
        let age = read_line().trim().parse().unwrap();
        let mut p = Person::new(age);
 
        p.amIOld();
 
        for _ in 0..3 {
            p.yearPasses();
        }
 
        p.amIOld();
        println!("");
    }
}

fn read_line() -> String {
   let mut  input = String::new();
   std::io::stdin().read_line(&mut input).expect("Could not read stdin!");
    return input;
}
