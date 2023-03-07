package personnages;

public class Gaulois {
	
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
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
		return "Le Gaulois "+nom+":";

	}
	
	public void frapper(Romain romain ) {
		System.out.println(nom+"envoie un grand coup dans la machoire de" + romain.getNom());
		romain.recevoirCoup(force/3);
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	
	

	public static void main(String[] args) {
		System.out.println("debutGaulois");
		Gaulois asterix;
		asterix = new Gaulois("Ast�rix", 8);
		System.out.println(asterix.getNom());
		System.out.println(asterix.prendreParole());
		asterix.parler("Bonjour");
		Romain cesar;
		cesar = new Romain("C�sar", 7);
		asterix.frapper(cesar);
		
		
	}
	

	
}
