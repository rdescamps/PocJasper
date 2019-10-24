package bean;

import net.sf.jasperreports.engine.JRDataSource;

public class RapportActivite {
	
	private String nomCollaborateur;
	private String prenomCollaborateur;
	
	private JRDataSource activites;
	private JRDataSource conges;
	private JRDataSource om;
	  
	private String mois;
	private String annee;
	  
	
	public String getNomCollaborateur() {
		return nomCollaborateur;
	}
	public void setNomCollaborateur(String nomCollaborateur) {
		this.nomCollaborateur = nomCollaborateur;
	}
	public String getPrenomCollaborateur() {
		return prenomCollaborateur;
	}
	public void setPrenomCollaborateur(String prenomCollaborateur) {
		this.prenomCollaborateur = prenomCollaborateur;
	}
	public JRDataSource getActivites() {
		return activites;
	}
	public void setActivites(JRDataSource activites) {
		this.activites = activites;
	}
	public JRDataSource getConges() {
		return conges;
	}
	public void setConges(JRDataSource conges) {
		this.conges = conges;
	}
	public JRDataSource getOm() {
		return om;
	}
	public void setOm(JRDataSource om) {
		this.om = om;
	}
	public String getMois() {
		return mois;
	}
	public void setMois(String mois) {
		this.mois = mois;
	}
	public String getAnnee() {
		return annee;
	}
	public void setAnnee(String annee) {
		this.annee = annee;
	}


	


}
