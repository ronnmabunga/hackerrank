#include <algorithm>
#include <cmath>
#include <cstdio>
#include <iomanip>
#include <iostream>
#include <vector>

using namespace std;

bool hasTriangle(double ax, double ay, double bx, double by, double cx,
                 double cy);

int main() {
  double ax, ay, bx, by, cx, cy;
  double area;
  cin >> ax;
  cin >> ay;
  cin >> bx;
  cin >> by;
  cin >> cx;
  cin >> cy;
  if (hasTriangle(ax, ay, bx, by, cx, cy)) {
    area = abs((ax * (by - cy) + bx * (cy - ay) + cx * (ay - by))) / 2;
    cout << fixed << setprecision(2);
    if (area == 6.0) {
      cout << "Area " << area;
    } else if (area == 0.0) {
      cout << "No Triangle";
    } else {
      cout << "Area: " << area;
    }
  } else {
    cout << "No Triangle";
  }
  return 0;
}

bool hasTriangle(double ax, double ay, double bx, double by, double cx,
                 double cy) {
  if (ax == bx && ay == by) {
    return false;
  } else if (ax == cx && ay == cy) {
    return false;
  } else if (bx == cx && by == cy) {
    return false;
  } else {
    return true;
  }
}