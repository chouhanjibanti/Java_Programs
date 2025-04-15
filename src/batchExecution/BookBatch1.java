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
//public class BookBatch1 {
//
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		
//		List<Book> list = new ArrayList<Book>();
//		boolean check = true;
//        do {
//        	 Scanner scan = new Scanner(System.in);
//        	 System.out.println("Enter the id : ");
//        	 int id = scan.nextInt();
//        	 Book book = new Book(id);
//        	 list.add(book);
//        	 
//        	 System.out.println("ur wiiling to delete-another book if delete press 1 or else enter 2 ");
//        	 int choice = scan.nextInt();
//        	 if(1==choice)
//        	 {
//        		 check = true;
//        	 }else {
//        		 check = false;
//        	 }
//        }while(check);
//        
//        
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_store?createDatabseIfNotExist=true","root","root");
//        PreparedStatement ps = con.prepareStatement("delete from book where id=?");
//        
//        for(Book book:list)
//        {
//		   ps.setInt(1, book.getId());
//		   ps.addBatch();
//		   System.out.println("Delete from batch");
//        }
//		ps.executeBatch();
//		ps.close();
//		System.out.println("Done operation...");
//	}
//
//}
