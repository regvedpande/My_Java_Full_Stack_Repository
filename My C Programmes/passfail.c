#include<stdio.h>
int main()
{
    int marks;

    printf("Enter the Marks : ");
    scanf("%d", &marks);

    if(marks >=50 ){
        printf("Passed");
    }else{
        printf("Fail");
    }
    return 0;
}