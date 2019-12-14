package controleur;

import modele.Constante;
import modele.ModeleAbstrait;

public class ControleurCalculatrice extends ControleurAbstrait {

	public ControleurCalculatrice(ModeleAbstrait modeleAbstrait) {
		super(modeleAbstrait);
	}

	@Override
	void controler() {
		if (this.listeOperateurs.contains(this.operateur)) {
			if (this.operateur.equals(Constante.OPERATEUR_EGAL))
				this.calculatrice.recupererResultat();
			else
				this.calculatrice.definirOperateur(this.operateur);
		}

		if (this.nombre.matches(Constante.ENSEMBLE_CHIFFRES_0_A_9)) {
			this.calculatrice.definirNombre(this.nombre);
		}

		this.operateur = Constante.CHAINE_VIDE;
		this.nombre = Constante.CHAINE_VIDE;

	}

}
