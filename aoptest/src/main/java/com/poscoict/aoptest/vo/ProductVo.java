package com.poscoict.aoptest.vo;

public class ProductVo {

	private String name;
	
	public ProductVo() {
		
	}
	
	public ProductVo(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ProductVo [name=" + name + "]";
	}

}