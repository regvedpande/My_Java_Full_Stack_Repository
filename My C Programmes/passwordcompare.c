#include <stdio.h>

int main() {
    char name[50]; 
    char email[50];
    char mobile[10];
    char userid[50];
    int value;
    int password[20];
    int confirmpassword[20];

    printf("Enter the Name: ");
    scanf("%s", name); 
    printf("Your name is : %s", name);

    printf("\nEnter your Email: ");
    scanf("%s", email); 
    printf("Your email is : %s", email);

    printf("\nEnter your Mobile Number: ");
    scanf("%s", mobile); 
    printf("Your Mobile Number is : %s", mobile);

    printf("\nEnter your userid: ");
    scanf("%s", userid); 
    printf("Your userid is : %s", userid);

    printf("\nEnter your password: ");
    scanf("%s", password); 
    printf("Your password is : %s", password);

    printf("\nEnter your Confirmed Password: ");
    scanf("%s", confirmpassword); 
    printf("Your confirmed password is : %s", confirmpassword);

    value = strcmp(password,confirmpassword); 
    if (value == 0){
        printf("Welcome");
    }else {
        printf("\ncheck your password");
    }
    return 0;

}