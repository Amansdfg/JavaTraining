import java.util.ArrayList;
public class FindError11_32 {
    public static void main(String[] args){
           ArrayList<String> aman =new ArrayList<>();
           aman.add("Dallas");
           aman.add("Dallas");
           aman.add("Houston");
           aman.add("Dallas");
           aman.remove("Dallas");
           System.out.println(aman.toString());
           for(String word:aman) {
               System.out.print(word+ " ");
           }
           System.out.println();
           for(int i =0;i<aman.size();i++){
               aman.remove("Dallas");
           }
           for(String aman1 : aman){
               System.out.print(aman1+ " ");
           }
    }
}
