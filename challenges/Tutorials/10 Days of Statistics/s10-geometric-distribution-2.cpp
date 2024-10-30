#include <algorithm>
#include <cmath>
#include <cstdio>
#include <iostream>
#include <vector>

using namespace std;

double cumulative(int, int, double);
int fact(int);
double geomDist(int, double);

int main() {
  int num, denum, n;
  cin >> num >> denum >> n;
  double p = ((double)num / (double)denum);
  printf("%.3lf", cumulative(1, n, p));
  return 0;
}

double cumulative(int a, int b, double p) {
  double total = 0.0;
  for (int i = a; i <= b; i++) {
    total += geomDist(i, p);
  }
  return total;
}
int fact(int x) {
  if (x < 2)
    return 1;
  return fact(x - 1) * x;
}

double geomDist(int x, double p) {
  double q = 1.0 - p;
  return (pow(q, (x - 1)) * p);
}
