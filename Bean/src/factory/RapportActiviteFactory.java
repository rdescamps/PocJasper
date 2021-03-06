package factory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import bean.RapportActivite;
import bean.RapportActiviteActivites;
import bean.RapportActiviteConges;
import bean.RapportActiviteOm;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class RapportActiviteFactory {
	
	public static Collection<RapportActiviteConges> loadConges() {
		
		List<RapportActiviteConges> listConges=new ArrayList<>();
		RapportActiviteConges conges=new RapportActiviteConges();
		
		String intituleOm = "test";
		int valeurMille = 1000;
		int jour = 11;
		conges.setIntituleConge(intituleOm);
		conges.setJourConge(jour);
		conges.setValeurMilleConge(valeurMille);
		listConges.add(conges);
		return listConges;
	}

	public static Collection<RapportActiviteActivites> loadActivites() {
		
		List<RapportActiviteActivites> listActivites=new ArrayList<>();
		RapportActiviteActivites activites=new RapportActiviteActivites();
		
		String intituleOm = "test";
		int valeurMille = 1000;
		int jour = 2;
		activites.setintituleActivite(intituleOm);
		activites.setJourActivite(jour);
		activites.setValeurMilleActivite(valeurMille);
		
		listActivites.add(activites);
		
		
		return listActivites;
	}

	public static Collection<RapportActiviteOm> loadOm() {
		
		List<RapportActiviteOm> listOm=new ArrayList<>();
		RapportActiviteOm om=new RapportActiviteOm();
		
	    String nomOm = "bidon";
		om.setIntituleOm(nomOm);
		
		listOm.add(om);
			
		return listOm;
	}

	public static Collection<RapportActivite> loadFactory(){
		
		List<RapportActivite> rapportList=new ArrayList<RapportActivite>();
		RapportActivite rapport = new RapportActivite();
		int mois = 9;
		int annee = 2019;
		String nomCollaborateur = "test";
		String prenomCollaborateur = "test";
	
	
		
		rapport.setMois(mois);
		rapport.setAnnee(annee);
	
		
		rapport.setNomCollaborateur(nomCollaborateur);
		rapport.setPrenomCollaborateur(prenomCollaborateur);
		
		JRDataSource om=new JRBeanCollectionDataSource(loadOm(),false);
	        rapport.setOm(om);
	        
	    JRDataSource activites=new JRBeanCollectionDataSource(loadActivites(),false);
	        rapport.setActivites(activites);
		
	    JRDataSource conges=new JRBeanCollectionDataSource(loadConges(),false);
	        rapport.setConges(conges);
	
		
		rapportList.add(rapport);
		
		
		return rapportList;
		
	}


	
	
	
	
}
