package modele;

import java.util.ArrayList;

import modele.Observable;

public abstract class ModeleAbstrait implements Observable{

  protected double resultat = 0;   
  protected String operateur = "";
  protected String nombre = "";
  protected ArrayList<Observateur> listeObservateurs;   

  public abstract void reinitialiser();

  public abstract void calculer();

  public abstract void recupererResultat();

  public abstract void definirOperateur(String operateur);

  public abstract void definirNombre(String nombre) ;

  ////////////////////// Implementation du pattern Observeur ////////////////////////////:
  
  public void ajouterObservateur(Observateur observeur) {
    this.listeObservateurs.add(observeur);
  }

  public void notifierObservateurs(String chaine) {
    if(chaine.matches(Constante.ENSEMBLE_CHIFFRES_0_A_9))
      chaine = chaine.substring(1, chaine.length());

    for(Observateur observeur : listeObservateurs)
      observeur.notifier(chaine);
  }

  public void supprimerObservateur() {
    listeObservateurs = new ArrayList<Observateur>();
  }  
}
