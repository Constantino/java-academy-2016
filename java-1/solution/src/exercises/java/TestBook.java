package exercises.java;

public class TestBook {

	public static void main(String[] args){
		
		Author author = new Author("J.K Rowling","jkrowling@magicworld.com",'f');
		Book book = new Book("Harry Potter and the Deathly Hallows", author,50.0,1);
		
		Author authorInfo;
		
		System.out.println("Book name: "+book.getName());
		authorInfo = book.getAuthor();
		System.out.println("AuthorInfo: "+authorInfo.toString());
		System.out.println("Book price: "+book.getPrice());
		book.setPrice(55);
		System.out.println("Book qty: "+book.getQty());
		book.setQty(book.getQty()-1 == 0 ? 0 : book.getQty()-1);
		System.out.println("Book info: "+book.toString());
		
	}
}
