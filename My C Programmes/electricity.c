#include <stdio.h>

int main() {
    float units, bill;

    printf("Enter the units consumed: ");
    scanf("%f", &units);

    if (units < 100) {
        bill = units * 0.25;
    } else if (units >= 100 && units < 200) {
        bill = 100 * 0.25 + (units - 100) * 1.25;
    } else if (units >= 200 && units < 300) {
        bill = 100 * 0.25 + 100 * 1.25 + (units - 200) * 1.75;
    } else {
        bill = 100 * 0.25 + 100 * 1.25 + 100 * 1.75 + (units - 300) * 2.25;
    }

    printf("Electricity Bill: $%.2f\n", bill);

    return 0;
}
