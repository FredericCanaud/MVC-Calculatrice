package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controleur.ControleurAbstrait;
import modele.Observateur;

public class VueCalculatrice extends JFrame implements Observateur {
	private static final long serialVersionUID = 1L;

	private JPanel superConteneur;
	private JPanel chiffres;
	private JPanel operateurs;
	private JPanel affichage;

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

	private ControleurAbstrait controleur;

	public VueCalculatrice(ControleurAbstrait controleur) {

		this.setSize(500, 520);
		this.setTitle("Calculatrice");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		this.controleur = controleur;
	}

	public void initialisation() {
		this.superConteneur = new JPanel();
		this.chiffres = new JPanel();
		this.operateurs = new JPanel();
		this.affichage = new JPanel();

		this.chiffres.setPreferredSize(new Dimension(330, 450));
		this.operateurs.setPreferredSize(new Dimension(110, 450));
		this.affichage.setPreferredSize(new Dimension(440, 120));

		nombreAffiche = new JLabel();
		nombreAffiche.setText("0");
		nombreAffiche.setPreferredSize(new Dimension(125, 100));
		nombreAffiche.setFont(new Font("Arial", Font.BOLD, 24));

		zero = new JButton("0");
		zero.setPreferredSize(new Dimension(100, 80));
		zero.addActionListener(new ChiffreListener());

		un = new JButton("1");
		un.setPreferredSize(new Dimension(100, 80));
		un.addActionListener(new ChiffreListener());

		deux = new JButton("2");
		deux.setPreferredSize(new Dimension(100, 80));
		deux.addActionListener(new ChiffreListener());

		trois = new JButton("3");
		trois.setPreferredSize(new Dimension(100, 80));
		trois.addActionListener(new ChiffreListener());

		quatre = new JButton("4");
		quatre.setPreferredSize(new Dimension(100, 80));
		quatre.addActionListener(new ChiffreListener());

		cinq = new JButton("5");
		cinq.setPreferredSize(new Dimension(100, 80));
		cinq.addActionListener(new ChiffreListener());

		six = new JButton("6");
		six.setPreferredSize(new Dimension(100, 80));
		six.addActionListener(new ChiffreListener());

		sept = new JButton("7");
		sept.setPreferredSize(new Dimension(100, 80));
		sept.addActionListener(new ChiffreListener());

		huit = new JButton("8");
		huit.setPreferredSize(new Dimension(100, 80));
		huit.addActionListener(new ChiffreListener());

		neuf = new JButton("9");
		neuf.setPreferredSize(new Dimension(100, 80));
		neuf.addActionListener(new ChiffreListener());

		virgule = new JButton(".");
		virgule.setPreferredSize(new Dimension(100, 80));

		egal = new JButton("=");
		egal.setPreferredSize(new Dimension(100, 80));
		egal.addActionListener(new OperateurListener());

		addition = new JButton("+");
		addition.setPreferredSize(new Dimension(100, 62));
		addition.addActionListener(new OperateurListener());

		soustraction = new JButton("-");
		soustraction.setPreferredSize(new Dimension(100, 62));
		soustraction.addActionListener(new OperateurListener());

		multiplication = new JButton("x");
		multiplication.setPreferredSize(new Dimension(100, 62));
		multiplication.addActionListener(new OperateurListener());

		division = new JButton("÷");
		division.setPreferredSize(new Dimension(100, 62));
		division.addActionListener(new OperateurListener());

		annule = new JButton("C");
		annule.setPreferredSize(new Dimension(100, 62));
		annule.addActionListener(new ResetListener());

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

		operateurs.add(addition);
		operateurs.add(soustraction);
		operateurs.add(multiplication);
		operateurs.add(division);
		operateurs.add(annule);

		affichage.add(nombreAffiche);
		affichage.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		superConteneur.add(affichage, BorderLayout.NORTH);
		superConteneur.add(chiffres, BorderLayout.CENTER);
		superConteneur.add(operateurs, BorderLayout.EAST);
		this.setContentPane(superConteneur);
	}

	class ChiffreListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			controleur.definirNombre(((JButton) e.getSource()).getText());
		}
	}

	class OperateurListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			controleur.definirOperateur(((JButton) e.getSource()).getText());
		}
	}

	class ResetListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			controleur.reinitialiser();
		}
	}

	@Override
	public void notifier(String chaine) {
		this.nombreAffiche.setText(chaine);

	}
}
