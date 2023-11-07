#include<stdio.h>
int main ()
{
    int angle1,angle2,angle3, sum;
    printf("Enter the 3 sides: ");
    scanf("%d %d %d", &angle1, &angle2, &angle3);
    sum = angle1 + angle2 + angle3;

    if (sum < 180) {
    printf("It forms a triangle")
    }else {
    printf("It doesn't form a triangle");
    };

  return 0;
}