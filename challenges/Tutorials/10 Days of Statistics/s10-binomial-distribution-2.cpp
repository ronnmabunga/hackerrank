#include <algorithm>
#include <cmath>
#include <cstdio>
#include <iostream>
#include <vector>

using namespace std;

double bernoulli(int, int, double);
void cumulative(int, int, int, double);
int fact(int);

int main() {
  int pint;
  int n; // number of trials
  cin >> pint >> n;
  double p =
      pint / 100.0; // probability of success (probability that it's a boy),
  int a1 = 0;
  int b1 = 2; // No more than 2 rejects (from 0 rejects to 2 rejects)
  int a2 = 2;
  int b2 = 10; // At least 2 rejects (from 2 rejects to 10 rejects)
  cumulative(a1, b1, n, p);
  cumulative(a2, b2, n, p);
}

double bernoulli(int x, int n, double p) {
  double q = 1.0 - p; // probability of failure
  double n_by_x = (double)(fact(n)) / (double)(fact(x) * fact(n - x));
  double b = n_by_x * pow(p, x) * pow(q, (n - x));
  return b;
}

void cumulative(int a, int b, int n, double p) {
  double totalProb =
      0.0; // total probability from (min to max number of successes)
  for (int i = a; i <= b; i++) {
    totalProb += bernoulli(i, n, p);
  }
  printf("%.3lf\n", totalProb);
}

int fact(int x) {
  if (x < 2)
    return 1;
  return fact(x - 1) * x;
}
