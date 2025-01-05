package FirstHW;

public class Main {
    public static void main(String[] args) {
        // Row অনুযায়ী লুপ
        for (int i = 1; i <= 4; i++) {  // মোট 4টি স্তম্ভের জন্য লুপ
            // Column অনুযায়ী লুপ
            for (int j = 1; j <= 20; j++) {  // মোট 20টি ঘরের মধ্যে J, A, V বসবে

                // J বসানোর জন্য শর্ত
                if (j == 1 || (i == 4 && j <= 3)) {
                    System.out.print("J ");
                }
                // A বসানোর জন্য শর্ত
                else if ((j >= 5 && j <= 10) &&
                        ((i == 4) || (i == 3 && (j == 6 || j == 9)) ||
                                (i == 2 && j == 7))) {
                    System.out.print("A ");
                }
                // V বসানোর জন্য শর্ত
                else if ((j >= 12 && j <= 17) &&
                        ((i == 4 && (j == 12 || j == 17)) ||
                                (i == 3 && (j == 13 || j == 16)) ||
                                (i == 2 && j == 14))) {
                    System.out.print("V ");
                }
                // ফাঁকা স্থান
                else {
                    System.out.print(" ");
                }
            }
            // এক লাইন শেষ হলে নতুন লাইনে যাবে
            System.out.println();
        }
    }
}
