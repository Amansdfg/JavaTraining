import java.util.ArrayList;
public class TestArrayList {
    public static void main(String[] args){
        ArrayList<String> aman = new ArrayList<>();
        aman.add("Aman");
        aman.add("Ernar");
        aman.add("Sholpan");
        System.out.println(aman.size());
        System.out.println("Is aman in the list?"+aman.contains("Aman"));
        System.out.println("The location of the Ernar"+ aman.indexOf("Ernar"));
        System.out.println("Is the list empty?"+ aman.isEmpty());
        aman.add(1,"Olzha");
        aman.remove("Olzha");
        aman.remove(1);
        System.out.println(aman.toString());
        for(int i =aman.size()-1;i>=0;i--){
            System.out.print(aman.get(i)+ " ");
        }
        System.out.println();
    }
}
