import java.io.File;
import java.util.Scanner;

public class GuessTheMovie {
    public static void main(String[] args) throws Exception {

        File file = new File("movies.txt");
        Scanner scanner = new Scanner(file);

        int linesCount = 0;

        String[] moviesAll = new String[100];

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            moviesAll[linesCount] = line;
            //           System.out.println(line);
            System.out.println("Number of lines: " + linesCount + ": " + line);
            linesCount++;

        }

        MoviesRandom mr = new MoviesRandom();
        char[] rmMovie = mr.getRandomMovie();
        char[] rmMovie_ = mr.getRandomMovie_();
        System.out.println("!!!!: " + String.valueOf(rmMovie));
        System.out.println("!!!!: " + String.valueOf(rmMovie_));

        Game game = new Game(rmMovie, rmMovie_);


//        int movieIndex = (int) (Math.random() * linesCount - 1) + 1;
//        System.out.println("The movie's title has been choosen");
//
//        System.out.println("Wylosowano film nr: " + movieIndex);
//        char[] movieTitleSelected = moviesAll[movieIndex].toCharArray();
//        System.out.println("Tytuł wylosowanego filmu: " + String.valueOf(movieTitleSelected));
//        char[] movieTitle_ = new char[movieTitleSelected.length];
//        for (int i = 0; i < movieTitleSelected.length; i++) {
//            if (movieTitleSelected[i] == ' ') {
//                movieTitle_[i] = ' ';
//            } else {
//                movieTitle_[i] = '_';
//            }
//        }
//        System.out.println("Zmieniony tytuł: " + String.valueOf(movieTitle_));
//
//        int Count = 0;
//        while ((Count < 10) || (movieTitle_ == movieTitleSelected)) {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Podaj literę: ");
//            String str = input.next().toString().toLowerCase();
//            char charSelected = (char) str.charAt(0);
//
//            for (int i = 0; i < movieTitleSelected.length; i++) {
//                if (movieTitleSelected[i] == charSelected) {
//                    movieTitle_[i] = charSelected;
//                }
//            }
//
//            System.out.println("Licznik: " + Count++);
//            System.out.println(movieTitle_);
//        }
    }

}
