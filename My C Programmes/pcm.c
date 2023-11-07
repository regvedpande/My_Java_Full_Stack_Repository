#include <stdio.h>

int main() {
    int physics, chemistry, math;
    float average;

    printf("Enter Physics marks: ");
    scanf("%d", &physics);

    printf("Enter Chemistry marks: ");
    scanf("%d", &chemistry);

    printf("Enter Mathematics marks: ");
    scanf("%d", &math);

    average = (physics + chemistry + math) / 3.0; 

    if (physics >= 50 && chemistry >= 50 && math >= 50 || average >= 60) {
        printf("Pass\n");
    } else {
        printf("Fail\n");
    }

    return 0;
}
