import java.util.ArrayList;
import java.util.Iterator; 
public class ArrayListWork {
    public static void main(String[] args) {
        
        ArrayList<Names> names =  new ArrayList<>(); 
        names.add(new Names(1, "Regved")); 
        names.add(new Names(2, "Ayush"));
        names.add(new Names(3, "Yogita"));
        names.add(new Names(4, "Delia"));
        names.add(new Names(5, "Gunjan"));

        Iterator<Names> iterate = names.iterator();
        System.out.println("\nList of the name are ");
        while (iterate.hasNext()) { 
            System.out.print(iterate.next() + " "); 
        }

        for (Names names2 : names) {
            System.out.println(names2);
        }
    }
}

