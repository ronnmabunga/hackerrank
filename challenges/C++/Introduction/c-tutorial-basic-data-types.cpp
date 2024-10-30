#include <cstdio>
#include <iostream>

using namespace std;

int main() {
  // Complete the code.
  int d;
  long ld;
  char c;
  float f;
  double lf;
  scanf("%d %ld %c %f %lf", &d, &ld, &c, &f, &lf);
  printf("%d\n%ld\n%c\n%.2f\n%.5lf", d, ld, c, f, lf);
  return 0;
}
