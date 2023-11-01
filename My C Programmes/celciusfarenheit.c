#include <stdio.h>

int main() {
  int F, C;

  printf("Enter the temperature in Fahrenheit: ");
  scanf("%d", &F);

  C = (F - 32) * 5 / 9;

  printf("Temperature in Celcius is: %d\n", C);

  return 0;
}
