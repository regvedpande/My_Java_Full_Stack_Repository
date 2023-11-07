#include <stdio.h>

int main() {
  int side1, side2, side3;

  printf("Enter the value of 3 sides of the Triangle: ");
  scanf("%d, %d, %d", &side1, &side2, &side3);

  // Check if the triangle is equilateral.
  if (side1 == side2 && side2 == side3 && side1 == side3) {
    printf("Triangle is Equilateral");
    return 0;
  }

  // Check if the triangle is isosceles.
  if (side1 == side2 || side2 == side3 || side1 == side3) {
    printf("Triangle is Isosceles");
    return 0;
  }

  // Otherwise, the triangle is scalene.
  printf("Triangle is Scalene");

  return 0;
}
