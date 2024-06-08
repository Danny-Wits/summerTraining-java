package c2.q4;

import java.util.Scanner;

public class testD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String text = scanner.nextLine();
        String word="";
        for (int i = 0; i < text.length(); i++) {
             char c = text.charAt(i);
             if(Character.isLetter(c)){
                word+=c;
             }else{
                if(!word.equals("")){
                    System.out.println(word);
                    word="";
                }
             }
        }
        scanner.close();
    }
}
