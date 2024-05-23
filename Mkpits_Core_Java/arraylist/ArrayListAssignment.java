import java.util.ArrayList;

public class ArrayListAssignment {
    public static void main(String[] args) {
        ArrayList<Names> names =  new ArrayList<>(); 
        names.add(new Names(1, "Regved")); 
        names.add(new Names(2, "Ayush"));
        names.add(new Names(3, "Yogita"));
        names.add(new Names(4, "Regved"));
        names.add(new Names(5, "Gunjan"));

        ArrayList<Names> names2 =  new ArrayList<>(); 
        names2.add(new Names(1, "Darth Vader")); 
        names2.add(new Names(2, "Kang"));
        names2.add(new Names(3, "Doctor Dooom"));
        names2.add(new Names(4, "Galactus"));
        names2.add(new Names(5, "Poison Ivy"));

        names.addAll(names2);

        System.out.println("Printing all Elements");
        for (Names anotherName : names) {
            System.out.println(anotherName);
        }
    }
}

class Names {
    private int id;
    private String name;

    public Names(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}
