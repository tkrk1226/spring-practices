package com.poscoict.container.user;

public class User {

	// 생성자에 개발자의 주장이 적용 -> 기본 생성자가 필요가 없음 -> 컴파일러 개입 안함
	private String name = "정의진";
	private Long no = 0L;
	
	User(){
		
	}
	
	User(String name){
		this.name = name;
	}

	User(Long no, String name){
		this.name = name;
		this.no = no;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", no=" + no + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNo(Long no) {
		this.no = no;
	}
	
}
