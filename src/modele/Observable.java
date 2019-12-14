package modele;

public interface Observable {
	public void ajouterObservateur(Observateur observeur);
	public void supprimerObservateur();
	public void notifierObservateurs(String chaine);
}
