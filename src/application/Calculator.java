package application;

import model.AbstractModel;

public class Calculator extends AbstractModel{

  //D�finit l'op�rateur
  public void setOperateur(String ope){    
    //On lance le calcul
    calcul();

    //On stocke l'op�rateur
    this.operateur = ope;

    //Si l'op�rateur n'est pas =
    if(!ope.equals("=")){
      //On r�initialise l'op�rande
      this.operande = "";
    }    
  }

  //D�finit le nombre
  public void setNombre(String result){
    //On concat�ne le nombre 
    this.operande += result;
    //On met � jour 
    notifyObserver(this.operande);
  }

  //Force le calcul
  public void getResultat() {
    calcul();
  }

  //R�initialise tout
  public void reset(){
    this.result = 0;
    this.operande = "0";
    this.operateur = "";
    //Mise � jour !
    notifyObserver(String.valueOf(this.result));
  }

  //Calcul
  public void calcul(){
    //S'il n'y a pas d'op�rateur, le r�sultat est le nombre saisi
    if(this.operateur.equals("")){
      this.result = Double.parseDouble(this.operande);
    }
    else{
      //Si l'op�rande n'est pas vide, on calcule avec l'op�rateur de calcul 
      if(!this.operande.equals("")){
        if(this.operateur.equals("+"))
          this.result += Double.parseDouble(this.operande);
        if(this.operateur.equals("-"))
          this.result -= Double.parseDouble(this.operande);
        if(this.operateur.equals("*"))
          this.result *= Double.parseDouble(this.operande);          
        if(this.operateur.equals("/")){
          try{
            this.result /= Double.parseDouble(this.operande);
          }catch(ArithmeticException e){
            this.result = 0;
          }
        }
      }
    }
    this.operande = "";
    //On lance aussi la mise � jour !
    notifyObserver(String.valueOf(this.result));
  }
}
