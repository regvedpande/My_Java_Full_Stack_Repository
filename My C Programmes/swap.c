#include <stdio.h>

int main() {
  int a, b, c;

  printf("Enter the values of a, b, and c: ");
  scanf("%d %d %d", &a, &b, &c);

  int swap = a;
  a = b;
  b = swap;

  int swap = b;
  b = c;
  c = swap;

  printf("The swapped values of a, b, and c are %d %d %d respectively.\n", a, b, c);

  return 0;
}
