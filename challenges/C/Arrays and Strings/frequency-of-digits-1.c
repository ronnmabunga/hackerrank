#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main() {

  /* Enter your code here. Read input from STDIN. Print output to STDOUT */
  char s;
  int cnt[10] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
  while (scanf("%c", &s) == 1) {
    if (s >= '0' && s <= '9') {
      cnt[(s - '0')] = cnt[(s - '0')] + 1;
    }
  }
  for (int i = 0; i < 10; i++) {
    printf("%d ", cnt[i]);
  }
  return 0;
}
