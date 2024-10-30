#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Complete the following function.

void calculate_the_maximum(int n, int k) {
  // Write your code here.
  int maxAandB = 0;
  int maxAorB = 0;
  int maxAxorB = 0;
  int AandB = 0;
  int AorB = 0;
  int AxorB = 0;
  for (int a = 1; a < n; a++) {
    for (int b = a + 1; b <= n; b++) {
      AandB = a & b;
      AorB = a | b;
      AxorB = a ^ b;
      if (AandB > maxAandB) {
        if (AandB < k) {
          maxAandB = AandB;
        }
      }
      if (AorB > maxAorB) {
        if (AorB < k) {
          maxAorB = AorB;
        }
      }
      if (AxorB > maxAxorB) {
        if (AxorB < k) {
          maxAxorB = AxorB;
        }
      }
    }
  }
  printf("%d\n%d\n%d", maxAandB, maxAorB, maxAxorB);
}

int main() {
  int n, k;

  scanf("%d %d", &n, &k);
  calculate_the_maximum(n, k);

  return 0;
}
