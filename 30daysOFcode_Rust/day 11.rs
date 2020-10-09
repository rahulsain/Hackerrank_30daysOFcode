use super::util;

pub fn solution() {
    let expected_results = util::read_expected_results("11");
    let lines = util::read_input_lines("11");

//    let mut array_6x6: [[i8; 6]; 6] = [[0; 6]; 6];
    const N: usize = 6; // columns
    const M: usize = 6; // rows

    let mut array_2d = [[0 as i8; N]; M];

    for (i, line) in lines.iter().enumerate() {
        let numbers: Vec<i8> = line
            .split_whitespace()
            .map(|s| s.parse().unwrap())
            .collect();

        for (j, n) in numbers.iter().enumerate() {
            array_2d[i][j] = *n;
        }
    }

    let mut max = -9 * 7;
    for i in 0..4 {
        for j in 0..4 {
            let tmp = array_2d[i][j] + array_2d[i][j+1] + array_2d[i][j+2] +
                array_2d[i+1][j+1] +
                array_2d[i+2][j] + array_2d[i+2][j+1] + array_2d[i+2][j+2];
            if tmp > max {
                max = tmp;
            }
        }
    }

    assert_eq!(&max.to_string(), expected_results.get(0).unwrap());
}
