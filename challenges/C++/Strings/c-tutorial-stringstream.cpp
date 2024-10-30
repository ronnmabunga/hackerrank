#include <iostream>
#include <sstream>
#include <vector>

using namespace std;

vector<int> parseInts(string str) {
  // Complete this function
  vector<int> v;
  char ch;
  int temp;
  stringstream ss(str);
  while (ss >> temp) {
    v.push_back(temp);
    ss >> ch;
  }

  return v;
}

int main() {
  string str;
  cin >> str;
  vector<int> integers = parseInts(str);
  for (int i = 0; i < integers.size(); i++) {
    cout << integers[i] << "\n";
  }

  return 0;
}
