package com.spring.mappingconcept.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Additionalmodel {

	   @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   @Column(name = "add_id")
	   private int additionalmodel;
	   private int fare;
	   private int flash;
	public int getAdditionalmodel() {
		return additionalmodel;
	}
	public void setAdditionalmodel(int additionalmodel) {
		this.additionalmodel = additionalmodel;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public int getFlash() {
		return flash;
	}
	public void setFlash(int flash) {
		this.flash = flash;
	}
	   
}
