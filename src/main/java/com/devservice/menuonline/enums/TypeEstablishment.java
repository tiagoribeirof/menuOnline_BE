package com.devservice.menuonline.enums;

public enum TypeEstablishment {

	Bar("1"),Restaurant("2");

	private String typeEtablishment;

	TypeEstablishment(String typeEtablishment) {
		this.typeEtablishment = typeEtablishment;
	}

	public String getTypeEstablishment() {
		return typeEtablishment;
	}


}
