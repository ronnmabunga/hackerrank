#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main() {
  char ch;
  char s[100];
  scanf("%c %s", &ch, &s);
  printf("%c\n%s", ch, s);
  scanf("\n", s);
  scanf("%[^\n]%*c", s);
  printf("\n%s", s);
  /* Enter your code here. Read input from STDIN. Print output to STDOUT */
  return 0;
}
