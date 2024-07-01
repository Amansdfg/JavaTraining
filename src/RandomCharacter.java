public class RandomCharacter{
    public static void main(String[] args){
        System.out.println(getRandomCharacter());
        System.out.println(getRandomDigit());
        System.out.println(getRandomUpperCase());
        System.out.println(getRandomLowerCase());
    }
    public static char getRandomCharacter(int ch1 , int ch2){
        return (char)(ch1 + Math.random() * (ch2 - ch1 +1));
    }
    public static char getRandomDigit(){
        return getRandomCharacter('0','9');
    }
    public static char getRandomLowerCase(){
        return getRandomCharacter('a','z');
    }
    public static char getRandomUpperCase(){
        return getRandomCharacter('A','Z');
    }
    public static char getRandomCharacter(){
        return getRandomCharacter('\u0000','\uFFFF');
    }
}