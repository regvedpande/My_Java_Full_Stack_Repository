#include <stdio.h>

int main() {
    int mark;
    
    printf("Enter the mark: ");
    scanf("%d", &mark);

    if (mark < 50) {
        printf("Grade: E\n");
    } else if (mark >= 50 && mark < 60) {
        printf("Grade: D\n");
    } else if (mark >= 60 && mark < 70) {
        printf("Grade: C\n");
    } else if (mark >= 70 && mark < 80) {
        printf("Grade: B\n");
    } else if (mark >= 80) {
        printf("Grade: A\n");
    } else {
        printf("Grade: Not Known\n");
    }

    return 0;
}
