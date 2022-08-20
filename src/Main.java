import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        List<Product> product = new ArrayList<>();
        try {
            product.add(new Book("Tom & Jerry","JJ", 1000, -1001,"from 4 years"));
        }catch (Exception e) {
            e.printStackTrace();
        }

        try {
            product.add(new Book("Lord of the Rings","JRR Tolkien", 400, -1002));
        }catch (Exception e) {
            e.printStackTrace();
        }

            product.add((new Book("Java","React", 30, 1003)));

            product.add(new Movie("Movie1",MovieGenre.ACTION,700,1004));
            product.add(new MovieWithDirector("Movie2",MovieGenre.DOCUMENTARY, 1000, -1005, "Director_2:-)" ));
            product.add(new MovieWithDirector("Movie3",MovieGenre.COMEDY, 990, 1006, "Director_3:-)" ));



        for (Product p:product) {
            p.printDetails();
        /*if (p instanceof Book)
        {
            Book book = (Book)p;
            book.printBookDetails();
        } else if (p instanceof Movie) {
            Movie movie = (Movie)p;
            movie.printMovieDetail();
        }*/
        }
        //ChildrensBook cb = new ChildrensBook("Tom & Jerry","JJ", 1000, 1001,"from 4 years");
        /*List<Book> books = new ArrayList<>();
        books.add(new Book("Lord of the Rings","JRR Tolkien", 400, 1001));
        books.add(new Book("Java","React", 30, 1002));


        long productId = 1002;
        Book resultbook= Book.findMovieById(productId, books);

        if (resultbook!=null)
        {
            System.out.println("\nFound this book: "+ productId);
            System.out.println(resultbook.toString());
        }
        else
        {
            System.out.println("\nDidn't find the book with the productId: "+ productId);
        }

        Movie movie1 = new Movie("Movie1",MovieGenre.ACTION,700,10001);
        Movie movie2 = new Movie("Movie2",MovieGenre.DOCUMENTARY, 1000,10002,"Director_Name:-)");

        HashMap<Long, Movie> movieMap = new HashMap<>();
        movieMap.put(movie1.getProductId(), movie1);
        movieMap.put(movie2.getProductId(),movie2);

        productId = 10002;
        Movie resultMovie = movieMap.get(productId);
        if(resultMovie!=null)
        {
            System.out.println("\nFound this movie in the map: "+ resultMovie.getProductId());
            resultMovie.printMovieDetail();
        }
        else
        {
            System.out.println("\nDidn't find a movie with productId in the map: "+ productId);
        }*/
       /* List<Book> books = new ArrayList<>();
        books.add(new Book("Lord of the Rings","JRR Tolkien", 400));
        books.add(new Book("Java","React", 30));

        for (Book book:books) {
            book.printBookDetails();
        }*/
        /*Movie movie1 = new Movie("Movie1",MovieGenre.ACTION,700,10001);
        Movie movie2 = new Movie("Movie2",MovieGenre.DOCUMENTARY, 1000,10002,"Director_Name:-)");

        HashMap<Long, Movie> movieMap = new HashMap<>();
        movieMap.put(11L, movie1);
        movieMap.put(12L,movie2);*/

       //System.out.println(movieMap.get(11L);
        /*List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Movie1",MovieGenre.ACTION,700, 10001));
        movies.add(new Movie("Movie2",MovieGenre.DOCUMENTARY, 1000, "Director_Name:-)", 10002));


        long productId = 10001;
       Movie resultMovie= Movie.findMovieById(productId, movies);

        if (resultMovie!=null)
        {
            System.out.println("\nFound this movie: "+ productId);
            resultMovie.printMovieDetail();
        }
        else
        {
            System.out.println("\nDidn't find a movie with productId: "+ productId);
        }
*/

        /*for (Movie movie:movies) {
            movie.printMovieDetail();
        }*/

       /* Book[] books = new Book[2];
        books[0] = new Book("Lord of the Rings","JRR Tolkien", 400);
        books[1] = new Book("Java","React", 30);

        for (Book book:books) {
            book.printBookDetails();
        }

        Movie[] movies = new Movie[2];
        movies[0] = new Movie("Movie1",MovieGenre.ACTION,700);
        movies[1] = new Movie("Movie2",MovieGenre.DOCUMENTARY, 1000, "Director_Name:-)");

        Movie.printDetails(movies);
*/
       /* Book book1 = new Book("Dreams","Sara", 20);
        Book book2 = new Book("Java","Rea", 30);

        book1.printBookDetails();
        book1.printBookDetails();

        Movie movie1 = new Movie("Movie1",MovieGenre.ACTION,700);
        Movie movie2 = new Movie("Movie2",MovieGenre.DOCUMENTARY, 1000);

        movie1.printMovieDetails();
        movie2.printMovieDetails();*/
    }
}