package com.devservice.menuonline.enums;

public enum TypeSocialNetwork {

	
	Instagram(1), Facebook(2);
	
	private Integer type;
	
	private TypeSocialNetwork(Integer type) {
		this.type = type;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	
	
}
