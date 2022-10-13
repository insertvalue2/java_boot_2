package io_ex.ch05;

import java.io.Serializable;

// Object 파일에 저장하고 싶을 때 -- FileOutStream + FileObjectOutStream
// writeObject(Object); 
// 직렬화 - 클래스를 바이트 단위로 직렬화(0101) Serializable 이라고 한다 
public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	String name; 
	transient int age; // 직렬화 시킬때 제외 (데이터가 저장 안됨- 파일에..)   
	String tel;
	
	// 기본 생성자를 넣어 주어야 한다.
	public Student() {
	}
	
	public Student(String name, int age, String tel) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", tel=" + tel + "]";
	}

}
