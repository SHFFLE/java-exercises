package movies;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Movie {
    static List<Movie> movieList = new ArrayList<>();
    static String[] categoryArray = {"animated", "comedy", "drama", "horror", "musical", "scifi"};
    String title;
    String category;

    Movie(String title, String category){
        this.title = title;
        this.category = category;
        movieList.add(this);
    }
}

class titleComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie a, Movie b){
        int toReturn = 0;
        for (int i = 0; i < a.title.length() && i < b.title.length(); i++) {
            if (a.title.charAt(i) > b.title.charAt(i)) {
                toReturn = 1;
                break;
            } else if (a.title.charAt(i) < b.title.charAt(i)) {
                toReturn = -1;
                break;
            }
        }
        return toReturn;
    }
}
