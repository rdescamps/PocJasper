package factory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import bean.RapportActiviteOm;
import bean.RapportActivite;
import bean.RapportActiviteActivites;
import bean.RapportActiviteConges;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class RapportActiviteFactory {

	public static Collection<RapportActivite> load(){
		
		List<RapportActivite> rapportList=new ArrayList<RapportActivite>();
		RapportActivite rapport = new RapportActivite();
		String mois = null;
		String annee = null;
		String nomCollaborateur = null;
		String prenomCollaborateur = null;
		
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

	private static Collection<RapportActiviteConges> loadConges() {
		
		List<RapportActiviteConges> listConges=new ArrayList<>();
		RapportActiviteConges conges=new RapportActiviteConges();
		
		String intituleOm = null;
		String valeurMille = null;
		String jour = null;
		conges.setIntituleConge(intituleOm);
		conges.setJour(jour);
		conges.setValeurMille(valeurMille);
		listConges.add(conges);
		return listConges;
	}

	private static Collection<RapportActiviteActivites> loadActivites() {
		
		List<RapportActiviteActivites> listActivites=new ArrayList<>();
		RapportActiviteActivites activites=new RapportActiviteActivites();
		
		String intituleOm = null;
		String valeurMille = null;
		String jour = null;
		activites.setIntituleOm(intituleOm);
		activites.setJour(jour);
		activites.setValeurMille(valeurMille);
		
		listActivites.add(activites);
		
		
		return listActivites;
	}

	private static Collection<RapportActiviteOm> loadOm() {
		
		List<RapportActiviteOm> listOm=new ArrayList<>();
		RapportActiviteOm om=new RapportActiviteOm();
		
	    String nomOm = null;
		om.setNomOm(nomOm);
		
		listOm.add(om);
			
		return listOm;
	}
	
	
	
	
}
