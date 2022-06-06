import java.util.*;

public class SetExample {
    public static void main(String[] args){
        Set<String> names = new HashSet<String>();
        names.add("Navee");
        names.add("Aditi");
        names.add("Arun");
        names.add("Aditi");
        for(String s:names){
            System.out.println(s);
        }
    }
}
