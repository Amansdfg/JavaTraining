public class DeckOfCards2 {
    public static void main(String[] args){
        int[] deck = new int[36];
        String[] suits ={"Spades" , "Hearts","Diamond","Clubs"};
        String[] ranks ={"Ace","6","7","8","9","10","Jack","Queen","King",};
        for(int i = 0;i < deck.length; i++){
            deck[i] = i;
        }
        for(int i = 0; i<5;i++){
            int cardNumber = (int)(Math.random() * deck.length);
            String suit = suits[cardNumber / 9];
            String rank = ranks[cardNumber % 9];
            System.out.println("Card number "+ cardNumber + ": " +rank+ " of "+ suit);
        }
    }
}
//public class DeckOfCards{
//    public static void main(String[] args){
//        int[] deck = new int[52];
//        String[] suits = {"Spades","Hearts","Diamond","clubs"};
//        String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
//        for(int i= 0;i<deck.length;i++){
//            deck[i]= i;
//        }
//        for(int i =0;i< deck.length;i++) {
//            int index = (int) (Math.random() * deck.length);
//            int temp = deck[i];
//            deck[i] = deck[index];
//            deck[index] = temp;
//        }
//        for(int i = 0;i < 5;i++){
//            String suit = suits[deck[i] / 13];
//            String rank = ranks[deck[i] % 13];
//            System.out.println("Card number " + deck[i] +": "+ rank + " of " + suit);
//        }
//    }
//}