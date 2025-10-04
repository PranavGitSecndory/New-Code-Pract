package encapsulation;

public class Question6 {

	    private String title;
	    private String author;

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public static void main(String[] args) {
	    	Question6 book = new Question6();
	        book.setTitle("chava");
	        book.setAuthor("Laxman uttekar");

	        System.out.println("Book Title: " + book.getTitle());
	        System.out.println("Author: " + book.getAuthor());
	    }
	

}
