#include<stdio.h>
int main()
{ 
    int i;
    printf("Enter the Number: ");
    scanf("%d", &i);

    while(i<=10)
    {
         printf("%d", i);
         i++;
    }
    printf("\n");
    return 0;
}