import 'dart:io';

void main() {
  String name = stdin.readLineSync();
  try {
    int converted_int = int.parse(name);
    print(converted_int);
  } catch (E) {
    print("Bad String");
  }
}
