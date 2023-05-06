package com.spring.mappingconcept.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Photography {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pho_id")
	private int Aperture;
	private int pixel;
	private String picture;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_add_id")
	private Additionalmodel additionalmodel;

public int getAperture() {
	return Aperture;
}
public void setAperture(int aperture) {
	Aperture = aperture;
}
public int getPixel() {
	return pixel;
}
public void setPixel(int pixel) {
	this.pixel = pixel;
}
public String getPicture() {
	return picture;
}
public void setPicture(String picture) {
	this.picture = picture;
}
}
