package com.poscoict.container.user;

public class Friend {

	private String name;
	
//	Friend(){
//		
//	}
	
	Friend(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + "]";
	}
}
