package com.devservice.menuonline.enums;

public enum TypeEstablishment {

	Bar(1),Restaurant(2);

	private Integer typeEtablishment;

	TypeEstablishment(Integer typeEtablishment) {
		this.typeEtablishment = typeEtablishment;
	}

	public Integer getTypeEstablishment() {
		return typeEtablishment;
	}


}
