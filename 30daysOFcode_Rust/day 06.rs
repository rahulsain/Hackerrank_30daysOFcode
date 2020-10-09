pub fn solution() {
    let s = process("Hacker");
    println!("{}", s);
    assert_eq!(s, "Hce akr");

    let s = process("Rank");
    println!("{}", s);
    assert_eq!(s, "Rn ak");
}

fn process(text: &str) -> String {
    let mut even_chars: String = String::from("");
    let mut odd_chars: String = String::from("");

    for (idx, ch) in text.char_indices() {
        if (idx + 1) % 2 == 0 {
            even_chars.push(ch);
        } else {
            odd_chars.push(ch);
        }
    }

    return format!("{} {}", odd_chars, even_chars);
}
