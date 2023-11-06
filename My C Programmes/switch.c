#include<stdio.h>
int main()
{
    int day = 5;

    switch(day){
        case 1:
        printf("Day is Monday");
        break;

        case 2:
        printf("Day is Tuesday");
        break;

        case 3:
        printf("Day is Wednesday");
        break;

        case 4:
        printf("Day is Thursday");
        break;

        case 5:
        printf("Day is Friday");
        break;

        case 6:
        printf("Day is Saturday");
        break;

        case 7:
        printf("Day in Sunday");
        break;

        default:
        printf("Does not exist");
        break;
    }
}