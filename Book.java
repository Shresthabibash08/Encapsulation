public class Book {
    private String bookTitle;
    private String authorName;
    private int publicationYear;
    private boolean availability;
    public Book(String bookTitle,String authoerName,int publicationYear,boolean availability){
        this.bookTitle=bookTitle;
        this.authorName=authoerName;
        this.publicationYear=publicationYear;
        this.availability=availability;
    }
    public void setBookTitle(String bookTitle){
        this.bookTitle=bookTitle;
    }
    public void setAuthorName(String authorName){
        this.authorName=authorName;
    }
    public void setPublicationYear(int publicationYear){
        this.publicationYear=publicationYear;
    }
    public void setAvailability(boolean availability){
        this.availability=availability;
    }
    public String getBookTitle(){
        return bookTitle;
    }
    public String getAuthorName(){
        return authorName;
    }
    public int getPublicationYear(){
        return publicationYear;
    }
    //Method
    public void availabilityChecking(){
        if(availability==true){
            System.out.println("The book you want is available.");
        }
        else{
            System.out.println("The book is not available currently.");
        }
    }
}
class implementaion{
    public static void main(String[] args) {
        Book book1=new Book("Atmoic Habbit","James Clear",2022,true);
        book1.availabilityChecking();
    }
}
