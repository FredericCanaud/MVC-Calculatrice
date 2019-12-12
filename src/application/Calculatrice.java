package application;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

@SuppressWarnings("serial")
public class Calculatrice extends JFrame {
	
	private JPanel superConteneur;
	private JPanel chiffres;
	private JPanel operateurs;
	private JPanel panEcran;
	
	private JLabel nombreAffiche;
	private JButton zero;
	private JButton un;
	private JButton deux;
	private JButton trois;
	private JButton quatre;
	private JButton cinq;
	private JButton six;
	private JButton sept;
	private JButton huit;
	private JButton neuf;
	
	
	private JButton addition;
	private JButton soustraction;
	private JButton multiplication;
	private JButton division;
	private JButton egal;
	private JButton annule;
	private JButton virgule;

	private String addString;
	private String subString;
	private String multiString;
	private String divString;
	private String finalString;
	private double nombreAAdditionner;
	private double nombreASoustraire;
	private double nombreAMultiplier;
	private double nombreADiviser;
	private double nombreFinal;
	private double resultat;
	private String reponseEnChaine;


	public double additionner(double nombre1, double nombre2) {

		return nombre1 + nombre2;
	}

	public double soustraire(double nombre1, double nombre2) {

		return nombre1 - nombre2;
	}

	public double multiplier(double nombre1, double nombre2) {

		return nombre1 * nombre2;
	}

	public double diviser(double nombre1, double nombre2) {

		return nombre1 / nombre2;
	}

