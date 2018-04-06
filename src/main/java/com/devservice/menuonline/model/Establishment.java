package com.devservice.menuonline.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import com.devservice.menuonline.enums.TypeEstablishment;

@Entity
public class Establishment implements Serializable {

	
	private static final long serialVersionUID = -5492548603348443562L;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;
	
	private String name;
	
	private Address address;
	
	private String phone;
	
	private String email;
	
	private TypeEstablishment typeEstablishment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TypeEstablishment getTypeEstablishment() {
		return typeEstablishment;
	}

	public void setTypeEstablishment(TypeEstablishment typeEstablishment) {
		this.typeEstablishment = typeEstablishment;
	}
	

}
