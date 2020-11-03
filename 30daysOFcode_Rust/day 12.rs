use super::util;

pub fn solution() {
    let lines = util::read_input_lines("12");
    let expected_results = util::read_expected_results("12");

    let person_data: Vec<&str> = (lines.get(0).unwrap() as &String)
        .split_whitespace()
        .collect();
    let scores_num: usize = (lines.get(1).unwrap() as &String).parse().unwrap();
    let scores_list: Vec<usize> = (lines.get(2).unwrap() as &String)
        .split_whitespace()
        .map(|num| num.parse().unwrap())
        .collect();

    let p = Person::of(person_data.get(0).unwrap().to_string(), person_data.get(1).unwrap().to_string(),
                       (person_data.get(2).unwrap() as &str).parse().unwrap());
    let s = Student::of(p, scores_list);
//    s.print_person();
//    println!("Grade: {:?}", s.calculate());
    let mut res = s.print_person_debug();
    res.push(format!("Grade: {}", s.calculate()));
    for (i, e) in expected_results.iter().enumerate() {
        assert_eq!(e, res.get(i).unwrap());
    }
}

trait PrintPerson {
    fn print_person(&self);
    // for testing purposes only
    fn print_person_debug(&self) -> Vec<String>;
}

struct Person {
    first_name: String,
    last_name: String,
    id_number: usize
}

impl Person {
    fn of(first_name: String, last_name: String, id_number: usize) -> Person {
        Person { first_name, last_name, id_number }
    }
}

impl PrintPerson for Person {
    fn print_person(&self) {
        println!("{}", format!("Name: {}, {}\nID: {}",
                         self.last_name, self.first_name, self.id_number));
    }

    fn print_person_debug(&self) -> Vec<String> {
        let mut v = Vec::new();
        v.push(format!("Name: {}, {}", self.last_name, self.first_name));
        v.push(format!("ID: {}", self.id_number));
        v
    }
}

struct Student {
    person: Person,
    test_scores: Vec<usize>
}

impl Student {
    fn of(person: Person, test_scores: Vec<usize>) -> Student {
        Student { person, test_scores }
    }

    fn calculate(&self) -> char {
        let mut total = 0;
        for score in self.test_scores.iter() {
            total += score;
        }

        let avg = total / self.test_scores.len();

        if avg >= 90 && avg <= 100 {
            'O'
        } else if avg >= 80 && avg < 90 {
            'E'
        } else if avg >= 70 && avg < 80 {
            'A'
        } else if avg >= 55 && avg < 70 {
            'P'
        } else if avg >= 40 && avg < 55 {
            'D'
        } else {
            'T'
        }
    }
}

impl PrintPerson for Student {
    fn print_person(&self) {
        self.person.print_person();
    }

    fn print_person_debug(&self) -> Vec<String> {
        self.person.print_person_debug()
    }
}
