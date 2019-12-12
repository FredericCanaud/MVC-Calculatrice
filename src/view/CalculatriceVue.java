package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculatriceVue extends JFrame
{
private static final long serialVersionUID = 1L;
	
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

	public CalculatriceVue() {
		
		this.setSize(500, 520);
		this.setTitle("Calculatrice");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    this.setResizable(false);
	    this.setVisible(true);

	    this.superConteneur = new JPanel();
		this.chiffres = new JPanel();
		this.operateurs = new JPanel();
		this.panEcran = new JPanel();
		
	    this.chiffres.setPreferredSize(new Dimension(330, 450));
		this.operateurs.setPreferredSize(new Dimension(110, 450));
	    this.panEcran.setPreferredSize(new Dimension(440, 60));

		
		nombreAffiche = new JLabel("");
		nombreAffiche.setPreferredSize(new Dimension(125, 100));
		nombreAffiche.setHorizontalAlignment(JLabel.RIGHT);
		nombreAffiche.setFont(new Font("Arial", Font.BOLD, 36));
		
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
	    panEcran.setBorder(BorderFactory.createLineBorder(Color.BLACK));

	    superConteneur.add(panEcran, BorderLayout.NORTH);
	    superConteneur.add(chiffres, BorderLayout.CENTER);
	    superConteneur.add(operateurs, BorderLayout.EAST);
	    this.setContentPane(superConteneur);
	}
}
