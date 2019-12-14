package controleur;

import java.util.ArrayList;

import modele.Constante;
import modele.ModeleAbstrait;

public abstract class ControleurAbstrait {

	  protected ModeleAbstrait calculatrice;
	  protected String operateur;
	  protected String nombre;
	  protected ArrayList<String> listeOperateurs = new ArrayList<String>();

	  public ControleurAbstrait(ModeleAbstrait calculatrice){
	    this.calculatrice = calculatrice;

	    this.listeOperateurs.add(Constante.OPERATEUR_ADDITION);
	    this.listeOperateurs.add(Constante.OPERATEUR_SOUSTRACTION);
	    this.listeOperateurs.add(Constante.OPERATEUR_MULTIPLICATION);
	    this.listeOperateurs.add(Constante.OPERATEUR_DIVISION);
	    this.listeOperateurs.add(Constante.OPERATEUR_EGAL);
	   }
	   
	  public void definirOperateur(String operateur){
	    this.operateur = operateur;
	    controler();
	  }
	   
	  public void definirNombre(String nombre){
	    this.nombre = nombre;
	    controler();
	  }
	   
	  public void reinitialiser(){
	    this.calculatrice.reinitialiser();
	  }
	   
	  abstract void controler();
	}
