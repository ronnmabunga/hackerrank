#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>


// Complete the following function.

int marks_summation(int *marks, int number_of_students, char gender) {
  int i = 0;
  if (gender == 'g')
    i++;
  int total = 0;
  while (i < number_of_students) {
    total += *(marks + i);
    i = i + 2;
  }
  return total;
}

int main() {
  int number_of_students;
  char gender;
  int sum;

  scanf("%d", &number_of_students);
  int *marks = (int *)malloc(number_of_students * sizeof(int));

  for (int student = 0; student < number_of_students; student++) {
    scanf("%d", (marks + student));
  }

  scanf(" %c", &gender);
  sum = marks_summation(marks, number_of_students, gender);
  printf("%d", sum);
  free(marks);

  return 0;
}