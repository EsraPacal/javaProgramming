package day47_Polymorphism;

public class EncapsulationReview {

    private String bookTitle;
    private final String publishDate;

    // Constructor's name has to match with the class' name
    public EncapsulationReview(String bookTitle, String publishDate) {
        // this.bookTitle = bookTitle;  ====> we can just set the data
        setBookTitle(bookTitle);    // if we use it like that, we can check the condition
        this.publishDate = publishDate;  // final data ====> we can not reset and give any condition
    }

    public String getBookTitle() {
        if(bookTitle == null){
            return "";
        }
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        if(bookTitle == null || bookTitle.isEmpty()){
            throw new RuntimeException("Invalid Data");
        }
        this.bookTitle = bookTitle;
    }

    public String getPublishDate() {
        return publishDate;
    }



}
