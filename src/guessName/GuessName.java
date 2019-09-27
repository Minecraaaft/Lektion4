package guessName;

import java.util.Scanner;

public class GuessName {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String guess = scanner.next();
        String name = "Jens";
        char[] nameChars = name.toCharArray();
        char[] guessChars = guess.toCharArray();

        /*do {
            if (guess == name) {
                System.out.println("Correct!");
            } else {
                for (int i = 0; i < nameChars.length; i++) {
                    //if () //skal bruge ASCII numre
                }



            }
        }*/

    }

    /*do {
        if (guess != name) {

        }
    }*/

}
