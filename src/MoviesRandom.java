import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MoviesRandom {
    private int linesCount = 0;
    private final String[] moviesAll = new String[100];
    private char[] MovieSelected;

    MoviesRandom() {
        try {
            File file = new File("movies.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                moviesAll[linesCount] = line;

                System.out.println("Number of lines: " + linesCount + ": " + line);
                linesCount++;

            }

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }

    }

    public char[] getRandomMovie() {
        int movieIndex = (int) (Math.random() * linesCount - 1) + 1;
        System.out.println("The movie's title has been choosen");
        char[] result = moviesAll[movieIndex].toCharArray();
        MovieSelected = result.clone();
        return result;
    }

    public char[] getRandomMovie_() {
        char[] result = new char[MovieSelected.length];
        for (int i = 0; i < MovieSelected.length; i++) {
            if (MovieSelected[i] == ' ') {
                result[i] = ' ';
            } else {
                result[i] = '_';
            }

        }
        return result;
    }
}
