package builderEx;

// 빌더 패턴이 이해 !!! 
public class Student {
	
	private String name; 
	private int grade; 
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}

	// 1. 기본 생성자를 private 으로 정의해서 만들어 준다. 
	private Student() {
		
	}
	
	// 2. 내부 클래스 만들어 주기  (Builder 여러분들이 마듬대로 설정 가능)
	public static class Builder {
			// 또 변수를 외부 클래스에 있는 녀셕들을 선언해 준다. 
		   private String name; 
		   private int grade; 
		   
		   // 3. 내부 클래스를 리턴하는 메소드를 만들어 준다. 
		   
		   public Builder setName(String name) {
			   this.name = name; 
			   return this; 
		   }
		   
		   public Builder setGrade(int grade) {
			   this.grade = grade; 
			   return this; 
		   }
		   
		   // 빌더 패턴에 핵심 코드 !!!! 
		   public Student build() {
			   Student student = new Student(); 
			   student.name = this.name; // this -->  build (내부)
			   student.grade = this.grade; 
			   return student;
		   }
		   
	}
		
} // end of class 



