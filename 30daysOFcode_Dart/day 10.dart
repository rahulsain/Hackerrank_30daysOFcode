import 'dart:io';

void main() {
  int n = int.parse(stdin.readLineSync());
  int rem = 0;
  int s = 0;
  int t = 0;

  while (n > 0) {
    rem = n % 2;
    n = n ~/ 2;
    if (rem == 1) {
      s = s + 1;
      if (s >= t) {
        t = s;
      }
    } else {
      s = 0;
    }
  }

  print(t);
}
