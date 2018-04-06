package com.devservice.menuonline.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import com.devservice.menuonline.enums.TypeSocialNetwork;

@Entity
public class SocialNetwork implements Serializable {
	
	private static final long serialVersionUID = -1575303779781455638L;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;
	
	private String socialNetwork;
	
	private TypeSocialNetwork typeSocialNetwork;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSocialNetwork() {
		return socialNetwork;
	}

	public void setSocialNetwork(String socialNetwork) {
		this.socialNetwork = socialNetwork;
	}

	public TypeSocialNetwork getTypeSocialNetwork() {
		return typeSocialNetwork;
	}

	public void setTypeSocialNetwork(TypeSocialNetwork typeSocialNetwork) {
		this.typeSocialNetwork = typeSocialNetwork;
	}
	
	

}
