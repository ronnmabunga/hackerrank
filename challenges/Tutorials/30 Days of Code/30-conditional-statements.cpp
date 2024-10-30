#include <bits/stdc++.h>

using namespace std;

int main() {
  int n;
  cin >> n;
  cin.ignore(numeric_limits<streamsize>::max(), '\n');
  // If  is odd, print Weird
  // If  is even and in the inclusive range of  to , print Not Weird
  // If  is even and in the inclusive range of  to , print Weird
  // If  is even and greater than , print Not Weird
  if (n % 2 == 1) {
    cout << "Weird";
  } else {
    if (n >= 2 && n <= 5) {
      cout << "Not Weird";
    } else if (n >= 6 && n <= 20) {
      cout << "Weird";
    } else if (n > 20) {
      cout << "Not Weird";
    }
  }
  return 0;
}
