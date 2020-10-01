function main() {
  /*
     * Try using `eval`
     */
  var S = readLine();

  try {
    console.log(eval(S))
  } catch (e) {
    console.log('Bad String')
  }
}
