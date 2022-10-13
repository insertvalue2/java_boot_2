package ch18;


// !!! 모든 클래스이 최상위 클래는 Object class 이다. 
// 자바에서는 extends 키워드를 단 한번만 사용할 수 있다. 
// 자바에서는 다중 상속을 지원하지 않는다.
// 단 최상위 클래스인 Object 클래스는 예외로 한다. 
public class Student extends Object {

	
	private int studentId;
	private String studentName;

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	// 문제 1
	// toString 메서드를 재 정의 하세요
	// "학번 : " + studentId + ", 이름 : " + studentName;
	@Override
	public String toString() {
		return "학번 : " + studentId + ", 이름 : " + studentName;
	}

	// 문제 2
	// equals 메서드를 재정의 하세요.
	// 조건은 학생에 이름과 학생에 ID 값이 같다면 같은 학생입니다.
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student tempStudent = (Student) obj;
			if (this.studentId == tempStudent.studentId 
					&& this.studentName == tempStudent.studentName) {
				return true;
			}
		}
		return false;
	}
}
