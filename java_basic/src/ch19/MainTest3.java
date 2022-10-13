package ch19;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTest3 {

	public static void main(String[] args) {

		// 스캐너를 생성해서 책 정보를 저장

		// ArrayList 에 담고, C R U D 기능을 사용하는 코드를 만들어 주세요.

		// 기능들은 함수로 만들어주세요
		
		// 샘플 데이터
		Book book1 = new Book("1", "흐르는강물처럼", "파울로코엘료");
		Book book2 = new Book("2", "플러터UI실전", "김근호");
		Book book3 = new Book("3", "무궁화꽃이피었습니다", "김진명");
		Book book4 = new Book("4", "리딩으로리드하라", "이지성");
		Book book5 = new Book("5", "사피엔스", "유발하라리");
		
		ArrayList<Book> books = new ArrayList<>();
		books.add(book1);	
		books.add(book2);	
		books.add(book3);	
		books.add(book4);	
		books.add(book5);	
		
		// 함수를 호출해서 기능을 동작 시킨다. 
		// 1. 업데이트 기능 테스트 ( 해당 객체 접근해서 , 몇번째 인덱스를 어떤 데이터로 수정) 
//		update(books, 1, book5 );
//		System.out.println(books);
		Book bookTemp = insert();
		books.add(bookTemp); 
		System.out.println(books);
	}

	// 함수로 만들어 주세요
	// insert();
	public static Book insert() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("북아이디 입력하세요");
		String id = scanner.nextLine();
		System.out.println("제목 입력하세요");
		String title = scanner.nextLine();
		System.out.println("저자 입력하세요");
		String author = scanner.nextLine();
		Book book = new Book(id, title, author);
		// list.add(book);
		return book;
	}
	// update();
	// 개념 
	public static ArrayList<Book> update(ArrayList<Book> list, int index, Book book) {
		ArrayList<Book> localList = list; 
		localList.set(index, book);
		return localList;
	}	
	
//	public static void update2(ArrayList<Book> list, int index, Book book) {
//		list.set(index, book);
//	}	
	// delete();

	// read();

	// read(int index); - 선택 조회

}
