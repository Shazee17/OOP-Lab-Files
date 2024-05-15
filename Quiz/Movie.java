public class Movie {
    String title;
    String studio;
    double IMDB_rating;

    Movie(String title, String studio, double IMDB_rating){
        this.title = title;
        this.studio = studio;
        this.IMDB_rating = IMDB_rating;
    }

    Movie(String title, String studio){
        this.title = title;
        this.studio = studio;
        this.IMDB_rating = 0;
    }

    public static String[] getPG(Movie[] movies){
        String titles[] = new String[100];
        int i=0;

        for (Movie movie : movies) {
            if (movie.IMDB_rating > 5.0) {
                titles[i] = movie.title;
                i++; 
            }
        }

        return titles;
    }


    public static void main(String[] args) {
        
        Movie m1 = new Movie("Avatar", "20th Century Fox", 7.8);
        Movie m2 = new Movie("The Dark Knight", "Warner Bros.", 3.0);
        Movie m3 = new Movie("Jurassic Park", "Universal Pictures", 8.1);

        Movie[] movies = {m1, m2, m3};

        // Calling getPG method and storing the returned array
        String[] pgMovies = getPG(movies);

        // Printing the titles of movies with rating > 5
        for (String title : pgMovies) {
            if (title != null) {
                System.out.println(title);
            }
        }
    }
}
