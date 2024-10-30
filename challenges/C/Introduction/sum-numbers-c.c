#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
  int x1, x2;
  float y1, y2;
  scanf("%d", &x1);
  scanf("%d", &x2);
  scanf("%f", &y1);
  scanf("%f", &y2);
  printf("%d %d\n", (x1 + x2), (x1 - x2));
  printf("%.1f %.1f", (y1 + y2), (y1 - y2));

  return 0;
}
