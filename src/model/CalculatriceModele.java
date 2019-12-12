package model;

public class CalculatriceModele {
	
	
	private String addString;
	private String subString;
	private String multiString;
	private String divString;
	private String finalString;
	private double nombreAAdditionner;
	private double nombreASoustraire;
	private double nombreAMultiplier;
	private double nombreADiviser;
	private double nombreFinal;
	private double resultat;
	private String reponseEnChaine;
	
	public double additionner(double nombre1, double nombre2) {

		return nombre1 + nombre2;
	}

	public double soustraire(double nombre1, double nombre2) {

		return nombre1 - nombre2;
	}

	public double multiplier(double nombre1, double nombre2) {

		return nombre1 * nombre2;
	}

	public double diviser(double nombre1, double nombre2) {

		return nombre1 / nombre2;
	}
}
