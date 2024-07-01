public class CountLettersInArray{
    public static void main(String[] args){
        char[] chars= createChars();
        displayArray(chars);
        int[] counts = createCounts(chars);
        System.out.println();
        displayCounts(counts);
    }
    public static char[] createChars(){
        char[] chars=new char[100];
        for(int i =0;i<chars.length;i++){
            chars[i]= RandomCharacter.getRandomLowerCase();
        }
        return chars;
    }public static void displayArray(char[] chars){
        for(int i =0;i<chars.length;i++){
            if((i+1)%20==0){
                System.out.println(chars[i]);
            }else{
                System.out.print(chars[i]+" ");
            }
        }
    }
    public static int[] createCounts(char[] chars){
        int[] counts = new int[26];
        for(int i =0;i<chars.length;i++){
            counts[chars[i]-'a']++;
        }return counts;
    }public static void displayCounts(int[] counts){
       for(int i=0;i<counts.length;i++){
           if((i+1)%10==0){
               System.out.println(counts[i]+ " "+ (char)(i+'a'));
           }else{
               System.out.print(counts[i]+" "+ (char)(i+'a')+" ");
           }
       }
    }
}