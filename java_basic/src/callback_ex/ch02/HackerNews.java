package callback_ex.ch02;

import java.text.SimpleDateFormat;
import java.util.Calendar;

// 응답자로 만들어 보자. 
public class HackerNews {
	
	OnWriteArticle onWriteArticle = new OnWriteArticle() {
		@Override
		public void printNews(String article) {
			System.out.println("***** HackerNews *******");
			System.out.println();
			System.out.println(article);
			System.out.println();
			System.out.println("기사 작성일 : " + nowDate());
		}
	};

	private String nowDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
		return dateFormat.format(Calendar.getInstance().getTimeInMillis());
	}
}
