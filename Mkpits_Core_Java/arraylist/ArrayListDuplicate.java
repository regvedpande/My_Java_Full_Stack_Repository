import java.util.ArrayList;

public class ArrayListDuplicate {
    public static void main(String[] args) {
        ArrayList<Names> names = new ArrayList<>();
        names.add(new Names(1, "Regved"));
        names.add(new Names(2, "Ayush"));
        names.add(new Names(3, "Yogita"));
        names.add(new Names(4, "Regved"));
        names.add(new Names(5, "Gunjan"));

        names.get(3).setName("Jitu");

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

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}
