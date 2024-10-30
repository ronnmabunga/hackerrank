#include <algorithm>
#include <cmath>
#include <cstdio>
#include <iostream>
#include <vector>

using namespace std;

int fact(int);
double bernoulli(int, int, double);

int main() {
  double b, g; // ratio of boys to girls (b:g)
  cin >> b >> g;
  double p =
      (b / (b + g)); // probability of success (probability that it's a boy)
  int x = 3;         // minimum number of successes
  int n = 6;         // number of trials (no. of children to be born)
  double totalProb =
      0.0; // total probability from (min to max number of successes)
  for (int i = x; i <= n; i++) {
    totalProb += bernoulli(i, n, p);
  }
  printf("%.3lf", totalProb);
}

int fact(int x) {
  if (x < 2)
    return 1;
  return fact(x - 1) * x;
}

double bernoulli(int x, int n, double p) {
  double q = 1.0 - p; // probability of failure (probability that it's a girl)
  double n_by_x = (double)(fact(n)) / (double)(fact(x) * fact(n - x));
  double b = n_by_x * pow(p, x) * pow(q, (n - x));
  return b;
}
