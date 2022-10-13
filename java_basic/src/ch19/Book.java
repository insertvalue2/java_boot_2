package ch19;

public class Book {
	
	private String bookId; 
	private String title; 
	private String author;
	
	public Book(String bookId, String title, String author) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	} 
	
	@Override
	public String toString() {
		return this.title;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 1. 단계 this.title 과 Object 녀셕 title 값이 같다면 같은 책이라고 앞으로 판별 하겠어 !!
		// 2. Object 타입은 모든 클래스의 최상위 이기 때문에 아무것이든 들어 올 수 있다. : 문제해결
		// 3. 추가 적인 데이터가 필요하다면 코드를 추가 하면된다. 
		// 책이름과 저가가 같다면  같은 책으로 판별 하겠어 !!! 
		if(obj instanceof Book) {
			Book tempBook = (Book)obj; 
			if(this.title == tempBook.title && this.author == tempBook.author) {
				return true; 
			}
		}
		return  false;
	}
	
	public void showInfo() {
		System.out.println("==== 책 정보 =====");
		System.out.println("책 제목 : " + this.title);
	}
	
}
