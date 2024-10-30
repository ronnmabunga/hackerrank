#include <algorithm>
#include <cmath>
#include <cstdio>
#include <iostream>
#include <vector>

using namespace std;

/*
    add code for struct here.
*/
struct Student {
  int age;
  string first_name;
  string last_name;
  int standard;
};

int main() {
  Student st;

  cin >> st.age >> st.first_name >> st.last_name >> st.standard;
  cout << st.age << " " << st.first_name << " " << st.last_name << " "
       << st.standard;

  return 0;
}
