#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main() {
  int n;
  scanf("%d", &n);
  // Complete the code to print the pattern.
  for (int i = 0; i < n * 2 - 1; i++) {
    for (int j = 0; j < n * 2 - 1; j++) {
      if (i + j < 2 * n - 1) {
        if (i < j) {
          printf("%d ", n - i);
        } else {
          printf("%d ", n - j);
        }
      } else {
        if (i > j) {
          printf("%d ", i - n + 2);
        } else {
          printf("%d ", j - n + 2);
        }
      }
    }
    printf("\n");
  }
  return 0;
}
