package org.wildfly.swarm.examples.jaxrs;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.tutorialspoint.model.Book;

@Path("/books/listbooks")
public class BooksResource {
		private List<Book> books = new ArrayList<Book>();
		public BooksResource() {
			super();
			
			Book book1 = new Book(1, "12345", "Java: A Beginner's Guide", "Herbert Schildt");
			Book book2 = new Book(2, "12346", "Pro Silverlight 5 in C#", "Matthew MacDonald");
			Book book3 = new Book(3, "12347", "Well Grounded Rubyist", "David A. Black");
				
			
			books.add(book1);		 
			books.add(book2);		 
			books.add(book3);		 
			
					
		}
	    
		@GET
	    @Produces("application/json")
	    public List<Book> get() {
			

	    	return books;
	    	
	    }
}
