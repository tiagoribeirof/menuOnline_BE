package com.devservice.menuonline.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class Menu implements Serializable {
	

	private static final long serialVersionUID = 5527580400977958885L;

	private Establishment establishment;	
	
	private LocalDateTime insertionDate;
	
	private List<String> imagesPath;

	public Establishment getEstablishment() {
		return establishment;
	}

	public void setEstablishment(Establishment establishment) {
		this.establishment = establishment;
	}

	public LocalDateTime getInsertionDate() {
		return insertionDate;
	}

	public void setInsertionDate(LocalDateTime insertionDate) {
		this.insertionDate = insertionDate;
	}

	public List<String> getImagesPath() {
		return imagesPath;
	}

	public void setImagesPath(List<String> imagesPath) {
		this.imagesPath = imagesPath;
	}

	
}
