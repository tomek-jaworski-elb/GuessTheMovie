import java.util.Scanner;

public class Game {

    private int counter = 0;
    private char[] movie;
    private char[] movie_;
    int wrongIndex = 0;
    char[] wrongChars = new char[20];

    Game(char[] movie, char[] movie_) {

        while ((wrongIndex < 5)) {
//            System.out.println(movie.length);
//            System.out.println(movie_.length);

            System.out.print("Wprowadż literę (Ilość błędów: " + wrongIndex + "): ");
            Scanner input = new Scanner(System.in);
            char charSelected = input.next().toString().toLowerCase().charAt(0);
            if (String.valueOf(movie).indexOf(charSelected) != -1) {
                for (int i = 0; i < movie.length; i++) {
                    if (movie[i] == charSelected) {
                        movie_[i] = charSelected;
                    }
                }
            } else {
                wrongChars[wrongIndex] = charSelected;
                wrongIndex++;
            }

//            System.out.println("Licznik: " + counter++);
            System.out.println("Licznik: " + counter++);
            System.out.println(movie_);
            System.out.println("Złe litery:" + WrongLetters());


            if (Is_Eqists(movie_)) {
                System.out.println("Brawo. Zgladełeś!");
                break;
            }
        }

        if (wrongIndex >= 5) {
            System.out.println("Przegrałeś! Własciwy tytul to: " + String.valueOf(movie));
        }
    }

    private String WrongLetters() {
        String result = "";
        for (int i = 0; i < wrongIndex; i++) {
            result += String.valueOf(wrongChars[i]);
            result += ", ";
        }
        return result;
    }

    private boolean Is_Eqists(char[] x) {
        boolean result = true;
        String s = String.valueOf(x);
        if (s.indexOf('_') != -1) {
            result = false;
        }
        return result;
    }


}
