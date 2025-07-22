package class1;

public class MovieReview {
    private String title;
    private String review;

    public MovieReview(String title, String review) {
        this.title = title;
        this.review = review;
    }
    public void print()
    {
        System.out.println("title: " + title +" review: " + review);
    }
}
