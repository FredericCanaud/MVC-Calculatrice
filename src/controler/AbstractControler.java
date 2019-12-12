package controler;

import java.util.ArrayList;

import model.AbstractModel;

public abstract class AbstractControler {

	  protected AbstractModel calc;
	  protected String operateur = "", nbre = "";
	  protected ArrayList<String> listOperateur = new ArrayList<String>();

	  public AbstractControler(AbstractModel cal){
	    this.calc = cal;
	    //On d�finit la liste des op�rateurs
	    //Afin de s'assurer qu'ils sont corrects
	    this.listOperateur.add("+");
	    this.listOperateur.add("-");
	    this.listOperateur.add("*");
	    this.listOperateur.add("/");
	    this.listOperateur.add("=");
	   }
	   
	  //D�finit l'op�rateur
	  public void setOperateur(String ope){
	    this.operateur = ope;
	    control();
	  }
	   
	  //D�finit le nombre
	  public void setNombre(String nombre){
	    this.nbre = nombre;
	    control();
	  }
	   
	  //Efface
	  public void reset(){
	    this.calc.reset();
	  }
	   
	  //M�thode de contr�le
	  abstract void control();
	}
