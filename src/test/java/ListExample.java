import java.util.*;

public class ListExample {
    public static void main(String[] args){
        List<String> names = new ArrayList<String>();
        names.add("Navee");
        names.add("Aditi");
        names.add("Arun");
        names.add("Aditi");
        for(String s:names){
            System.out.println(s);
        }
    }

}
