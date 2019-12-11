package view;

import controler.ButtonHandler;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
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
	private GridPane boutons;
	private VBox boutonOperation;
	
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
	

	public void start(Stage primaryStage) throws Exception {
		
		initialisation();
		
		positionning();
		
		Scene scene = new Scene(this.superConteneur,400,500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Calculatrice");
		primaryStage.show();
	}
	
	private void initialisation() {
		
		// Initialisation des conteneurs
		this.superConteneur=new VBox();
		this.conteneurBouton=new HBox();
		this.resultat=new HBox();
		this.boutons=new GridPane();
		this.boutonOperation=new VBox();
		
		//Initialisation affichage
		this.affichage=new Label("");
		
		// Initialisation des boutons
		this.un=new Button("1");
		un.setOnMouseClicked(new ButtonHandler(un, affichage));
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
	}
	
	private void positionning() {
		
		resultat.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		resultat.setPrefSize(300, 75);
		
		boutons.setPrefSize(300,400);
		boutons.setAlignment(Pos.CENTER);
		
		boutonOperation.setPrefSize(100,425);
		boutonOperation.setSpacing(12.0);
		boutonOperation.setAlignment(Pos.CENTER);

		//Grille des boutons
		boutons.add(un, 0, 0);  // A extraire en méthode mais un peu chiant
		boutons.add(deux, 1, 0);
		boutons.add(trois, 2, 0);
		boutons.add(quatre, 0, 1);
		boutons.add(cinq, 1, 1);
		boutons.add(six, 2, 1);
		boutons.add(sept, 0, 2);
		boutons.add(huit, 1, 2);
		boutons.add(neuf, 2, 2);
		boutons.add(zero,0,3);
		boutons.add(virgule, 1, 3);
		boutons.add(egale, 2, 3);
		
		resultat.getChildren().add(affichage);
		boutonOperation.getChildren().addAll(annule,addition,soustraction,multiplication,division);
		conteneurBouton.getChildren().addAll(boutons,boutonOperation);

		boutons.setHgap(20);
		boutons.setVgap(20);
		
		un.setPrefSize(75,75); // À mettre sous forme de liste avec un List<Button> + décaler la liste dans modèle
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
		
		annule.setMinSize(60,60); // La même qu'au dessus
		addition.setPrefSize(60,60);
		soustraction.setPrefSize(60,60);
		multiplication.setPrefSize(60,60);
		division.setPrefSize(60,60);
		
		
		
		superConteneur.getChildren().addAll(resultat,conteneurBouton);
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
