package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boisson_fav, int argent) {
		super(nom, boisson_fav, argent);
	}
	
	public int seFaireExtorquer() {
		int vole = this.getArgent();
		this.perdreArgent(vole);
		this.parler("J'ai tout perdu ! Le monde est trop injuste...");
		return vole;
	}
	
	public void recevoir(int argent) {
		this.gagnerArgent(argent);
		this.parler(argent + " sous ! Je te remercie genereux donateur!");
	}
}
