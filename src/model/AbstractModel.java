package model;

import java.util.ArrayList;

import model.Observable;

public abstract class AbstractModel implements Observable{

  protected double result = 0;   
  protected String operateur = "", operande = "";
  private ArrayList<Observer> listObserver = new ArrayList<Observer>();   
  //Efface 
  public abstract void reset();

  //Effectue le calcul
  public abstract void calcul();

  //Affichage forc� du r�sultat
  public abstract void getResultat();

  //D�finit l'op�rateur de l'op�ration
  public abstract void setOperateur(String operateur);

  //D�finit le nombre � utiliser pour l'op�ration
  public abstract void setNombre(String nbre) ;

  //Impl�mentation du pattern observer
  public void addObserver(Observer obs) {
    this.listObserver.add(obs);
  }

  public void notifyObserver(String str) {
    if(str.matches("^0[0-9]+"))
      str = str.substring(1, str.length());

    for(Observer obs : listObserver)
      obs.update(str);
  }

  public void removeObserver() {
    listObserver = new ArrayList<Observer>();
  }  
}
