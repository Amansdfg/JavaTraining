import java.util.ArrayList;
public class FindError11_31 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Denver");
        list.add("Austin");
        String city = list.get(0);
        list.set(1, "Dallas");
        System.out.println(list.get(2));
        System.out.println(city);
    }
}
