package bean;

public class Calendarsubbean {
	
	private String intitule;
	private int jour;
	private int valeurMille;
	private int id;
	private int type;
	
	
	public Calendarsubbean(String intitule, int jour, int valeurMille, int id, int type) {
		super();
		this.intitule = intitule;
		this.jour = jour;
		this.valeurMille = valeurMille;
		this.id = id;
		this.type = type;
	}
	
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public int getJour() {
		return jour;
	}
	public void setJour(int jour) {
		this.jour = jour;
	}
	public int getValeurMille() {
		return valeurMille;
	}
	public void setValeurMille(int valeurMille) {
		this.valeurMille = valeurMille;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	
}
