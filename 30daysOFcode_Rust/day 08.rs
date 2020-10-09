use super::util;
use std::collections::HashMap;

pub fn solution() {
    let expected_results = util::read_expected_results("8");
    let (n, lines) = util::read_input_lines_with_n("8");

    let mut results: Vec<String> = Vec::new(); // for validation purposes only
    let mut phone_book: HashMap<String, String> = HashMap::new();
    for (idx, line) in lines.iter().enumerate() {
        if idx < n {
            let mut tup = ("", "");
            for (i, s) in line.split_whitespace().enumerate() {
                if i == 0 {
                    tup.0 = &s;
                } else if i == 1 {
                    tup.1 = &s;
                }
            }
            phone_book.insert(tup.0.to_string(), tup.1.to_string());
        } else {
            let contact = phone_book.get(line);
            if let None = contact {
                results.push("Not found".to_string());
            } else {
                results.push(format!("{}={}", line, contact.unwrap()));
            }
        }
    }

    // Validate
    for (i, res) in results.iter().enumerate() {
        assert_eq!(res, expected_results.get(i).unwrap());
    }
}