#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main() {

  char *s;
  s = malloc(1024 * sizeof(char));
  scanf("%[^\n]", s);
  s = realloc(s, strlen(s) + 1);
  // Write your logic to print the tokens of the sentence here.
  char *t = strtok(s, " ");
  while (t != NULL) {
    printf("%s\n", t);
    t = strtok(NULL, " ");
  }
  return 0;
}
