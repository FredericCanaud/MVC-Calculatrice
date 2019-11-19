package application;

public class CalculatriceControleur {
	
	private CalculatriceVue vueCalculatrice;
	private CalculatriceModele modeleCalculatrice;
	
	public CalculatriceControleur(CalculatriceVue vueCalculatrice, CalculatriceModele modeleCalculatrice) {
		this.vueCalculatrice = vueCalculatrice;
		this.modeleCalculatrice = modeleCalculatrice;
	}
}
