package modele;

import java.util.ArrayList;

public class ModeleCalculatrice extends ModeleAbstrait {

	public ModeleCalculatrice() {
		this.listeObservateurs = new ArrayList<Observateur>();
		this.nombre = Constante.CHAINE_VIDE;
		this.operateur = Constante.CHAINE_VIDE;
	}
	public void definirOperateur(String operateur) {
		calculer();

		this.operateur = operateur;

		if (!operateur.equals(Constante.OPERATEUR_EGAL)) {
			this.nombre = "0";
		}
	}

	public void definirNombre(String chiffre) {

		this.nombre += chiffre;
		notifierObservateurs(this.nombre);
	}

	public void recupererResultat() {
		calculer();
	}

	public void reinitialiser(){
    this.resultat = 0.0;
    this.nombre = "0";
    this.operateur = Constante.CHAINE_VIDE;
    notifierObservateurs(String.valueOf(this.resultat));
  }

	@Override
	public void calculer() {

		if (this.operateur.equals(Constante.CHAINE_VIDE)) {
			this.resultat = Double.parseDouble(this.nombre);
		}

		else {
			if (!this.nombre.equals(Constante.CHAINE_VIDE)) {
				if (this.operateur.equals(Constante.OPERATEUR_ADDITION))
					this.resultat += Double.parseDouble(this.nombre);
				
				else if (this.operateur.equals(Constante.OPERATEUR_SOUSTRACTION))
					this.resultat -= Double.parseDouble(this.nombre);
				
				else if (this.operateur.equals(Constante.OPERATEUR_MULTIPLICATION))
					this.resultat *= Double.parseDouble(this.nombre);
				
				else if (this.operateur.equals(Constante.OPERATEUR_DIVISION)) {
					try {
						this.resultat /= Double.parseDouble(this.nombre);
					} catch (ArithmeticException e) {
						this.resultat = 0;
					}
				}
			}

		}
		this.nombre = Constante.CHAINE_VIDE;
		notifierObservateurs(String.valueOf(this.resultat));
	}

}
