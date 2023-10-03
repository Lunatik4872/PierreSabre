package personnages;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boisson_fav, int argent) {
		super(nom, boisson_fav, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		
		int argent = (10*this.getArgent())/100;
		if(argent > 0) {
			parler(beneficiaire.getNom()+" prend ces "+argent+" sous.");
			this.perdreArgent(argent);
			beneficiaire.recevoir(argent);
			honneur++;
		}
		else {
			parler("Je n'ai plus d'argent sur moi");
		}
	}
	
	public void provoquer(Yakuza adversaire){
		int force = honneur*2;
		this.parler("Je t'ai retrouve vermine, tu vas payer pour ce que tu as fait a ce pauvre marchand!");
		
		if(force >= adversaire.getReputation()) {
			this.parler("Je t'ai eu petit yakusa!");
			this.gagnerArgent(adversaire.getArgent());
			adversaire.perdre();
			honneur++;	
		}
		else {
			honneur--;
			int argent = this.getArgent();
			this.perdreArgent(argent);
			this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(argent);
		}
		
	}
}
