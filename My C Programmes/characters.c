#include<stdio.h>
int main()
{
    char c;
    printf("Enter the single character:");
    scanf("%c", &c);
    if(c>=65 && c<=90)
    {
        printf("Capital letters");
    }
    else if (c>=97 && c<=122)
    {
        printf("Small Letter");
    }
    else if(c>=48 && c<=57) 
    {
        printf("It is numeric digit");
        
    }
    else
    {
    printf("It is Special Symbol");
    }
 
}