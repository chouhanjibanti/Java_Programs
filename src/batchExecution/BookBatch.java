//package batchExecution;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//import book_Store.dto.Book;
//
//public class BookBatch {
//
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		
//		List<Book> list = new ArrayList<Book>();
////		list.add(new Book(7, "java","rao",300, "kilikari"));
////		list.add(new Book(8, "adv java","shrihari",150, "English"));
////		list.add(new Book(9, "sql", "babu", 200, "korean"));
//		
//		Scanner scan = new Scanner(System.in);
//		boolean check = true;
//		do {
//			System.out.println("Enter the id  :");
//			int id = scan.nextInt();
//			System.out.println("Enter the name :");
//			String name = scan.next();
//			System.out.println("Enter the author : ");
//			String author = scan.next();
//			System.out.println("Enter the price : ");
//			double price = scan.nextDouble();
//			System.out.println("Enter the language : ");
//			String language = scan.next();
//			Book book = new Book(id, name, author, price, language);
//			list.add(book);
//			System.out.println("ur wiiling to add-another book if s enter 1 or else enter 2");
//			int choice = scan.nextInt();
//			if(1==choice) {
//				check =true;
//			}else
//				check = false;
//		}while(check);
//		  System.out.println(list);
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_store?createDatabaseIfNotExist=true", "root", "root");
//        PreparedStatement preparedStatement = connection.prepareStatement("insert into book values(?,?,?,?,?)");
//        for(Book book:list)
//        {    
//        	preparedStatement.setInt(1,book.getId());
//        	preparedStatement.setString(2, book.getName());
//        	preparedStatement.setString(3, book.getAuthor());
//        	preparedStatement.setDouble(4, book.getPrice());
//        	preparedStatement.setString(5,book.getLanguage());
//        	preparedStatement.addBatch();
//        	System.out.println("added into batch");
//        }
//        
//        preparedStatement.executeBatch();
//        connection.close();
//        System.out.println("done with operation");
//	}
//
//}
