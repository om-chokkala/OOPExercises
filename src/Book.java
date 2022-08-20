import java.util.List;

public class Book extends Product{
    private String title;
    private String author;
    private String recommendedAgeInfo;

    public Book(String title, String author, int price, long productId ) {

        super(productId,price);
        this.title = title;
        this.author = author;
    }
    public Book(String title, String author, int price, long productId, String recommendedAgeInfo ) {
        super(productId,price);
        this.title = title;
        this.author = author;
        this.recommendedAgeInfo = recommendedAgeInfo;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getRecommendedAgeInfo() {
        return recommendedAgeInfo;
    }

    public void setRecommendedAgeInfo(String recommendedAgeInfo) {
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    @Override
    public String toString() {
        /*return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", productId=" + productId +
                '}';*/
        return String.format("Title: %s, Author: %s, Price: %d, ProductID: %d", title,author,price,productId);
    }

    public static Book findMovieById(long productId, List<Book> books) {
        Book resultBook = null;
        for (Book book : books) {
            if (productId == book.productId)
                resultBook = book;
        }

        return resultBook;
    }

    @Override
    public void printDetails() {
        System.out.println("\nBook Details");
        System.out.println("------------");
        System.out.println("Title is " + this.title);
        System.out.println("Author is " + this.author);
        System.out.println("Price is " + this.price);
        System.out.println("ProductID is " + this.productId);
        if (this.recommendedAgeInfo != null) {
            System.out.println("Recommended age is " + this.recommendedAgeInfo);
        }
    }
}
