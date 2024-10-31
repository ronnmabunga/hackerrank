#include <algorithm>
#include <cmath>
#include <cstdio>
#include <iostream>
#include <vector>

using namespace std;
int main() {
  int T;
  cin >> T;
  int N;
  long long minX;
  long long minY;
  long long inp;
  for (int i = 0; i < T; i++) {
    cin >> N;
    cin >> minX >> minY;
    for (int j = 1; j < N; j++) {
      cin >> inp;
      if (inp < minX) {
        minX = inp;
      }
      cin >> inp;
      if (inp < minY) {
        minY = inp;
      }
    }
    cout << (minX * minY) << endl;
    minX = 0LL;
    minY = 0LL;
  }
  return 0;
}
