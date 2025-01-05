package HW_7_12;

import java.util.Random;

public class CountsLetterGpt {
    public static void main(String[] args) {
        // র‍্যান্ডম অক্ষর সমৃদ্ধ অ্যারে তৈরি করা
        char[] chars = createArray();

        // অ্যারেটি প্রিন্ট করা
        System.out.println("The generated array is:");
        displayArray(chars);

        // প্রতিটি অক্ষরের সংখ্যা গণনা করা
        int[] counts = countLetters(chars);

        // গণনার ফলাফল প্রিন্ট করা
        System.out.println("\nLetter counts:");
        displayCounts(counts);
    }

    // র‍্যান্ডম ছোট হাতের অক্ষর দিয়ে একটি অ্যারে তৈরি করা
    public static char[] createArray() {
        char[] chars = new char[100]; // ১০০ স্লটের একটি অ্যারে তৈরি
        Random random = new Random();

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ('a' + random.nextInt(26)); // a-z এর মধ্যে একটি র‍্যান্ডম অক্ষর
        }

        return chars;
    }

    // অ্যারেটি প্রিন্ট করা
    public static void displayArray(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
            if ((i + 1) % 20 == 0) { // প্রতি ২০টি অক্ষরের পরে নতুন লাইন শুরু
                System.out.println();
            }
        }
    }

    // অ্যারেতে প্রতিটি অক্ষরের সংখ্যা গণনা করা
    public static int[] countLetters(char[] chars) {
        int[] counts = new int[26]; // a-z এর জন্য ২৬টি স্লট
        for (char c : chars) {
            counts[c - 'a']++; // অক্ষরের জন্য গণনা বৃদ্ধি
        }
        return counts;
    }

    // প্রতিটি অক্ষরের সংখ্যা প্রিন্ট করা
    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            System.out.printf("%c: %d\t", (char) (i + 'a'), counts[i]);
            if ((i + 1) % 5 == 0) { // প্রতি ৫টি অক্ষরের পরে নতুন লাইন শুরু
                System.out.println();
            }
        }
    }
}
