#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main() {
  int n;
  scanf("%d", &n);
  int arr[n];
  for (int i = 0; i < n; i++) {
    scanf("%d", &arr[i]);
  }
  int total = 0;
  for (int i = 0; i < n; i++) {
    total += arr[i];
  }
  printf("%d", total);
  /* Enter your code here. Read input from STDIN. Print output to STDOUT */
  return 0;
}
