#include<stdio.h>
int main()
{
    int number;

    printf("Enter the number: ");
    scanf("%d", &number);

    if(number %2 == 0)
    {
        printf("number is Even");

    }else{
        printf("number is Odd");
    }
    return 0;
}