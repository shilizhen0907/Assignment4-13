import java.util.Scanner;

public class CheckVowelOrConsonant {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Prompt the user to enter a letter
        System.out.print("Enter a letter: ");
        String s = input.nextLine();

        //check if the user enters a letter or more
        if (s.length() == 1) {
            //read a character from consele
            char ch = s.charAt(0);  
            // check if the entered character is a letter 
            if (Character.isLetter(ch)) {
                /*if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){ */
                    //check if the letter is vowels
                    if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                        ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        System.out.println(ch + " is a vowel");
                        }
                    else {
                        System.out.println(ch + " is a consonant");
                    }
                }
            else {
                    System.out.println(ch + " is an invalid input");
            }

        } 
        else {
            System.out.println(s + " is an invalid input");
        }
    } 
}
