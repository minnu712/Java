
public class Data {
public static void main(String args[]) {
	Author au = new Author("basheer",45);
	Book book = new Book("aadu","comedy",au);
	System.out.println(book.name);
	System.out.println(book.type);
	System.out.println(book.author.name);
	System.out.println(book.author.age);
	
}
}
