import java.util.*;
public class Iterator1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Nabeel");
        names.add("Ali");
        names.add("Ahmed");

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
