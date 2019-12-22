import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<String> setObj = new HashSet<>();
        setObj.add("Chair");
        setObj.add("Sofa");
        setObj.add("Table");
        setObj.add("Carpet");
        setObj.add("Light");

        System.out.println("HashSet: " + setObj);
        Set<String> hashSetToTreeSet = new TreeSet<>(setObj);
        System.out.println("TreeSet: " + hashSetToTreeSet);
    }
}
