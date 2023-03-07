package personnages;

import sun.applet.Main;

public class Romain {

	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "�" + texte + "�");

	}

	private String prendreParole() {
		return "Le Romain" + nom + ":";

	}

	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("A�e");
		} else {
			parler("J'abandonne...");
		}
	}

	public static void main(String[] args) {
		Romain cesar;
		cesar = new Romain("C�sar", 7);
		System.out.println(cesar.getNom());
		System.out.println(cesar.prendreParole());
		cesar.parler("Wsh les gars");
		cesar.recevoirCoup(5);
	}
}
