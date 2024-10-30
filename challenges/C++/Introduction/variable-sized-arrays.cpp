#include <algorithm>
#include <cmath>
#include <cstdio>
#include <iostream>
#include <sstream>
#include <vector>

using namespace std;

int main() {
  vector<vector<int>> v;
  int l, q, temp;
  int x, y;
  cin >> l >> q;
  string s;
  for (int i = 0; i < l; i++) {
    cin >> temp;
    getline(cin, s);
    stringstream ss(s);
    vector<int> d;
    while (ss >> temp) {
      d.push_back(temp);
    }
    v.push_back(d);
  }
  for (int i = 0; i < q; i++) {
    cin >> x >> y;
    cout << v.at(x).at(y) << endl;
  }
  return 0;
}
