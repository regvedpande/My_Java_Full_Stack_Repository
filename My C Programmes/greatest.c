#include <stdio.h>

int main() {
    int num1, num2, num3;

    printf("Enter the first number: ");
    scanf("%d", &num1);

    printf("Enter the second number: ");
    scanf("%d", &num2);

    printf("Enter the third number: ");
    scanf("%d", &num3);

    if (num1 >= num2 && num1 >= num3) {
        printf("The greatest number is %d\n", num1);
    } else if (num2 >= num1 && num2 >= num3) {
        printf("The greatest number is %d\n", num2);
    } else {
        printf("The greatest number is %d\n", num3);
    }

    return 0;
}
