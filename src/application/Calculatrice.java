package application;

import controleur.ControleurAbstrait;
import controleur.ControleurCalculatrice;
import modele.ModeleAbstrait;
import modele.ModeleCalculatrice;
import vue.VueCalculatrice;

public class Calculatrice {

  public static void main(String[] args) {

    ModeleAbstrait calculatrice = new ModeleCalculatrice();

    ControleurAbstrait controleur = new ControleurCalculatrice(calculatrice);

    VueCalculatrice vue = new VueCalculatrice(controleur);

    calculatrice.ajouterObservateur(vue);
    vue.initialisation();
  }
}