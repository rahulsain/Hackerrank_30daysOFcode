import 'dart:io';

class Person {
  int age;
  Person(int initialAge) {
    age = initialAge;
    if (age < 0) {
      print("Age is not valid, setting age to 0.");
      age = 0;
    }
  }
  void amIOld() {
    if (age < 13)
      print("You are young.");
    else if (age >= 13 && age < 18)
      print("You are a teenager.");
    else
      print("You are old.");
  }

  void yearPasses() {
    age++;
  }
}

void main() {
  int test;
  test = int.parse(stdin.readLineSync());
  for (int t = 1; t <= test; t++) {
    int age;
    age = int.parse(stdin.readLineSync());
    Person p = new Person(age);
    p.amIOld();
    for (int j = 0; j < 3; j++) {
      p.yearPasses();
    }
    p.amIOld();
    print("");
  }
}
