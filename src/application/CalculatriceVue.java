package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CalculatriceVue extends Application
{
	//Conteneurs
	private VBox superConteneur;
	private HBox resultat;
	private HBox conteneurBouton;
	private GridPane bouton;
	private VBox boutonCalcul;
	
	//Boutons
	private Button un;
	private Button deux;
	private Button trois;
	private Button quatre;
	private Button cinq;
	private Button six;
	private Button sept;
	private Button huit;
	private Button neuf;
	private Button zero;
	private Button virgule;
	private Button egale;
	private Button annule;
	private Button addition;
	private Button soustraction;
	private Button multiplication;
	private Button division;
	
	//Affichage
	private Label affichage;
	

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		// Initialisation des conteneurs
		this.superConteneur=new VBox();
		this.conteneurBouton=new HBox();
		this.resultat=new HBox();
		this.bouton=new GridPane();
		this.boutonCalcul=new VBox();
		
		//Initialisation affichage
		this.affichage=new Label("");
		
		// Initialisation des boutons
		this.un=new Button("1");
		this.deux=new Button("2");
		this.trois=new Button("3");
		this.quatre=new Button("4");
		this.cinq=new Button("5");
		this.six=new Button("6");
		this.sept=new Button("7");
		this.huit=new Button("8");
		this.neuf=new Button("9");
		this.zero=new Button("0");
		this.virgule=new Button(".");
		this.egale=new Button("=");
		this.annule=new Button("C");
		this.addition=new Button("+");
		this.soustraction=new Button("-");
		this.multiplication=new Button("*");
		this.division=new Button("/");
		
		resultat.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		resultat.setPrefSize(300, 75);
		bouton.setPrefSize(500,400);

		//Grille des boutons
		bouton.add(un, 0, 0);
		bouton.add(deux, 1, 0);
		bouton.add(trois, 2, 0);
		bouton.add(quatre, 0, 1);
		bouton.add(cinq, 1, 1);
		bouton.add(six, 2, 1);
		bouton.add(sept, 0, 2);
		bouton.add(huit, 1, 2);
		bouton.add(neuf, 2, 2);
		bouton.add(zero,0,3);
		bouton.add(virgule, 1, 3);
		bouton.add(egale, 2, 3);
		
		resultat.getChildren().add(affichage);
		boutonCalcul.getChildren().addAll(annule,addition,soustraction,multiplication,division);
		conteneurBouton.getChildren().addAll(bouton,boutonCalcul);

		bouton.setHgap(20);
		bouton.setVgap(20);
		
		un.setPrefSize(75,75);
		deux.setPrefSize(75,75);
		trois.setPrefSize(75,75);
		quatre.setPrefSize(75,75);
		cinq.setPrefSize(75,75);
		six.setPrefSize(75,75);
		sept.setPrefSize(75,75);
		huit.setPrefSize(75,75);
		neuf.setPrefSize(75,75);
		zero.setPrefSize(75,75);
		virgule.setPrefSize(75,75);
		egale.setPrefSize(75,75);
		
		annule.setMinSize(75,75);
		addition.setPrefSize(75,75);
		soustraction.setPrefSize(75,75);
		multiplication.setPrefSize(75,75);
		division.setPrefSize(75,75);
		
		
		
		superConteneur.getChildren().addAll(resultat,conteneurBouton);
		
		Scene scene = new Scene(this.superConteneur,400,500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Calculatrice");
		primaryStage.show();
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}

}
