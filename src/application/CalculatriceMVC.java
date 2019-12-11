package application;

import controler.CalculatriceControleur;
import model.CalculatriceModele;
import view.CalculatriceVue;

public class CalculatriceMVC {
	
	public static void main(String[] args) {
		CalculatriceVue vue = new CalculatriceVue();
		CalculatriceModele modele = new CalculatriceModele();
		CalculatriceControleur controleur = new CalculatriceControleur(vue,modele);
	}
}
