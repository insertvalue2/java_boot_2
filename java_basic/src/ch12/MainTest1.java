package ch12;

import java.util.Scanner;

public class MainTest1 {
	
	public static void main(String[] args) {
		
		boolean flag = true;
		Book[] books = new Book[10];
		int lastIndexCount = 0; 
		
		Scanner scanner = new Scanner(System.in);
		while(flag) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1.저장    2.전체조회  3.선택조회  4.선택삭제  5.전체삭제  0.종료");
			// String 값으로 받을 예정 
			String selected = scanner.nextLine();
			if(selected.equals("1")) {
				 System.out.println("책 제목 입력 ");
				 String title = scanner.nextLine();
				 System.out.println("저자 입력 ");
				 String author = scanner.nextLine();
				 books[lastIndexCount] = new Book(title, author);
				 lastIndexCount++; 
				 
			} else if(selected.equals("2")) {
				// 전체 조회 : 화면에 출력
				for(int i = 0; i < books.length; i++) {
					if(books[i] != null) {
						books[i].showInfo();
					}
				}
			} else {
				System.out.println("프로그램 종료 합니다");
				flag = false; 
			}
		}
		
	} // end of main 
}
