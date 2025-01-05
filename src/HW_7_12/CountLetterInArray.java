package HW_7_12;

import Method.TestRandomCharacter;

public class CountLetterInArray {
    public static void main(String[] args) {
        char[] chars = createArray();
        System.out.println("The LowerCase Letters are");
        displayArray(chars);

        int[] counts = countLetters(chars);

        System.out.println();
        System.out.println("The occurrences of each letter are");
        displayCounts(counts);
    }

    public static char[] createArray() {
        char[] chars = new char[100];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = TestRandomCharacter.getRandomLowerCaseLetter();
        }

        return chars;
    }

    public static void displayArray(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
            if ((i + 1) % 20 == 0){
                System.out.println();
            }
        }
    }

    public static int[] countLetters(char[] chars) {
        int[] counts = new int[26];

        for (int i = 0; i < chars.length; i++) {
            counts[chars[i] - 'a']++;
        }
        return counts;
    }

    public static void displayCounts(int[] counts) {
        for (int i = 1; i < counts.length; i++) {
            System.out.printf("%c: %d\t", (char) (i + 'a'), counts[i]);
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
    }


}
