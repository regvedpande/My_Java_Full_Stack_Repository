#include <stdio.h>
#include <string.h>

int main() {
    char name[50]; 
    char email[50];
    char mobile[10];
    char userid[50];
    int value;
    char password[20];
    char confirmpassword[20];

    printf("Enter the Name: ");
    scanf("%s", name); 
    printf("Your name is : %s\n", name);

    printf("Enter your Email: ");
    scanf("%s", email); 
    printf("Your email is : %s\n", email);

    printf("Enter your Mobile Number: ");
    scanf("%s", mobile); 
    printf("Your Mobile Number is : %s\n", mobile);

    printf("Enter your userid: ");
    scanf("%s", userid); 
    printf("Your userid is : %s\n", userid);

    printf("Enter your password: ");
    scanf("%s", password); 
    printf("Your password is : %s\n", password);

    printf("Enter your Confirmed Password: ");
    scanf("%s", confirmpassword); 
    printf("Your confirmed password is : %s\n", confirmpassword);

    if (strcmp(userid, "mkpits") == 0) {
        printf("Welcome!\n");
    } else {
        printf("Wrong userid.\n");
    }

    if (strcmp(password, confirmpassword) == 0) {
        printf("Welcome!\n");
    } else {
        printf("Passwords don't match.\n");
    }

    return 0;
}
