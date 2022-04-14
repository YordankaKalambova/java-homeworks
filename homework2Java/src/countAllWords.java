import java.util.Scanner;
//Task 4
public class countAllWords {
    static int countWords(String allWords) {
        int numberOfWords = 1;
        for (int i = 0; i < allWords.length(); i++) {
            if (allWords.charAt(i) == ' ') {
                numberOfWords++;

            }
        }
        return numberOfWords;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = sc.nextLine();
        System.out.println(countWords(arr));
    }
}
