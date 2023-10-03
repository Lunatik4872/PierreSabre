package personnages;

public class Humain {
	
	private String nom;
	private String boisson_fav;
	private int argent;
	
	public Humain(String nom, String boisson_fav, int argent) {
		super();
		this.nom = nom;
		this.boisson_fav = boisson_fav;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte){
		System.out.println(texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+nom+ " et j'aime boire du "+boisson_fav);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+boisson_fav+"! GLOUPS !");
	}
	
	public void gagnerArgent(int gain){
		argent+=gain;
	}
	
	public void perdreArgent(int perte) {
		argent-=perte;
	}
	
	public void acheter(String bien, int prix) {
		if(prix <= argent) {
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir "+bien+" a "+prix+" sous");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux meme pas m'offrir "+bien+" a "+prix+" sous");
		}
	}
	
}
