function lets_review(input: String): void {
  let split_input = input.split("\n");

  for (var i = 1; i < split_input.length; i++) {
    var splitWord = split_input[i].split("");

    let even = "";
    let odd = "";

    for (var j = 0; j < splitWord.length; j++) {
      if (j % 2 === 0) {
        even = even + splitWord[j];
      } else {
        odd = odd + splitWord[j];
      }
    }
    console.log(even + " " + odd);
  }
}
