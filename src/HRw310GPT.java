
    import java.util.Scanner;

    public class HRw310GPT {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String text = input.nextLine();
            String name = "";
            int correct = 0;
            int index = text.indexOf(" ");
            String word1 = text.substring(0, index);
            String word2 = text.substring(index + 1);

            if (word1.contains(word2)) {
                for (int i = 0; i <= word1.length() - word2.length(); i++) {
                    String subString = word1.substring(i, i + word2.length());
                    if (subString.equals(word2)) {
                        correct++;
                    }
                }

                if (correct == 1) {
                    System.out.println("1");
                } else {
                    System.out.println("2+");
                }
            } else {
                System.out.println("0");
            }
        }
    }


