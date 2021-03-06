package com.unis.jasper.bean;

import java.util.List;

public class CalendarPrincipal {
	
	private String nom;
	private String prenom;
	private int moisCourant;
	private int anneeCourante;
	
	private List<CalendarsubActivite> activite;
	
	public CalendarPrincipal(String nom, String prenom, int moisCourant, int anneeCourante, List<CalendarsubActivite> activite) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.moisCourant = moisCourant;
		this.anneeCourante = anneeCourante;
		this.activite = activite;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getMoisCourant() {
		return moisCourant;
	}
	public void setMoisCourant(int moisCourant) {
		this.moisCourant = moisCourant;
	}
	public int getAnneeCourante() {
		return anneeCourante;
	}
	public void setAnneeCourante(int anneeCourante) {
		this.anneeCourante = anneeCourante;
	}
	public List<CalendarsubActivite> getActivite() {
		return activite;
	}
	public void setActivite(List<CalendarsubActivite> activite) {
		this.activite = activite;
	}

}
