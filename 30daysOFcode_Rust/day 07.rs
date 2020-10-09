use super::util;

pub fn solution() {
    let expected_results = util::read_expected_results("7");
    let (n, lines) = util::read_input_lines_with_n("7");

    let line = lines.get(0);
    let integers: Vec<i32> = line.unwrap()
        .split_whitespace()
        .map(|s| s.parse().unwrap())
        .collect();

    let mut out = String::from("");
    for (i, _) in integers.iter().enumerate() {
        let idx = n - i - 1;
        out.push_str(&integers.get(idx).unwrap().to_string());
        out.push_str(" ");
    }

    assert_eq!(expected_results.get(0).unwrap(), &out.trim());
}
