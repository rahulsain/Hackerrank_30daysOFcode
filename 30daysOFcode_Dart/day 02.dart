import 'dart:io';

void main() {
  double meal_cost;
  int tipPercent, taxPercent;

  meal_cost = double.parse(stdin.readLineSync());
  tipPercent = int.parse(stdin.readLineSync());
  taxPercent = int.parse(stdin.readLineSync());

  double tip = (meal_cost * tipPercent) / 100.0;
  double tax = (meal_cost * taxPercent) / 100.0;

  double output = (meal_cost + tip + tax).roundToDouble();
  print(output);
}
