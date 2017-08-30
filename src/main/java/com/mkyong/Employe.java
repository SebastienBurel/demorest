package com.mkyong;

public class Employe {
	private String nom; 
	private String prenom;
	
	
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


	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
	

}
