#include<stdio.h>
int main()
{
    int side1, side2,side3;
    printf("Enter the value of 3 sides of the Triangle : ");
    scanf("%d, %d, %d", &side1, &side2, &side3);
    if(side1 == side2 && side2 == side3 && side1 == side3)
        printf("Triangle is Equilateral"); 
    else if(side1 == side2 || side2 == side3 || side1 == side3 )
    
            printf("Triangle is Isosceles");
    else 
            printf("Triangle is Scalar Triangle");
        
return 0;
}