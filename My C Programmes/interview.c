#include <stdio.h>

int main() {
    int writtenTestMarks, interviewMarks;

    printf("Enter marks for the written test: ");
    scanf("%d", &writtenTestMarks);

    printf("Enter marks for the interview: ");
    scanf("%d", &interviewMarks);

    if (writtenTestMarks >= 50 && interviewMarks >= 50) {
        printf("Selected\n");
    } else {
        printf("Rejected\n");
    }

    return 0;
}
