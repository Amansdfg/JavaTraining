import java.util.ArrayList;
public class ArrayList2D {
    public static void main(String[] args){
        ArrayList<ArrayList<String>> groceryStore = new ArrayList<>();
        ArrayList<String>  drinks = new ArrayList<>();
        drinks.add("Cola");
        drinks.add("Juice");
        drinks.add("Water");
        ArrayList<String> fastFood = new ArrayList<>();
        fastFood.add("Hambuger");
        fastFood.add("Sushi");
        fastFood.add("Aman");
        ArrayList<String> bakeryFood = new ArrayList<>();
        bakeryFood.add("Bread");
        bakeryFood.add("Pasta");
        groceryStore.add(drinks);
        groceryStore.add(fastFood);
        groceryStore.add(bakeryFood);
        System.out.println(groceryStore);
        System.out.println(groceryStore.get(0));
        System.out.println(groceryStore.get(0).get(0));
        for(ArrayList<String> i: groceryStore){
            System.out.println(i);
        }
        for(ArrayList<String> i : groceryStore){
            for(String j: i){
                System.out.println(j);
            }
        }
    }
}
