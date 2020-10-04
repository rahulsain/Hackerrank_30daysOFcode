import 'dart:io';

void main() {
  int n;

  n = int.parse(stdin.readLineSync());

  for (int i = 1; i <= 10; i++) {
    int multiple = n * i;
    print("$n x $i = $multiple\n");
  }
}
