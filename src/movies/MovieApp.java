package movies;
import utilities.OOValidator;

import java.util.Collections;

public class MovieApp {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            MovieIO.getMovie(i);
        }
        if(OOValidator.continueDoing("Would you like to add a movie?")) {
            do {
                String title = OOValidator.getString("What is the title of the movie?");
                listCategories();
                int categoryIndex = OOValidator.getIntWithinRange("What category is the movie?", 1, Movie.categoryArray.length) - 1;
                String category = Movie.categoryArray[categoryIndex];
                new Movie(title, category);
            } while (OOValidator.continueDoing("Would you like to continue adding movies?"));
        }
        do {
            listCategories();
            int categorySortInt = OOValidator.getIntWithinRange("What category would you like to sort by?", 1, Movie.categoryArray.length) - 1;
            String categorySort = Movie.categoryArray[categorySortInt];
            sortMovies(categorySort);
        } while (OOValidator.continueDoing("Would you like to sort again?"));
        System.out.println("Goodbye!");
    }

    private static void listCategories() {
        System.out.println("Categories:");
        for (int i = 0; i < Movie.categoryArray.length; i++) {
            System.out.println("[" + (i+1) + "] " + Movie.categoryArray[i]);
        }
    }

    private static void sortMovies(String categorySort){
        System.out.println("Listing all " + categorySort + " movies.");
        Collections.sort(Movie.movieList, new titleComparator());
        for (int i = 0; i < Movie.movieList.size(); i++) {
            if(Movie.movieList.get(i).category.equals(categorySort)){
                System.out.println(Movie.movieList.get(i).title);
            }
        }
    }
}