	public Calculatrice() {
		
		this.setSize(480, 520);
		this.setTitle("Calculatrice");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    this.setResizable(false);

	    this.superConteneur = new JPanel();
		this.chiffres = new JPanel();
		this.operateurs = new JPanel();
		this.panEcran = new JPanel();
		
	    this.chiffres.setPreferredSize(new Dimension(330, 450));
		this.operateurs.setPreferredSize(new Dimension(110, 450));
	    this.panEcran.setPreferredSize(new Dimension(400, 60));

		
		nombreAffiche = new JLabel("");
		nombreAffiche.setPreferredSize(new Dimension(100, 60));
		nombreAffiche.setFont(new Font("Arial", Font.BOLD, 20));
		
		zero = new JButton("0");
	    zero.setPreferredSize(new Dimension(100, 80));

		un = new JButton("1");
	    un.setPreferredSize(new Dimension(100, 80));

		deux = new JButton("2");
	    deux.setPreferredSize(new Dimension(100, 80));

		trois = new JButton("3");
	    trois.setPreferredSize(new Dimension(100, 80));

		quatre = new JButton("4");
	    quatre.setPreferredSize(new Dimension(100, 80));

		cinq = new JButton("5");
	    cinq.setPreferredSize(new Dimension(100, 80));

		six = new JButton("6");
	    six.setPreferredSize(new Dimension(100, 80));

		sept = new JButton("7");
	    sept.setPreferredSize(new Dimension(100, 80));

		huit = new JButton("8");
	    huit.setPreferredSize(new Dimension(100, 80));
	
		neuf = new JButton("9");
	    neuf.setPreferredSize(new Dimension(100, 80));

	    virgule = new JButton(".");
	    virgule.setPreferredSize(new Dimension(100, 80));

		egal = new JButton("=");
	    egal.setPreferredSize(new Dimension(100, 80));
	    
	    chiffres.add(un);
	    chiffres.add(deux);
	    chiffres.add(trois);
	    chiffres.add(quatre);
	    chiffres.add(cinq);
	    chiffres.add(six);
	    chiffres.add(sept);
	    chiffres.add(huit);
	    chiffres.add(neuf);
	    chiffres.add(virgule);
	    chiffres.add(zero);
	    chiffres.add(egal);
	    
		addition = new JButton("+");
	    addition.setPreferredSize(new Dimension(100, 62));

		soustraction = new JButton("-");
	    soustraction.setPreferredSize(new Dimension(100, 62));

		multiplication = new JButton("x");
	    multiplication.setPreferredSize(new Dimension(100, 62));

		division = new JButton("÷");
	    division.setPreferredSize(new Dimension(100, 62));		

		annule = new JButton("C");
	    annule.setPreferredSize(new Dimension(100, 62));

	    operateurs.add(addition);
	    operateurs.add(soustraction);
	    operateurs.add(multiplication);
	    operateurs.add(division);
	    operateurs.add(annule);
	    
	    panEcran.add(nombreAffiche);
	    panEcran.setBorder(BorderFactory.createLineBorder(Color.black));

	    superConteneur.add(panEcran, BorderLayout.NORTH);
	    superConteneur.add(chiffres, BorderLayout.CENTER);
	    superConteneur.add(operateurs, BorderLayout.EAST);
	    this.setContentPane(superConteneur);
	    this.setVisible(true);

		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				nombreAffiche.setText(nombreAffiche.getText() + "0");

			}

		});

		un.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				nombreAffiche.setText(nombreAffiche.getText() + "1");

			}

		});

		deux.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				nombreAffiche.setText(nombreAffiche.getText() + "2");

			}

		});

		trois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				nombreAffiche.setText(nombreAffiche.getText() + "3");

			}

		});

		quatre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				nombreAffiche.setText(nombreAffiche.getText() + "4");

			}

		});

		cinq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				nombreAffiche.setText(nombreAffiche.getText() + "5");

			}

		});

		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				nombreAffiche.setText(nombreAffiche.getText() + "6");

			}

		});

		sept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				nombreAffiche.setText(nombreAffiche.getText() + "7");

			}

		});

		huit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				nombreAffiche.setText(nombreAffiche.getText() + "8");

			}

		});

		neuf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				nombreAffiche.setText(nombreAffiche.getText() + "9");

			}

		});

		addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				addString = nombreAffiche.getText();
				nombreAAdditionner = Double.parseDouble(addString);
				nombreAffiche.setText("");

			}

		});

		soustraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				subString = nombreAffiche.getText();
				nombreASoustraire = Double.parseDouble(subString);
				nombreAffiche.setText("");
				virgule.setEnabled(true);

			}

		});

		multiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				multiString = nombreAffiche.getText();
				nombreAMultiplier = Double.parseDouble(multiString);
				nombreAffiche.setText("");
				virgule.setEnabled(true);

			}

		});

		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				divString = nombreAffiche.getText();
				nombreADiviser = Double.parseDouble(divString);
				nombreAffiche.setText("");
				virgule.setEnabled(true);
			}

		});


		virgule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				nombreAffiche.setText(nombreAffiche.getText() + ".");
				String numDisplayContents = nombreAffiche.getText();

				if (numDisplayContents.contains(".")) {
					virgule.setEnabled(false);
				}

			}

		});
		annule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				nombreAffiche.setText("");
				addString = null;
				subString = null;
				multiString = null;
				divString = null;
				finalString = null;
			}

		});

		egal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				finalString = nombreAffiche.getText();
				nombreFinal = Double.parseDouble(finalString);

				if (addString != null) {
					resultat = additionner(nombreAAdditionner, nombreFinal);
					reponseEnChaine = Double.toString(resultat);
					nombreAffiche.setText(reponseEnChaine);

				} else if (subString != null) {
					resultat = soustraire(nombreASoustraire, nombreFinal);
					reponseEnChaine = Double.toString(resultat);
					nombreAffiche.setText(reponseEnChaine);

				} else if (multiString != null) {
					resultat = multiplier(nombreAMultiplier, nombreFinal);
					reponseEnChaine = Double.toString(resultat);
					nombreAffiche.setText(reponseEnChaine);

				} else if (divString != null) {
					resultat = diviser(nombreADiviser, nombreFinal);
					reponseEnChaine = Double.toString(resultat);
					nombreAffiche.setText(reponseEnChaine);

				} else {
					addString = null;
					subString = null;
					multiString = null;
					divString = null;
				}
			}

		});
	}
	public static void main(String[] args) {

	    Calculatrice calc = new Calculatrice();
	    calc.pack();
	   }
}