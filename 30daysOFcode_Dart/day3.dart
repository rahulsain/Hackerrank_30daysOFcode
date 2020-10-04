import 'dart:io';

void main() {
  int n;

  n = int.parse(stdin.readLineSync());

  if (n % 2 == 0) {
    if ((n >= 2 && n <= 5) || n > 20)
      print("Not Weird\n");
    else
      print("Weird\n");
  } else
    print("Weird\n");
}
