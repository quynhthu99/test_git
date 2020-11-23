package View;

import java.sql.SQLException;
import java.util.Scanner;

import Controller.BookController;
import Model.DTO;


public class BookView  {
	BookController bookController = new BookController();
	public void View() throws SQLException {
		
		while (true) {
			System.out.println("Enter number: ");
			System.out.println("1: Create ");
			System.out.println("2: Read ");
			System.out.println("3: Update ");
			System.out.println("4: Delete ");
			System.out.println("5: Cancel ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			switch (n) {
			case 1: {
				DTO book = new DTO("a1","b1","c1",14); 
				System.out.println(bookController.createBook(book));
				
			}
			case 2: {
				System.out.println(bookController.getListBook());
			}
			case 3: {
				DTO book = new DTO("a2","b2","c2",1);
				System.out.println(bookController.updateBook(book));
			}
			case 4: {
				int id = 3;
				System.out.println(bookController.deleteBook(id));
			}
			case 5: break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + n);
			}
			if(n==5) break;
			
		}
	}
}
