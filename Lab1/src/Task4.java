import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введіть слова: ");
        String sentence = in.nextLine();

        System.out.println(sentence);

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char first = word.charAt(0);
            StringBuilder newword = new StringBuilder();

            newword.append(first);

            for (int j = 1; j < word.length(); j++) {
                char other = word.charAt(j);

                if (first != other)
                {
                    newword.append(other);
                }
            }

            words[i] = newword.toString();
        }

        String result = String.join(" ", words);

        System.out.println(result);
    }
}
