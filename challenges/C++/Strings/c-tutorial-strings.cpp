#include <iostream>
#include <string>
using namespace std;

int main() {
  // Complete the program
  string s, t;
  cin >> s >> t;
  cout << s.length() << " " << t.length() << endl;
  cout << s << t << endl;
  char f1 = s[0];
  s[0] = t[0];
  t[0] = f1;
  cout << s << " " << t << endl;
  return 0;
}
