#include <algorithm>
#include <cmath>
#include <cstdio>
#include <iostream>
#include <vector>

using namespace std;

int fact(int);
double negativeBinomial(int, int, double);

int main() {
  int num, denum, n;
  cin >> num >> denum >> n;
  double p = ((double)num / (double)denum);
  double q = 1.0 - p;
  printf("%.3lf", (pow(q, (n - 1)) * p));
  return 0;
}

int fact(int x) {
  if (x < 2)
    return 1;
  return fact(x - 1) * x;
}
double negativeBinomial(int n, int x, double p) {
  double q = 1.0 - p; // probability of failure
  double nmin1_by_xmin1 =
      (double)(fact(n - 1)) / (double)(fact(x - 1) * fact(n - x));
  double negb = nmin1_by_xmin1 * pow(q, x) * pow(p, (n - x));
  return negb;
}
