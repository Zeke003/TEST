
public class Book {
	private String title;
	private String author;
	private int isbn;

	public static void main(String[] args) {
		Book a = new Book();
		a.setTitle( "The Sun Also Rises ");
		a.setAuthor( "Ernest Hemingway ");
		a.setIsbn(77722);
		a.printDetails();
		
		Book b = new Book();
		b.setTitle2("Harry Potter ");
		b.setAuthor2("JK Rowling ");
		b.setIsbn2(11133);
		b.printDetails2();
		
		if(a.equals(a)) {
			System.out.println("The same book");
		
		}else if(a.equals(b)) {
			System.out.println("Not the same Book");
		}
	}
	
	
	
	//Setters and Getters for variables of "Book a"
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author)  {
		this.author = author;
	}
	
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public int getISBN() {
		return this.isbn;
	}
		
	
	// Setters and Getters for "Other book/b"
	public void setTitle2(String title) {
		this.title = title;
	}
	
	public void setAuthor2(String author)  {
		this.author = author;
	}
	
	public void setIsbn2(int isbn) {
		this.isbn = isbn;
	}
	
	
	public String getTitle2() {
		return this.title;
	}
	
	public String getAuthor2() {
		return this.author;
	}
	
	public int getISBN2() {
		return this.isbn;
	}
	
	
	
	//Return values to printDetails function for "Book a"
	public void printDetails() {
		System.out.println(title + ", " + author + ", " + isbn);
	}
	
	//Return values for printDetails function for "Other Book/ b"
	public void printDetails2() {
		System.out.println(title + ", " + author + ", " + isbn);
	}
}
