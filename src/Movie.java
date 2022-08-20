import java.util.List;

public class Movie extends Product{
    private String title;
    private MovieGenre genre;

    public Movie(String title, MovieGenre genre, int price, long productId) {
        super(productId,price);
        if (productId < 0)
        {
            throw new IllegalArgumentException("ENTER POSITIVE NUMBER");
        }
        this.title = title;
        this.genre = genre;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }



    public static Movie findMovieById(long productId, List<Movie> movies) {
        //Movie resultMovie = null;
        for (Movie movie : movies) {
            if (productId == movie.productId)
                //resultMovie = movie;
                return movie;
        }
        return null;
        //return resultMovie;
    }
    @Override
    public void printDetails() {
        System.out.println("\nMovie Details");
        System.out.println("------------");
        System.out.println("Title is " + this.title);
        System.out.println("Genre is " + this.genre);
        System.out.println("Price is " + this.price);
       /* if (this.director != null) {
            System.out.println("Director is " + this.director);
        }*/
        System.out.println("Product ID is " + this.productId);
    }

    /*public static void printDetails(Movie... movies)
    {
        for (Movie movie: movies) {
            movie.printOneMovieDetail(movie);
        }
    }*/

}
