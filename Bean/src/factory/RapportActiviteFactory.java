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
	
	private static Collection<RapportActiviteConges> loadConges() {
		
		List<RapportActiviteConges> listConges=new ArrayList<>();
		RapportActiviteConges conges=new RapportActiviteConges();
		
		String intituleOm = "test";
		String valeurMille = "1000";
		String jour = "1";
		conges.setIntituleConge(intituleOm);
		conges.setJour(jour);
		conges.setValeurMille(valeurMille);
		listConges.add(conges);
		return listConges;
	}

	private static Collection<RapportActiviteActivites> loadActivites() {
		
		List<RapportActiviteActivites> listActivites=new ArrayList<>();
		RapportActiviteActivites activites=new RapportActiviteActivites();
		
		String intituleOm = "test";
		String valeurMille = "1000";
		String jour = "2";
		activites.setIntituleOm(intituleOm);
		activites.setJour(jour);
		activites.setValeurMille(valeurMille);
		
		listActivites.add(activites);
		
		
		return listActivites;
	}

	private static Collection<RapportActiviteOm> loadOm() {
		
		List<RapportActiviteOm> listOm=new ArrayList<>();
		RapportActiviteOm om=new RapportActiviteOm();
		
	    String nomOm = "bidon";
		om.setNomOm(nomOm);
		
		listOm.add(om);
			
		return listOm;
	}

	public static Collection<RapportActivite> loadFactory(){
		
		List<RapportActivite> rapportList=new ArrayList<RapportActivite>();
		RapportActivite rapport = new RapportActivite();
		String mois = "9";
		String annee = "2019";
		String nomCollaborateur = "test";
		String prenomCollaborateur = "test";
		
		rapport.setMois(mois);
		rapport.setAnnee(annee);
		
		rapport.setNomCollaborateur(nomCollaborateur);
		rapport.setPrenomCollaborateur(prenomCollaborateur);
		
		JRDataSource om=new JRBeanCollectionDataSource(loadOm());
	        rapport.setOm(om);
	        
	    JRDataSource activites=new JRBeanCollectionDataSource(loadActivites());
	        rapport.setActivites(activites);
		
	    JRDataSource conges=new JRBeanCollectionDataSource(loadConges());
	        rapport.setConges(conges);
	
		
		rapportList.add(rapport);
		
		
		return rapportList;
		
	}


	
	
	
	
}