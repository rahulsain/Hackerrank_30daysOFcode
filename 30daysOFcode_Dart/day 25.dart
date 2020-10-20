import 'dart:io';
import 'dart:math';

bool isPrime(int n) {
  int root = sqrt(n).toInt();

  for (int i = 2; i <= root; i++) {
    if (n % i == 0) return false;
  }
  return true;
}

void main() {
  int T = int.parse(stdin.readLineSync());
  while (T > 0) {
    int n = int.parse(stdin.readLineSync());
    if (n >= 2 && isPrime(n)) {
      print('Prime');
    } else {
      print('Not Prime');
    }
    T--;
  }
}
