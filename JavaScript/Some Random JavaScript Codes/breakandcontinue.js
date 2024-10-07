let list = 7;
do {
    console.log("You List is : ", list);
    list++;
    if (list==7) {
        break;
    }
} while (list < 5);

let list2 = 5;

while (list2 < 10) {
    if (list2 == 7) {
        list2++;
        continue;
    }
    console.log("Your list is : ", list2);
    list2++;
}

