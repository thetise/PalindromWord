package StringHomeworks;

import java.util.Scanner;

public class PalindromWord {
    public static void main(String[] args) {
        System.out.println("Çıkmak için 'exit' yazınız.");
        while (true) {
            String reverese = "";
            System.out.print("Kelime girin : ");
            Scanner inp = new Scanner(System.in);
            String word = inp.nextLine();
            if (word.equals("exit")){
                break;
            }
            for (int i = word.length() - 1; i >= 0; i--) {
                reverese += word.charAt(i);
            }
            System.out.print("Sonuç : ");
            if (word.equals(reverese)) {
                System.out.println("Palindrom");
            } else {
                System.out.println("Palindrom degil!!");
            }

        }
    }
}