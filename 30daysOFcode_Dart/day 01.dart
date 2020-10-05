import 'dart:io';

void main() {
  int i = 4;
  double d = 4.0;
  String s = "HackerRank ";

  int a;
  double b;
  String c;
  a = int.parse(stdin.readLineSync());
  b = double.parse(stdin.readLineSync());
  c = stdin.readLineSync();

  print(i + a);
  print((d + b).toStringAsFixed(1));
  print(s + c);
}
