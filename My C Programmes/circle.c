#include <stdio.h>

int main() {
  float radius, area;

  printf("Area of Circle is: ");
  fflush(stdout);
  scanf("%f", &radius);

  area = 3.14 * radius * radius;

  printf("Area of Circle is : %f ", area);
  fflush(stdout);

  return 0;
}
