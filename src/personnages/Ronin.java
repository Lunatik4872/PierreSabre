package personnages;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boisson_fav, int argent) {
		super(nom, boisson_fav, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int argent = (10*this.getArgent())/100;
		parler(beneficiaire.getNom()+" prend ces "+argent+" sous.");
		this.perdreArgent(argent);
		beneficiaire.recevoir(argent);
		honneur++;
	}
}
